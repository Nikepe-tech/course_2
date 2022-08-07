package course2.task1.transport.train;

import course2.task1.transport.carriage.AbstractCarriage;
import course2.task1.transport.carriage.Carriage;
import course2.task1.transport.carriage.CarriageComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Train {

    private final List<AbstractCarriage> carriages = new ArrayList<>();

    public void addCarriage(final AbstractCarriage carriage) {
        carriages.add(carriage);
        carriage.setNumber(carriages.size());
    }

    public int getPassengerAmount() {
        return carriages.stream()
                .map(Carriage::getPassengerAmount)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int getBaggageAmount() {
        return carriages.stream()
                .map(Carriage::getBaggageAmount)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public void sortCarriages() {
        carriages.sort(new CarriageComparator());
        for (int i = 0; i < carriages.size(); i++) {
            carriages.get(i).setNumber(i + 1);
        }
    }

    public List<AbstractCarriage> findCarriagesWithPassengerAmountIn(
            final int min,
            final int max) {
        return carriages.stream()
                .filter(carriage -> carriage.getPassengerAmount() >= min
                        && carriage.getPassengerAmount() >= max)
                .collect(Collectors.toList());
    }
}
