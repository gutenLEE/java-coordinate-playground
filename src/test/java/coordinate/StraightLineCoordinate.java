package coordinate;

import java.util.Arrays;

import static java.lang.Math.pow;

/**
 * @author gutenlee
 * @since 2022/10/04
 */
public class StraightLineCoordinate extends Coordinate {

    private Coordinates coordinates;
    private double value;

    @Override
    public boolean validate(String input) {
        String[] split = input.split("-");
        coordinates = new Coordinates(split);
        return coordinates.isValidRange();
    }

    @Override
    double length() {
        //제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        int[] pointA = Arrays.stream(coordinates.getCoordinateList().get(0)).toArray();
        int[] pointB = Arrays.stream(coordinates.getCoordinateList().get(1)).toArray();
        this.value = Math.sqrt(pow((pointA[X]-pointB[X]), 2) + pow((pointA[Y]-pointB[Y]), 2));
        return value;
    }

    @Override
    void print() {
        System.out.println("두 점 사이의 거리는 : " + value);
    }
}
