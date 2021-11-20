package proskyjavacourse2.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    private final HelloService helloService;

    public CalculatorController(CalculatorService calculatorServiceImpl, HelloService helloServiceImpl) {
        this.calculatorService = calculatorServiceImpl;
        this.helloService = helloServiceImpl;
    }

    @GetMapping
    public String speakHello() {
        return helloService.speakHello();
    }


    @GetMapping("/plus")
    public String plusCalculator(@RequestParam() int num1, @RequestParam() int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sumNums(num1, num2);
    }

    @GetMapping("/minus")
    public String minusCalculator(@RequestParam() int num1, @RequestParam() int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.subtractNums(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyCalculator(@RequestParam() int num1, @RequestParam() int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiplyNums(num1, num2);
    }

    @GetMapping("/divide")
    public String divideCalculator(@RequestParam() int num1, @RequestParam() int num2) {
        if (num2 == 0) {
            return "На " + num2 + " делить нельзя!!!";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.divideNums(num1, num2);
        }
    }

}
