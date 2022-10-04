package rentcar.domain;

import rentcar.domain.car.Car;
import rentcar.domain.car.Sonata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2022/09/30
 */
public class RentCompany {

    private Cars cars = new Cars(new ArrayList<>());
    public static RentCompany create() {
        return rentCompanyFactory();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.report();
    }

    public static RentCompany rentCompanyFactory() {
        return new RentCompany();
    }
}
