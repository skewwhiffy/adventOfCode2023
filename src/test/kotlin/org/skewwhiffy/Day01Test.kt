package org.skewwhiffy

import org.assertj.core.api.Assertions.assertThat
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
"""
    )
    fun `calculates calibration values`(source: String, expected: Int) {
        val actual = calculateCalibrationValue(source)

        assertThat(actual).isEqualTo(expected)
    }
}
