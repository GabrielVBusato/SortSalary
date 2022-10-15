package com.system.helpers.sorting.estrategies;

import java.util.List;
import com.system.helpers.sorting.SortStrategy;

/**
 *
 * @author busat
 */
public class SelectionSort implements SortStrategy {

    @Override
    public void sort(List<Float> disorderedList) {
        for (int i = 0; i < disorderedList.size() - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < disorderedList.size(); j++){  
                if (disorderedList.get(j) < disorderedList.get(index)){  
                    index = j;
                }  
            }  
            float smallerNumber = disorderedList.get(index);   
            disorderedList.set(index, disorderedList.get(i));  
            disorderedList.set(i, smallerNumber);  
        }  
    } 
}
