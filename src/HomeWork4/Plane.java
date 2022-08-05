package HomeWork4;

public class Plane implements FlightInterface {
    private int countPassengers;

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public String toString() {
        return "Plain{" +
                "countPassengers=" + countPassengers +
                '}';
    }

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public Plane() {
    }
}

