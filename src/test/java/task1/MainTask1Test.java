package task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTask1Test {

    @Test
    public void findMaxValue() {
        int[][] array = {{2, 4, 2, 1},
                        {4, 2, 1, 10},
                        {2, 1, 10, 12},
                        {1, 10, 12, 14}};
        int maxValue = MainTask1.findMaxValue(array);
        int maxValueExpect = 14;
        Assert.assertEquals(maxValue, maxValueExpect);
    }

    @Test
    public void findMinValue() {
        int[][] array = {{2, 4, 2, 1},
                        {4, 2, 1, 10},
                        {2, 1, 10, 12},
                        {1, 10, 12, 14}};
        int minValue = MainTask1.findMinValue(array);
        int minValueExpect = 1;
        Assert.assertEquals(minValue, minValueExpect);
    }

    @Test
    public void findAverageValue() {
        int[][] array = {{2, 4, 2, 1},
                        {4, 2, 1, 10},
                        {2, 1, 10, 12},
                        {1, 10, 12, 14}};
        double maxValue = MainTask1.findAverageValue(array);
        double maxValueExpect = 5.5;
        Assert.assertEquals(maxValue, maxValueExpect, 1e-15);
    }
}