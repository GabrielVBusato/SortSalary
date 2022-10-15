package com.system.helpers.sorting.estrategies;

import com.system.helpers.sorting.SortStrategy;
import java.util.List;

/**
 *
 * @author busat
 */
public class BubbleSort implements SortStrategy {

    @Override
    public void sort(List<Float> disorderedList) {
        for (int i = 0; i < disorderedList.size() - 1; i++) {
            for (int j = 0; j < disorderedList.size() - 1 - i; j++) {
                if (disorderedList.get(j) > disorderedList.get(j + 1)) {
                    Float aux = disorderedList.get(j);
                    disorderedList.set(j, disorderedList.get(j + 1));
                    disorderedList.set(j + 1, aux);
                }
            }
        }
    }
}
