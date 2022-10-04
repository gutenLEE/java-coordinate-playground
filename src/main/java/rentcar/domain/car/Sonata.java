package rentcar.domain.car;

/**
 * @author gutenlee
 * @since 2022/09/30
 */
public class Sonata extends Car {
    private final int distancePerLiter = 10;
    private int tripDistance;

    public Sonata(int i) {
        this.tripDistance = i;
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return this.getClass().getName();
    }

}
