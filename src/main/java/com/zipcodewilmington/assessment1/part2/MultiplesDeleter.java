package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] odds = new Integer[ints.length];
        Integer oddIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                odds[oddIndex] = ints[i];
                oddIndex++;
            }
        }
        return Arrays.copyOf(odds, oddIndex);

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] evens = new Integer[ints.length];
        Integer evenIndex = 0;

        for(int i =0;i<ints.length;i++) {
            if (ints[i] % 2 == 0) {
                evens[evenIndex] = ints[i];
                evenIndex++;
            }
        }
        return Arrays.copyOf(evens, evenIndex);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] temp = new Integer[ints.length];
        Integer tempIndex =0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                temp[tempIndex] = ints[i];
                tempIndex++;
            }
        }
        return Arrays.copyOf(temp, tempIndex);
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] temp = new Integer[ints.length];
        Integer tempIndex =0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                temp[tempIndex] = ints[i];
                tempIndex++;
            }
        }
        return Arrays.copyOf(temp, tempIndex++);
    }
}
