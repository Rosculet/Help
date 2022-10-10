
public class Wall extends Barriers{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void jump(Members members) {
        System.out.println("jump ");
    }
}