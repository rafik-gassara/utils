package com.adneom.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test Class for Utility Class Utils
 */
public class UtilsTest {


    @Test
    public void partition_positive_scenario_1() {
        List<List<Integer>> partition = Utils.partition(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8), 2);
        assertNotNull(partition);
        assertEquals(5, partition.size());
        assertEquals(1, partition.get(4).size());
    }


    @Test
    public void partition_positive_scenario_2() {
        List<List<Integer>> partition = Utils.partition(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7), 4);
        assertNotNull(partition);
        assertEquals(2, partition.size());
        assertEquals(4, partition.get(1).size());
    }

    @Test(expected = NullPointerException.class)
    public void partition_negative_scenario_1() {
        Utils.partition(null, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partition_negative_scenario_2() {
        Utils.partition(Arrays.asList(0, 1, 2, 3, 4), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partition_negative_scenario_3() {
        Utils.partition(Arrays.asList(0, 1, 2, 3, 4, 5), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partition_negative_scenario_4() {
        Utils.partition(new ArrayList<>(), 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void partition_negative_scenario_6() {
        final List<List<Integer>> partition = Utils.partition(Arrays.asList(0, 1, 2, 3, 4), 1);
        partition.get(6);
    }
}