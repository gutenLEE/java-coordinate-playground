package rentcar.domain;

import rentcar.domain.car.Car;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gutenlee
 * @since 2022/09/30
 */
public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public String report() {
        final String NEWLINE = System.getProperty("line.separator");

        return cars.stream()
                .map(car -> {
                    double chargeQuantity = car.getChargeQuantity();
                    return car.getClass().getName() + " : " + (long)chargeQuantity + "리터" + NEWLINE;
                })
                .collect(Collectors.joining());
    }
}
