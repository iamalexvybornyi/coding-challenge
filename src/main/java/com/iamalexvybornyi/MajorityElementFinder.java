package com.iamalexvybornyi;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementFinder {

    /**
     * Returns the majority element of the array. The majority element is the element that appears the most of the
     * time in the array. The method assumes that the majority element always exists in the array.
     * <p>
     * Example 1:
     * Input: nums = [4,2,4]
     * Output: 4
     * <p>
     * Example 2 :
     * Input: nums = [3,3,1,1,1,3,3]
     * Output: 3
     *
     * @param input - the input array to search the majority element in
     * @return the majority element of the array, -1 in case the array is empty
     */
    public int findMajorityElement(int[] input) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        int currentMajorityElement = -1;
        int currentMajorityElementNumOfOccurrences = 0;

        for (int i = 0; i < input.length; i++) {
            int currentElement = input[i];
            int currentElementNumOfOccurrences = counterMap.getOrDefault(input[i], 0) + 1;
            counterMap.put(currentElement, currentElementNumOfOccurrences);

            if (currentElementNumOfOccurrences > currentMajorityElementNumOfOccurrences) {
                currentMajorityElement = currentElement;
                currentMajorityElementNumOfOccurrences = currentElementNumOfOccurrences;
            }
        }

        return currentMajorityElement;
    }
}
