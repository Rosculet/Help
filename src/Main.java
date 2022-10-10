
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Vasya", 10, 10);
        Cat cat = new Cat("Barsik", 15, 15);
        Robot robot = new Robot("Android", 50, 20);

        Wall wall = new Wall(100);
        RaceTrack raceTrack = new RaceTrack(100);

        ArrayList<Barriers> barrierList = new ArrayList<>();
        barrierList.add(wall);
        barrierList.add(raceTrack);

        ArrayList<Members> membersList = new ArrayList<>();
        membersList.add(man);
        membersList.add(cat);
        membersList.add(robot);

        cross(membersList, barrierList);
    }

    public static void cross(ArrayList<Members> membersArrayList, ArrayList<Barriers> barriersArrayList) {
        for (int i = 0; i < membersArrayList.size(); i++) {
            for (int j = 0; j < barriersArrayList.size(); j++) {
                if (barriersArrayList.get(j).getHeight() > membersArrayList.get(i).getMaxJumps()) {
                    System.out.println(" Jump failed ");
                    break;
                }
                if (barriersArrayList.get(j).getLength() > membersArrayList.get(i).getMaxDistance()) {
                    System.out.println(" Sprint failed ");
                    break;
                }
            }
        }
    }
}