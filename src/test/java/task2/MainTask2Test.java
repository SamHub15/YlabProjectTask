package task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task1.MainTask1;

import static org.junit.Assert.*;

public class MainTask2Test {

    int[] array;

    @Before
    public void initTest() {
        array = new int[]{5,6,3,2,5,1,4,9};
    }

    @Test
    public void bubbleSortTest() {
        int[] arraySort = {1,2,3,4,5,5,6,9};
        MainTask2.bubbleSort(array);
        Assert.assertArrayEquals(arraySort, array);
    }

    @Test(timeout = 15)
    public void bubbleSortTestTimeout() {
        int[] arraySort = {1,2,3,4,5,5,6,9};
        MainTask2.bubbleSort(array);
        Assert.assertArrayEquals(arraySort, array);
    }

    @Test
    public void swapTest() {
        int oneValue = array[0];
        int twoValue = array[1];
        MainTask2.swap(oneValue, twoValue, array);
        int twoValueTest = array[0];
        Assert.assertEquals(oneValue, twoValueTest);
    }

}