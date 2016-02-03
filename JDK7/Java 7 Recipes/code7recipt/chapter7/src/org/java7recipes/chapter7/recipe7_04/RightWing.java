
package org.java7recipes.chapter7.recipe7_04;

/**
 * Recipe 7-4
 * 
 * @author juneau
 */
public class RightWing extends Player implements PlayerType {
    
    private int totalShots;
    private int shotsOnGoal;
    private int steals;

    /**
     * @return the totalShots
     */
    public int getTotalShots() {
        return totalShots;
    }

    /**
     * @param totalShots the totalShots to set
     */
    public void setTotalShots(int totalShots) {
        this.totalShots = totalShots;
    }

    /**
     * @return the shotsOnGoal
     */
    public int getShotsOnGoal() {
        return shotsOnGoal;
    }

    /**
     * @param shotsOnGoal the shotsOnGoal to set
     */
    public void setShotsOnGoal(int shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    /**
     * @return the steals
     */
    public int getSteals() {
        return steals;
    }

    /**
     * @param steals the steals to set
     */
    public void setSteals(int steals) {
        this.steals = steals;
    }
    
    
}