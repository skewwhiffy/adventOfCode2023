package org.skewwhiffy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Day02Test {
    @ParameterizedTest
    @CsvSource(textBlock = """
Game 1,1       
Game 20,20
""")
    fun `parses game number`(source: String, expected: Int) {
        val actual = parseGameNumber(source)

        assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @MethodSource("testData")
    fun `parses line correctly`(source: String, expected: Game) {
        val actual = parseLine(source)

        assertThat(actual).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun testData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                    Game(
                        1,
                        listOf(
                            GameSelection(red = 4, green = 3),
                            GameSelection(1, 2, 6),
                            GameSelection(green = 2)
                        )
                    )
                )
            )
            /*
                    Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
            Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
            Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
            Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
             */
            TODO()
        }
    }


}