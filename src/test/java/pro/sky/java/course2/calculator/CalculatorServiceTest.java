package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exception.IllegalArgumentException;
import pro.sky.java.course2.calculator.service.CalculatorService;
import pro.sky.java.course2.calculator.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    int num0 = 0;
    int num1 = 5;
    int num2 = 5;

    @Test
    void sumNums() {
        int result = num1 + num2;
        assertEquals(result, calculatorService.sumNums(num1, num2));
    }

    @Test
    void subtractNums() {
        int result = num1 - num2;
        assertEquals(result, calculatorService.subtractNums(num1, num2));
    }

    @Test
    void multiplyNums() {
        int result = num1 * num2;
        assertEquals(result, calculatorService.multiplyNums(num1, num2));
    }

    @Test
    void divideNums() {
        int result = num1 / num2;
        assertEquals(result, calculatorService.divideNums(num1, num2));
    }

    @Test
    void divideNumsByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divideNums(num1, num0));
    }

}