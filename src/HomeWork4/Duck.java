package HomeWork4;

public class Duck implements FlightInterface {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public Duck() {
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void duckFlight(boolean isInjured) {
        FlightInterface.super.duckFlight(isInjured);
    }
}
