package com.adneom.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class
 */
public class Utils {


    /**
     * Returns a list of sub-list, where each sub-list has maxSize elements.
     *
     * @param listToPartition A list of objects to be partitioned
     * @param maxSize         max size of the sub-lists
     * @param <T>             Any Type of Object
     * @return List of sub-sublist
     */
    public static <T> List<List<T>> partition(List<T> listToPartition, int maxSize) {
        if (maxSize < 1)
            throw new IllegalArgumentException("maxSize should be > 1 !");

        if (listToPartition == null)
            throw new NullPointerException("listToPartition should not be null !");

        if (maxSize > listToPartition.size())
            throw new IllegalArgumentException("maxSize should be lower than the list size !");

        List<List<T>> result = new ArrayList<>();
        List<T> sublist = new ArrayList<>();

        int i = 0, j;
        while (i < listToPartition.size()) {
            sublist.clear();
            for (j = 0; j < maxSize; j++) {
                if ((j + i) < listToPartition.size())
                    sublist.add(listToPartition.get(i + j));
            }
            result.add(new ArrayList<>(sublist));
            i += maxSize;
        }
        return result;
    }

}
