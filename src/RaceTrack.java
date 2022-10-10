public class RaceTrack extends Barriers {
    private int length;

    public RaceTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void run(Members members) {
        System.out.println("run Race track");
    }

}