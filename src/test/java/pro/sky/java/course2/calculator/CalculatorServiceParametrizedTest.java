package pro.sky.java.course2.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculator.service.CalculatorService;
import pro.sky.java.course2.calculator.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametrizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        int num1 = 5;
        int num2 = 7;

        return Stream.of(
                Arguments.of(num1, num1),
                Arguments.of(num1, num2),
                Arguments.of(num2, num2),
                Arguments.of(num2, num1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void sumNums(int num1, int num2) {
        assertEquals(num1 + num2, calculatorService.sumNums(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void subtractNums(int num1, int num2) {
        assertEquals(num1 - num2, calculatorService.subtractNums(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiplyNums(int num1, int num2) {
        assertEquals(num1 * num2, calculatorService.multiplyNums(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divideNums(int num1, int num2) {
        assertEquals((double) num1 / (double) num2, calculatorService.divideNums(num1, num2));
    }
}
