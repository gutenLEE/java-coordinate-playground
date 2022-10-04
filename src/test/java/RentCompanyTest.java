import org.junit.jupiter.api.Test;
import rentcar.domain.RentCompany;
import rentcar.domain.car.Avante;
import rentcar.domain.car.K5;
import rentcar.domain.car.Sonata;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author gutenlee
 * @since 2022/09/30
 */
public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "rentcar.domain.car.Sonata : 15리터" + NEWLINE +
                        "rentcar.domain.car.K5 : 20리터" + NEWLINE +
                        "rentcar.domain.car.Sonata : 12리터" + NEWLINE +
                        "rentcar.domain.car.Avante : 20리터" + NEWLINE +
                        "rentcar.domain.car.K5 : 30리터" + NEWLINE
        );
    }
}
