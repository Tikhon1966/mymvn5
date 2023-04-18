import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.MonthService;

public class MonthServiceTest {
    @Test
    void testCalculateMonth1() {
        MonthService service = new MonthService();

        // подготавливаем данные:
        int income = 10_000;
        int expences = 3_000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод
        int actual = service.calculate(income, expences, threshold);

        // производим проверку (сравниваем ожидаемый и фактический результат)
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateMonth2() {
        MonthService service = new MonthService();

        // подготавливаем данные:
        int income = 100_000;
        int expences = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // вызываем целевой метод
        int actual = service.calculate(income, expences, threshold);

        // производим проверку (сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);
    }
}
