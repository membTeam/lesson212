package lesson212.web;

import lesson212.exception.ErrIllegalArgException;
import org.springframework.stereotype.Service;


@Service
public class CalculatorControllerServiceImpl implements CalculatorControllerService {
    public String plus(Integer number1, Integer number2) {
        return String.format("Сложение: %d + %d = %d", number1, number2, (number1+number2));
    }

    @Override
    public String minus(Integer number1, Integer number2) {
        return String.format("Вычитание: %d - %d = %d", number1, number2, (number1-number2));
    }

    @Override
    public String multiply(Integer number1, Integer number2) {
        return String.format("Умножение: %d * %d = %d", number1, number2, (number1 * number2));
    }

    @Override
    public String divide(Integer number1, Integer number2) {
        if (number2 == 0) {
            throw new ErrIllegalArgException("Значение null или 0 значение в переменной");
        }

        return String.format("Деление: %d / %d = %d", number1, number2, (number1 / number2));
    }
}
