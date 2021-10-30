package proskyjavacourse2.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorServiceImpl;

    public CalculatorController(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorServiceImpl.helloCalculator();
    }

    @GetMapping("/plus")
    public String plusCalculator(@RequestParam("num1") int num, @RequestParam("num2") int num1) {
        return calculatorServiceImpl.plusCalculator(num, num1);
    }

    @GetMapping("/minus")
    public String minusCalculator(@RequestParam("num1") int num, @RequestParam("num2") int num1) {
        return calculatorServiceImpl.minusCalculator(num, num1);
    }

    @GetMapping("/multiply")
    public String multiplyCalculator(@RequestParam("num1") int num, @RequestParam("num2") int num1) {
        return calculatorServiceImpl.multiplyCalculator(num, num1);
    }

    @GetMapping("/divide")
    public String divideCalculator(@RequestParam("num1") int num, @RequestParam("num2") int num1) {
        return calculatorServiceImpl.divideCalculator(num, num1);
    }

}
