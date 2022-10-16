/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.components;

import com.system.business.sorting.SortStrategy;

/**
 *
 * @author busat
 */
public class ComboStrategyItem
{
    private final SortStrategy strategy;
    private final String value;

    public ComboStrategyItem(SortStrategy strategy, String value)
    {
        this.strategy = strategy;
        this.value = value;
    }
    
     @Override
    public String toString()
    {
        return this.value;
    }

    public SortStrategy getStrategy()
    {
        return strategy;
    }

    public String getValue()
    {
        return value;
    }
}