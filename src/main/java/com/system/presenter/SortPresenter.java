/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.presenter;

import com.opencsv.exceptions.CsvException;
import com.system.components.ComboStrategyItem;
import com.system.business.file.FileReaderStrategy;
import com.system.business.file.estrategies.CSVParser;
import com.system.business.sorting.SortOrder;
import com.system.business.sorting.SortStrategy;
import com.system.business.sorting.estrategies.BubbleSort;
import com.system.business.sorting.estrategies.SelectionSort;
import com.system.exceptions.EmptyListException;
import com.system.services.FileService;
import com.system.services.SortService;
import com.system.view.SortView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author busat
 */
public class SortPresenter {

    private final SortView view;
    private final FileService fileService;
    private final SortService sortService;
    private String[] salarys;

    private FileReaderStrategy fileStrategy;
    private SortStrategy sortStrategy;

    public SortPresenter(FileService fileService, SortService sortService) {
        view = new SortView();
        this.fileService = fileService;
        this.sortService = sortService;
        salarys = new String[0];

        this.fileStrategy = new CSVParser("src/main/resources/csv/salarios.csv");
        this.sortStrategy = new SelectionSort();
        initComponents();
    }

    private void initComponents() {
        view.getCmbMetodo().addItem(new ComboStrategyItem(new SelectionSort(), "Selection"));
        view.getCmbMetodo().addItem(new ComboStrategyItem(new BubbleSort(), "Bubble"));

        view.getBtnCarregarArquivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    salarys = fileService.read(fileStrategy).stream().toArray(String[]::new);
                    DefaultListModel salaryListModel = new DefaultListModel();

                    for (String salary : salarys) {
                        salaryListModel.addElement(salary);
                    }

                    view.getLstSemOrdem().setModel(salaryListModel);
                } catch (IOException | CsvException ex) {
                    JOptionPane.showMessageDialog(null, "Falha ao carregar arquivo");
                }
            }
        });

        view.getBtnOrdenar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    SortOrder sortOrder = SortOrder.valueOf(view.getButtonGroup1().getSelection().getActionCommand());

                    DefaultListModel orderedSalaryListModel = new DefaultListModel();

                    long startTime = System.currentTimeMillis();
                    String[] salaryList = Arrays.copyOf(salarys, salarys.length);
                    
                    sortService.applySortAlgorithm(sortStrategy, salaryList, sortOrder);
                    
                    for (String salary : salaryList) {
                        orderedSalaryListModel.addElement(salary);
                    }

                    view.getLstOrdenados().setModel(orderedSalaryListModel);

                    long estimatedTime = System.currentTimeMillis() - startTime;

                    view.getLblTempo().setText(Long.toString(estimatedTime));
                } catch (EmptyListException ex) {
                    JOptionPane.showMessageDialog(null, "Lista vazia!");
                }
            }
        });

        view.getCmbMetodo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComboStrategyItem selectedItem = (ComboStrategyItem) view.getCmbMetodo().getSelectedItem();
                setSortStrategy(selectedItem.getStrategy());
            }
        });
    }

    public void setFileStrategy(FileReaderStrategy strategy) {
        fileStrategy = strategy;
    }

    public void setSortStrategy(SortStrategy strategy) {
        sortStrategy = strategy;
    }

}
