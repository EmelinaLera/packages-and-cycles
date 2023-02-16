import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void numberOfSquareRoots() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSqrt(10, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfSquareRootsInvalidMinLimit() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSqrt(9, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfSquareRootsInvalidMaxLimit() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSqrt(10, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfSquareRootsInvalidBouthLimits() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSqrt(11, 100);
        Assertions.assertEquals(expected, actual);
    }
}
