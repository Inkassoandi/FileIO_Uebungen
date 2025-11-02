package FileIO_Bikes;

import java.util.Comparator;

public class PowerComparator implements Comparator<Bike> {
    @Override
    public int compare(Bike o1, Bike o2) {
        return  (int) (o1.getPower() - o2.getPower());
    }
}
