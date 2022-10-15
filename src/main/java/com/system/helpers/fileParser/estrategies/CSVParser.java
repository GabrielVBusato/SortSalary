/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.helpers.fileParser.estrategies;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;
import com.system.helpers.fileParser.FileStrategy;

/**
 *
 * @author busat
 */
public class CSVParser implements FileStrategy {

    String path;

    public CSVParser(String path){
        this.path = path;
    }
    
    /**
     *
     * @return
     */
    @Override
    public List parseFileToApplicationData() {
        Reader reader;
        try {
            reader = Files.newBufferedReader(Paths.get(this.path));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            return csvReader.readAll();
        } catch (IOException | CsvException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao carregar CSV");
        }
        return null;
    }
}
