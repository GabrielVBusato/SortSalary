package com.system.business.sorting.estrategies;

import com.system.business.sorting.SortOrder;
import java.util.List;
import com.system.business.sorting.SortStrategy;
import java.util.Collections;

/**
 *
 * @author busat
 */
public class SelectionSort implements SortStrategy {

    @Override
    public void sort(List<String> list, SortOrder order) {
        for (int i = 0; i < list.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (Float.valueOf(list.get(j)) < Float.valueOf(list.get(index))) {
                    index = j;
                }
            }
            String smallerNumber = list.get(index);
            list.set(index, list.get(i));
            list.set(i, smallerNumber);
        }

        if (order.equals(SortOrder.DESC)) {
            Collections.reverse(list);
        }
    }
}
