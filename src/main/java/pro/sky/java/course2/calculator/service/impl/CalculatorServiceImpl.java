package pro.sky.java.course2.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exception.CannotBeDividedByZeroException;
import pro.sky.java.course2.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int sumNums(int num, int num1) {
        return num + num1;
    }

    public int subtractNums(int num, int num1) {
        return num - num1;
    }

    public int multiplyNums(int num, int num1) {
        return num * num1;
    }

    public double divideNums(int num, int num1) {
        if (num1 == 0) {
            throw new CannotBeDividedByZeroException();
        }
        return (double) num / (double) num1;
    }
}
