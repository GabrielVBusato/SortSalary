/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.helpers.fileParser;

import java.util.List;

/**
 *
 * @author busat
 */
public class FileHelper {
    public List getDataFromFile(FileStrategy strategy) {
        return strategy.parseFileToApplicationData();
    }
}
