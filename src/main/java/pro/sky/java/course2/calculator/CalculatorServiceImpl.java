package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int sumNums(int num, int num1) {
        return num + num1;
    }

    public int subtractNums(int num, int num1) {
        return num + num1;
    }

    public int multiplyNums(int num, int num1) {
        return num * num1;
    }

    public double divideNums(int num, int num1) {
        return (double) num / (double) num1;
    }
}
