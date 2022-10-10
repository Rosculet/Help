public class Man extends Members{

    public Man(String name, int maxDistance, int maxJumps) {
        super(name, maxDistance, maxJumps);
    }

    public void jump() {
        System.out.println("Man can Jump");
    }

    public void run() {
        System.out.println("man can run!");
    }

}