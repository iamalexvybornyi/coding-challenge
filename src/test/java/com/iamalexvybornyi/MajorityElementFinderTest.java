package com.iamalexvybornyi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MajorityElementFinderTest {

    @MethodSource("provideTestData")
    @ParameterizedTest
    public void majorityFinderBasicTest(int[] input, int expectedResult) {
        MajorityElementFinder majorityElementFinder = new MajorityElementFinder();
        int actualResult = majorityElementFinder.findMajorityElement(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 2, 2, 1, 3, 3}, 2),
                Arguments.of(new int[]{4, 2, 4}, 4),
                Arguments.of(new int[]{3, 3, 1, 1, 1, 3, 3}, 3),
                Arguments.of(new int[]{}, -1)
        );
    }
}
