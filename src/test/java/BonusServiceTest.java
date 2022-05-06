import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();


        int amount = 1000;
        boolean registered = true;
        int expected = 30;


        int actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        int amount = 1_000_000;
        boolean registered = true;
        int expected = 500;


        int actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();


        int amount = 1300;
        boolean registered = false;
        int expected = 13;


        int actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        int amount = 103_000;
        boolean registered = false;
        int expected = 500;


        int actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }
}