/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.helpers.sorting;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author busat
 */
public class SortHelper {

    public static void applySortAlgorithm(SortStrategy strategy, List<Float> disorderedList) {
        if (disorderedList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
            return;
        }
        try {
            strategy.sort(disorderedList);
        } catch (ClassCastException error) {
            JOptionPane.showMessageDialog(null, "Erro ao ordenar lista");
        }
    }
}
