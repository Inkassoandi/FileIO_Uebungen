package FileIO_Playoffs;

import java.util.Comparator;

public class GoalDifferenceComparator implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {
        return o1.getGoalDifference() - o2.getGoalDifference();
    }
}
