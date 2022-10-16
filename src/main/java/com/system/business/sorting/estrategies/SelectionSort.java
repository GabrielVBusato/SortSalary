package com.system.business.sorting.estrategies;

import com.system.business.sorting.SortOrder;
import com.system.business.sorting.SortStrategy;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author busat
 */
public class SelectionSort implements SortStrategy {

    @Override
    public void sort(String[] list, SortOrder order) {
        for (int i = 0; i < list.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (Float.valueOf(list[j]) < Float.valueOf(list[index])) {
                    index = j;
                }
            }
            String smallerNumber = list[index];
            list[index] = list[i];
            list[i] = smallerNumber;
        }

        if (order.equals(SortOrder.DESC)) {
            Collections.reverse(Arrays.asList(list));
        }
    }
}
