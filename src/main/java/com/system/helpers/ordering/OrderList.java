/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.helpers.ordering;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author busat
 */
public class OrderList {

    public static void setOrder(String order, List list) {
        switch (order) {
            case "asc":
                Collections.sort(list);
                break;
            case "desc":
                Collections.sort(list, Collections.reverseOrder());
                break;
            default:
                throw new AssertionError();
        }
    }
}
