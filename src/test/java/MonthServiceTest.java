import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.MonthService;

public class MonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    void testCalculateMonth1(int expected, int income, int expenses, int threshold) {
        MonthService service = new MonthService();


//        вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический результат)
        Assertions.assertEquals(expected, actual);
    }


}
