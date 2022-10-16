package com.system.business.sorting.estrategies;

import com.system.business.sorting.SortOrder;
import com.system.business.sorting.SortStrategy;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author busat
 */
public class BubbleSort implements SortStrategy {

    @Override
    public void sort(List<String> list, SortOrder order) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (Float.valueOf(list.get(j)) > Float.valueOf(list.get(j + 1))) {
                    String aux = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, aux);
                }
            }
        }
        
        if (order.equals(SortOrder.DESC)) {
            Collections.reverse(list);
        }
    }
}
