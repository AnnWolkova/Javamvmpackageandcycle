package ru.netology.javapackageandcycle.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestMonth.csv")

    public void ShouldCalcRestMonth(int expected, int income, int expenses, int threshold) {
        RestMonthService service = new RestMonthService();
//        int expected = 3; // данные подготавлваем
        int actual = service.calculate(income, expenses, threshold);  // вызывается целевой метод
        Assertions.assertEquals(expected, actual); //проверка сравнения ожидаемого и фактического результатов

    }
}
//    @Test
//    public void ShouldCalcRestMonth2 ()
//    { RestMonthService service = new RestMonthService();
//        int expected = 2; // данные подготавлваем
//        int actual = service.calculate(100_000,60_000,150_000); // вызывается целевой метод
//        Assertions.assertEquals(expected,actual); //проверка сравнения ожидаемого и фактического результатов
//



