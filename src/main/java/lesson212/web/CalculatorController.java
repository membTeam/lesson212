package lesson212.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorControllerServiceImpl contrServ;

    @GetMapping("/plus/{number1}/{number2}")
    public String plus(@PathVariable("number1") Integer number1,
                       @PathVariable("number2") Integer number2 ){
        return contrServ.plus(number1, number2);
    }

    @GetMapping("/minus/{number1}/{number2}")
    public String minus(@PathVariable("number1") Integer number1,
                       @PathVariable("number2") Integer number2 ){
        return contrServ.minus(number1, number2);
    }

    @GetMapping("/multiply/{number1}/{number2}")
    public String multiply(@PathVariable("number1") Integer number1,
                        @PathVariable("number2") Integer number2 ){
        return contrServ.multiply(number1, number2);
    }

    @GetMapping("/divide/{number1}/{number2}")
    public String divide(@PathVariable("number1") Integer number1,
                           @PathVariable("number2") Integer number2 ){
        return contrServ.divide(number1, number2);
    }

}
