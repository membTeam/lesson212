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

    private final CalculatorControllerService contrServ;

    @GetMapping("/plus/{val1}/{val2}")
    public String plus(@PathVariable("val1") Integer val1,
                       @PathVariable("val2") Integer val2 ){
        return "empty";
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String minus(@PathVariable("val1") Integer val1,
                       @PathVariable("val2") Integer val2 ){
        return "empty";
    }

    @GetMapping("/multiply/{val1}/{val2}")
    public String multiply(@PathVariable("val1") Integer val1,
                        @PathVariable("val2") Integer val2 ){
        return "empty";
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String divide(@PathVariable("val1") Integer val1,
                           @PathVariable("val2") Integer val2 ){
        return "empty";
    }

}
