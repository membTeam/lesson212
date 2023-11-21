package lesson212.web;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static lesson212.web.constArguments.ConstArguments.*;


public class ControllerServTest {

    private CalculatorControllerServiceImpl servImpl = new CalculatorControllerServiceImpl() ;
    @Test
    public void plus_withNormalArg() {

        final Integer number1 = NUMBERis80, number2 = NUMBERis20, numberResult = (number1 + number2);

        var str = String.format("Сложение: %d + %d = %d", number1, number2, numberResult);

        var strResult = servImpl.plus(number1, number2);

        assertEquals(str, strResult);
    }

    @Test
    public void plus_withNormalArg_withNull() {
        final Integer number1 = NUMBERis20, number2 = NUMBERisZero, numberResult = (number1 + number2);

        var str = String.format("Умножение: %d * %d = %d", number1, number2, numberResult);
    }

    @Test
    public void minus_withNormalArg() {

        final Integer number1 = NUMBERis80, number2 = NUMBERis20, numberResult = (number1 - number2);

        var str = String.format("Вычитание: %d - %d = %d", number1, number2, numberResult);

        var strResult = servImpl.minus(number1, number2);

        assertEquals(str, strResult);
    }
    @Test
    public void multiply_withNormalArg() {

        final Integer number1 = NUMBERis80, number2 = NUMBERis20, numberResult = (number1 * number2);

        var str = String.format("Умножение: %d * %d = %d", number1, number2, numberResult);

        var strResult = servImpl.multiply(number1, number2);

        assertEquals(str, strResult);
    }

    @Test
    public void divide_withNormalArg() {

        final Integer number1 = NUMBERis80, number2 = NUMBERis20, numberResult = (number1 / number2);

        var str = String.format("Деление: %d / %d = %d", number1, number2, numberResult);

        var strResult = servImpl.divide(number1, number2);

        assertEquals(str, strResult);
    }

    @Test
    public void divide_withZeroArg2() {

        final Integer number1 = NUMBERis80, number2 = NUMBERisZero;
        assertThrows(IllegalArgumentException.class, ()-> servImpl.divide(number1, number2));
    }

    @Test
    public void divide_withZeroArg1() {

        final Integer number1 = NUMBERisZero, number2 = NUMBERis20, numberResult = number1 / number2;

        var str = String.format("Деление: %d / %d = %d", number1, number2, numberResult);

        var strResult = servImpl.divide(number1, number2);

        assertEquals(str, strResult);

    }


}
