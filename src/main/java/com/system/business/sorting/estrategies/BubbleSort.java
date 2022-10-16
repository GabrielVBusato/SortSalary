package com.system.business.sorting.estrategies;

import com.system.business.sorting.SortOrder;
import com.system.business.sorting.SortStrategy;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author busat
 */
public class BubbleSort implements SortStrategy {

    @Override
    public void sort(String[] list, SortOrder order) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println(i);
            for (int j = 0; j < n - i - 1; j++) {
                if (Float.valueOf(list[j]) > Float.valueOf(list[j + 1])) {
                    String temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        
        if (order.equals(SortOrder.DESC)) {
            Collections.reverse(Arrays.asList(list));
        }
    }
}
