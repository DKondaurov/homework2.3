package proskyjavacourse2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    int result;

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculator(int num, int num1) {
        result = num + num1;
        return num + " + " + num1 + " = " + result;
    }

    public String minusCalculator(int num, int num1) {
        result = num - num1;
        return num + " - " + num1 + " = " + result;
    }

    public String multiplyCalculator(int num, int num1) {
        result = num * num1;
        return num + " * " + num1 + " = " + result;
    }

    public String divideCalculator(int num, int num1) {
        if (num1 == 0) {
            return "На " + num1 + " делить нельзя";
        } else {
            double result = (double) num / (double) num1;
            return num + " / " + num1 + " = " + result;
        }
    }
}
