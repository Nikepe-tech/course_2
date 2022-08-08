package course2.task1.transport.carriage;

import java.util.Comparator;

public class CarriageComparator implements Comparator<Carriage> {
    @Override
    public int compare(Carriage o1, Carriage o2) {
        return o1.getComfortLevel().ordinal() - o2.getComfortLevel().ordinal();
    }
}
