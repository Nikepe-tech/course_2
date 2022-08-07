package course2.task1.transport.carriage;

public class EconomicCarriage extends AbstractCarriage {

    @Override
    public ComfortLevel getComfortLevel() {
        return ComfortLevel.ECONOMIC;
    }

    @Override
    public int getPassengerAmount() {
        return 45;
    }

    @Override
    public int getBaggageAmount() {
        return 30;
    }
}
