package course2.task1.transport.carriage;

public abstract class AbstractCarriage implements Carriage {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "number=" + number +
                "; comfortLevel=" + getComfortLevel().name() +
                '}';
    }
}
