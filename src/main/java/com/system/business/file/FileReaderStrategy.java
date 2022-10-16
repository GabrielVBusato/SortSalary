/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.system.business.file;

import com.opencsv.exceptions.CsvException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author busat
 */
public interface FileReaderStrategy {
    List<String> parse() throws IOException, CsvException;
}
