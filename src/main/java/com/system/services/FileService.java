/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.services;

import com.opencsv.exceptions.CsvException;
import com.system.business.file.FileReaderStrategy;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author busat
 */
public class FileService {
    public List<String> read(FileReaderStrategy strategy) throws IOException, CsvException {
        return strategy.parse();
    }
}
