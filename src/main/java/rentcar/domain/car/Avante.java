package rentcar.domain.car;

/**
 * @author gutenlee
 * @since 2022/09/30
 */
public class Avante extends Car {
    private final int distancePerLiter = 15;
    private int tripDistance;

    public Avante(int i) {
        this.tripDistance = i;
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return this.getClass().getName();
    }

}
