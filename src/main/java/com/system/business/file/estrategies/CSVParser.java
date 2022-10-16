/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.business.file.estrategies;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.system.business.file.FileReaderStrategy;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author busat
 */
public class CSVParser implements FileReaderStrategy {

    String path;

    public CSVParser(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     * @throws java.io.IOException
     * @throws com.opencsv.exceptions.CsvException
     */
    @Override
    public List<String> parse() throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get(this.path));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        return csvReader.readAll().stream()
                .flatMap(array -> Arrays.asList(array).stream())
                .collect(Collectors.toList());
    }
}
