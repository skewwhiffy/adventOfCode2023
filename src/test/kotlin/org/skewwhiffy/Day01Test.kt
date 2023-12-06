package org.skewwhiffy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Day01Test {
    @ParameterizedTest
    @CsvSource(
        textBlock = """
1abc2, 12
pqr3stu8vwx, 38
a1b2c3d4e5f, 15
treb7uchet, 77
two1nine, 29
eightwothree, 83
abcone2threexyz, 13
xtwone3four, 24
4nineeightseven2, 42
zoneight234, 14
7pqrstsixteen, 76
"""
    )
    fun `calculates calibration values`(source: String, expected: Int) {
        val actual = calculateCalibrationValue(source)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `calculate solution`() {
        val actual = solution()

        assertThat(actual).isEqualTo(54100)
    }
}
