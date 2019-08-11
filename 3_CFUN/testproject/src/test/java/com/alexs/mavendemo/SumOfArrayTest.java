package com.alexs.mavendemo;

import org.junit.Test;

public class SumOfArrayTest {
    @Test
    public void TestArray(){
        int[] arr = {1293327839,2123124124,341241244,4,5};

        int send = SumOfArray.sumOfArray(arr);

        assert send == -537274080;
    }
}
