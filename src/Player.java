/**
 * @author CentreMetre
 * @version 0.1
 * @since 0.0.0.1
 */
public class Player {

    private int maxPoints;

    private int[] assignedPoints = {0,0,0,0,0,0,0,0};


    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int[] getAssignedPoints() {
        return assignedPoints;
    }

    public void setAssignedPoints(int[] assignedPoints) {
        this.assignedPoints = assignedPoints;
    }
}