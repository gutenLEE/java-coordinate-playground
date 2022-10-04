package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author gutenlee
 * @since 2022/10/04
 */
public class LineCoordinateTest {
    @Test
    void coordinatesTest() throws Exception {
        String value = "(10,10)-(14,15)";
        Coordinates coordinates = new Coordinates(value.split("-"));
        assertThat(coordinates.isValidRange()).isTrue();
    }

    @Test
    void StraightLineCoordinateTest() throws Exception {
        String value = "(10,10)-(14,15)";
        StraightLineCoordinate lineCoordinate = new StraightLineCoordinate();
        assertThat(lineCoordinate.validate(value)).isTrue();
    }

    @Test
    void getDistanceTest() throws Exception {
        String value = "(10,10)-(14,15)";
        StraightLineCoordinate lineCoordinate = new StraightLineCoordinate();
        if (lineCoordinate.validate(value))
            assertEquals(6.40312, lineCoordinate.length(), 0.00001);
    }

    @Test
    void printTest() throws Exception {
        String value = "(10,10)-(14,15)";
        StraightLineCoordinate lineCoordinate = new StraightLineCoordinate();
        boolean validate = lineCoordinate.validate(value);
        double length = lineCoordinate.length();
        lineCoordinate.print();
    }





}
