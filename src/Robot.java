public class Robot extends Members {

    public Robot(String name, int maxDistance, int maxJumps) {
        super(name, maxDistance, maxJumps);
    }

    public void jump() {
        System.out.println("Robot can Jump");
    }

    public void run() {
        System.out.println("Robot can run!");
    }

}