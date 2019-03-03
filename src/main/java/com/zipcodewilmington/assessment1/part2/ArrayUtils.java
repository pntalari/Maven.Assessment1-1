package com.zipcodewilmington.assessment1.part2;

import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (Object s : objectArray) {
            if (s.equals(objectToCount))
                count++;
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int count = getNumberOfOccurrences(objectArray, objectToRemove);
        int newLength = objectArray.length - count;

        Object[] removedArray = Arrays.copyOf(objectArray, newLength);
        int n = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                removedArray[n] = objectArray[i];
                n++;
            }
        }

        return removedArray;

//        Integer count = getNumberOfOccurrences(objectArray, objectToRemove);
//        Object retArr[] = new Object[objectArray.length - count];
//
//        Integer i = 0;
//        for (Object o : objectArray
//        ) {
//            if (!o.equals(objectToRemove)) {
//                retArr[i] = o;
//                i++;
//            }
//        }
//
//        return retArr;

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        Integer mostCount = getNumberOfOccurrences(objectArray, mostCommon);
        for (int i = 1; i < objectArray.length; i++) {
            Object current = objectArray[i];
            Integer currentCount = getNumberOfOccurrences(objectArray, current);

            if (currentCount > mostCount) {
                mostCommon = current;
                mostCount = currentCount;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = objectArray[0];
        Integer leastCount = getNumberOfOccurrences(objectArray, leastCommon);
        for (int i = 1; i < objectArray.length; i++) {
            Object current = objectArray[i];
            Integer currentCount = getNumberOfOccurrences(objectArray, current);

            if (currentCount < leastCount) {
                leastCommon = current;
                leastCount = currentCount;
            }
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer len = objectArray.length + objectArrayToAdd.length;
        Object[] newArr = Arrays.copyOf(objectArray, len);
        Integer j = objectArrayToAdd.length;
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            newArr[j] = objectArrayToAdd[i];
            j++;
        }

        return newArr;
    }
}
