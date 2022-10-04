package rentcar.domain.car;

/**
 * @author gutenlee
 * @since 2022/09/30
 */
public class K5 extends Car {
    private final int distancePerLiter = 13;
    private int tripDistance;


    public K5(int i) {
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
