package lesson212.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static lesson212.web.constArguments.ConstArguments.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void getPlus() throws Exception {

        var numberResult = NUMBERis80 + NUMBERis20;
        var str = String.format("Сложение: %d + %d = %d", NUMBERis80, NUMBERis20, numberResult);

        mockMvc.perform(get("/calculator/plus/" + NUMBERis80 + "/" + NUMBERis20))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(str));
    }

    @Test
    public void getMinus() throws Exception {

        var numberResult = NUMBERis80 - NUMBERis20;
        var str = String.format("Вычитание: %d - %d = %d", NUMBERis80, NUMBERis20, numberResult);

        mockMvc.perform(get("/calculator/minus/" + NUMBERis80 + "/" + NUMBERis20))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(str));
    }

    @Test
    public void getmultiply() throws Exception {

        var numberResult = NUMBERis80 * NUMBERis20;
        var str = String.format("Умножение: %d * %d = %d", NUMBERis80, NUMBERis20, numberResult);

        mockMvc.perform(get("/calculator/multiply/" + NUMBERis80 + "/" + NUMBERis20))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(str));
    }

    @Test
    public void getdivide() throws Exception {

        var numberResult = NUMBERis80 / NUMBERis20;
        var str = String.format("Деление: %d / %d = %d", NUMBERis80, NUMBERis20, numberResult);

        mockMvc.perform(get("/calculator/divide/" + NUMBERis80 + "/" + NUMBERis20))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(str));
    }

    @Test
    public void getdivideWithException500() throws Exception {

        mockMvc.perform(get("/calculator/divide/" + NUMBERis80 + "/" + NUMBERisZero))
                .andExpect(status().isBadRequest() );
    }

}
