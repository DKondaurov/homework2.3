package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    public String speakHello() {
        return "Добро пожаловать в калькулятор";
    }
}
