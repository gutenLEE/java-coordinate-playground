package coordinate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gutenlee
 * @since 2022/10/04
 */
public class Coordinates {

    private final List<int[]> coordinateList = new ArrayList<>();

    public Coordinates(String[] stringArray) {
        int[] ints;
        for (String value : stringArray) {
            ints = new int[2];
            String[] split = value.replaceAll("\\(|\\)", "").split(",");
            ints[0] = Integer.parseInt(split[0]);
            ints[1] = Integer.parseInt(split[1]);
            this.coordinateList.add(ints);
        }
    }

    public boolean isValidRange(){
        for (int[] ints : coordinateList) {
            for (int intValue : ints) {
                if (intValue>24)
                    return false;
            }
        }
        return true;
    }


    public List<int[]> getCoordinateList() {
        return coordinateList;
    }
}
