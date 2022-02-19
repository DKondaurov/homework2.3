package pro.sky.java.course2.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
    public String speakHello() {
        return "Добро пожаловать в калькулятор";
    }
}
