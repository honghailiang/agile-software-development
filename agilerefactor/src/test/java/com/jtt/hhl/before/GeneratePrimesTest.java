package com.jtt.hhl.before;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Description: 作用描述
 * @Author: Herman
 * @CreateDate: 2019/5/18 11:35
 */
public class GeneratePrimesTest {

    @Test
    public void generatePrimes() {
        int[] nullArray = GeneratePrimes.generatePrimes(0);
        assertEquals(nullArray.length, 0);

        int[] minArray = GeneratePrimes.generatePrimes(2);
        assertEquals(minArray.length, 1);
        assertEquals(minArray[0], 2);

        int[] threeArray = GeneratePrimes.generatePrimes(3);
        assertEquals(threeArray.length, 2);
        assertEquals(threeArray[0], 2);
        assertEquals(threeArray[1], 3);

        int[] centArray = GeneratePrimes.generatePrimes(100);
        assertEquals(centArray.length, 25);
        assertEquals(centArray[24], 97);
    }
}