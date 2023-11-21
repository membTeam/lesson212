package lesson212.web;

import lesson212.exception.ErrIllegalArgException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import static lesson212.web.constArguments.ConstArguments.*;


public class ControllerServParamsTest {

    private CalculatorControllerServiceImpl servImpl = new CalculatorControllerServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void divideForZeroTest(Integer number1, Integer number2) {
        assertThrows(ErrIllegalArgException.class, () -> servImpl.divide(number1, number2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void plusTest(Integer number1, Integer number2) {
        var resPlus = number1 + number2;

        var resMethod = servImpl.plus(number1, number2);
        var str = String.format("Сложение: %d + %d = %d", number1, number2, resPlus);

        assertEquals(resMethod, str);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void minusTest(Integer number1, Integer number2) {
        var resPlus = number1 - number2;

        var resMethod = servImpl.minus(number1, number2);
        var str = String.format("Вычитание: %d - %d = %d", number1, number2, resPlus);

        assertEquals(resMethod, str);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void multiplyTest(Integer number1, Integer number2) {
        var resPlus = number1 * number2;

        var resMethod = servImpl.multiply(number1, number2);
        var str = String.format("Умножение: %d * %d = %d", number1, number2, resPlus);

        assertEquals(resMethod, str);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void divideTest(Integer number1, Integer number2) {
        var resPlus = number1 / number2;

        var resMethod = servImpl.divide(number1, number2);
        var str = String.format("Деление: %d / %d = %d", number1, number2, resPlus);

        assertEquals(resMethod, str);
    }


    private static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUMBERis80, NUMBERis20),
                Arguments.of(NUMBERisZero, NUMBERis20)
        );
    }

    private static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(NUMBERis80, NUMBERisZero)
        );
    }

}
