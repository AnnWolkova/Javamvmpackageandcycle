package ru.netology.javapackageandcycle.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthServiceTest {
    @Test
    public void ShouldCalcRestMonth1 ()
    { RestMonthService service = new RestMonthService();
        int expected = 3; // данные подготавлваем
        int actual = service.calculate(10_000,3_000,20_000); // вызывается целевой метод
        Assertions.assertEquals(expected,actual); //проверка сравнения ожидаемого и фактического результатов

    }
    @Test
    public void ShouldCalcRestMonth2 ()
    { RestMonthService service = new RestMonthService();
        int expected = 2; // данные подготавлваем
        int actual = service.calculate(100_000,60_000,150_000); // вызывается целевой метод
        Assertions.assertEquals(expected,actual); //проверка сравнения ожидаемого и фактического результатов

    }
}

