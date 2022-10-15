/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.presenter;

import com.system.components.ComboStrategyItem;
import com.system.helpers.fileParser.FileStrategy;
import com.system.helpers.fileParser.estrategies.CSVParser;
import com.system.helpers.ordering.OrderList;
import com.system.helpers.sorting.SortHelper;
import com.system.helpers.sorting.estrategies.SelectionSort;
import com.system.view.SortView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import com.system.helpers.sorting.SortStrategy;
import com.system.helpers.sorting.estrategies.BubbleSort;
import java.util.ArrayList;
import javax.swing.ListModel;

/**
 *
 * @author busat
 */
public class SortPresenter {

    private final SortView view;
    private static FileStrategy fileStrategy;
    private static SortStrategy sortStrategy;

    public SortPresenter() {
        view = new SortView();
        setFileStrategy(new CSVParser("src/main/java/com/system/CSVDocuments/salarios.csv"));
        setSortStrategy(new SelectionSort());
        initComponents();
    }

    private void initComponents() {
        view.getCmbMetodo().addItem(new ComboStrategyItem(new SelectionSort(), "Selection"));
        view.getCmbMetodo().addItem(new ComboStrategyItem(new BubbleSort(), "Bubble"));

        view.getBtnCarregarArquivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String[]> salarys = fileStrategy.parseFileToApplicationData();
                DefaultListModel salaryListModel = new DefaultListModel();
                for (String[] salary : salarys) {
                    salaryListModel.addElement(salary[0]);
                }
                view.getLstSemOrdem().setModel(salaryListModel);
            }
        });

        view.getBtnOrdenar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String order = view.getButtonGroup1().getSelection().getActionCommand();
                ListModel<String> salaryListModel = view.getLstSemOrdem().getModel();
                List<Float> salaryList = new ArrayList<>();
                for (int i = 0; i < salaryListModel.getSize(); i++) {
                    String salaryValue = salaryListModel.getElementAt(i);
                    salaryList.add(Float.valueOf(salaryValue));
                }
                DefaultListModel ordenedSalaryListModel = new DefaultListModel();
                long startTime = System.currentTimeMillis();
                SortHelper.applySortAlgorithm(sortStrategy, salaryList);
                OrderList.setOrder(order, salaryList);
                for (Float salary : salaryList) {
                    ordenedSalaryListModel.addElement(salary);
                }
                view.getLstOrdenados().setModel(ordenedSalaryListModel);
                long estimatedTime = System.currentTimeMillis() - startTime;
                view.getLblTempo().setText(Long.toString(estimatedTime));
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

    public static void setFileStrategy(FileStrategy strategy) {
        fileStrategy = strategy;
    }

    public static void setSortStrategy(SortStrategy strategy) {
        sortStrategy = strategy;
    }

}
