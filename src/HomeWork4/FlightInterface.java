package HomeWork4;

public interface FlightInterface {
    default void duckFlight(boolean  isInjured){
        try {
            if (isInjured){
            System.out.println("Duck down");
            throw new FlyException();
        }

        } catch (FlyException e) {
            e.printStackTrace();
        }


  }

  default void planeFlight( int countPassengers) {
        try {
            if (countPassengers <= 0){
                System.out.println();
                throw  new FlyException();
            }
        } catch (FlyException e){
            e.printStackTrace();
        }
        if (countPassengers>0){
            System.out.println("Plane flight");
        }

  }
}
