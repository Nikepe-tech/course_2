package course2.task1.transport.carriage;

public class BusinessCarriage extends AbstractCarriage {

    @Override
    public ComfortLevel getComfortLevel() {
        return ComfortLevel.BUSINESS;
    }

    @Override
    public int getPassengerAmount() {
        return 6;
    }

    @Override
    public int getBaggageAmount() {
        return 12;
    }
}
