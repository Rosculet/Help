
public class Cat extends Members{


    public Cat(String name, int maxDistance, int maxJumps) {
        super(name, maxDistance, maxJumps);
    }

    public void jump() {
        System.out.println("Cat can Jump");
    }

    public void run() {
        System.out.println("Cat can run!");
    }

}
