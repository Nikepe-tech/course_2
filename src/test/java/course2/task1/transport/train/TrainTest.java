package course2.task1.transport.train;

import course2.task1.transport.carriage.AbstractCarriage;
import course2.task1.transport.carriage.BusinessCarriage;
import course2.task1.transport.carriage.EconomicCarriage;
import course2.task1.transport.carriage.StandardCarriage;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TrainTest {

    private Train train;

    @Before
    public void setUp() {
        train = new Train();
        train.addCarriage(new BusinessCarriage());
        train.addCarriage(new EconomicCarriage());
        train.addCarriage(new BusinessCarriage());
        train.addCarriage(new StandardCarriage());
        train.addCarriage(new StandardCarriage());
        train.addCarriage(new EconomicCarriage());
        train.addCarriage(new EconomicCarriage());
        train.addCarriage(new StandardCarriage());
        train.addCarriage(new BusinessCarriage());
    }

    @Test
    public void calculatePassengerAndBaggageAmounts() {
        assertEquals(243, train.getPassengerAmount());
        assertEquals(216, train.getBaggageAmount());
    }

    @Test
    public void sortCarriages() {
        train.sortCarriages();
        List<AbstractCarriage> carriages = train.findCarriagesWithPassengerAmountIn(1, 1);
        for (int i = 0; i < carriages.size(); i++) {
            if (i > 0) {
                AbstractCarriage carriage = carriages.get(i);
                AbstractCarriage previousCarriage = carriages.get(i - 1);
                if (carriage.getComfortLevel().ordinal() < previousCarriage.getComfortLevel().ordinal()) {
                    fail("Сортировка сработала не верно");
                }
            }
        }
    }

    @Test
    public void findCarriagesWithPassengerAmountIn() {
        assertEquals(3, train.findCarriagesWithPassengerAmountIn(7, 40).size());
        assertEquals(6, train.findCarriagesWithPassengerAmountIn(19, 30).size());
        assertEquals(9, train.findCarriagesWithPassengerAmountIn(1, 6).size());
    }
}
