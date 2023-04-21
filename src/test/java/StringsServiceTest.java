import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.StringsService;

public class StringsServiceTest {

    @Test
    public void shouldFinedLongestIfFirst() {
        StringsService service = new StringsService();

        String s1 = "Hello";
        String s2 = "WoW";

        String expected = s1;
        String actual = service.longestString(s1, s2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkIfEqualLength() {
        StringsService service = new StringsService();

        String s1 = "Hello";
        String s2 = "World";

        String expected = s2;
        String actual = service.longestString(s1, s2);

        Assertions.assertEquals(expected, actual);
    }
}
