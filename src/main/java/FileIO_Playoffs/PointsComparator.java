package FileIO_Playoffs;

import java.util.Comparator;

public class PointsComparator implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {
        return o1.getTotalPoints() - o2.getTotalPoints();
    }
}
