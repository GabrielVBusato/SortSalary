/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.services;

import com.system.business.sorting.SortOrder;
import com.system.business.sorting.SortStrategy;
import com.system.exceptions.EmptyListException;
import java.util.List;

/**
 *
 * @author busat
 */
public class SortService {

    public void applySortAlgorithm(SortStrategy strategy, List<String> list, SortOrder order) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException();
        }

        strategy.sort(list, order);
    }
}
