import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalculateService;

public class CalculateServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/Vocation.csv")
   public void VocationTest (int expected, int income, int expenses, int threshold) {
        CalculateService service = new CalculateService();
        int actual = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, actual);

    }
}
