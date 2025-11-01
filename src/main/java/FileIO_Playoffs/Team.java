package FileIO_Playoffs;

public class Team {

    String tablePosition;
    String name;
    int goalDifference;
    int totalPoints;


    public Team(String finalPosition, String name, int goalDifference, int totalPoints) {
        this.tablePosition = finalPosition;
        this.name = name;
        this.goalDifference = goalDifference;
        this.totalPoints = totalPoints;
    }

    public String getTablePosition() {
        return tablePosition;
    }

    public void setTablePosition(String tablePosition) {
        this.tablePosition = tablePosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "Platz: " + tablePosition + " - " + name + " - Goaldifference" + goalDifference + " - TotalPoints" + totalPoints;
    }
}
