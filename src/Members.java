public class Members {
    private int maxDistance;
    public int maxJumps;
    private String name;

    public Members(String name, int maxDistance, int maxJumps) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumps = maxJumps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxJumps() {
        return maxJumps;
    }

    public void setMaxJumps(int maxJumps) {
        this.maxJumps = maxJumps;
    }
}