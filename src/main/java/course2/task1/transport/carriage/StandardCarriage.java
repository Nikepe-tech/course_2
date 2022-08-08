package course2.task1.transport.carriage;

public class StandardCarriage extends AbstractCarriage {


    public ComfortLevel getComfortLevel() {
        return ComfortLevel.STANDARD;
    }

    public int getPassengerAmount() {
        return 30;
    }

    public int getBaggageAmount() {
        return 30;
    }
}
