import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.TemperatureService;

public class TemperatureServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        TemperatureService service = new TemperatureService();

        int[] temps = {15, 20, 18, 4, 34, 30};
        int expectedDay = 3;
        int actualDay = service.getMinDay(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMinTemperature() {
        TemperatureService service = new TemperatureService();

        int[] temps = {15, 20, 18, 4, 34, 30};
        int expectedTemp = 4;
        int actualTemp = service.getMinTemp(temps);

        Assertions.assertEquals(expectedTemp, actualTemp);

    }

}
