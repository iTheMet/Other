import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Dude d = new Dude();
        d.setxPole(Integer.parseInt(scanner.nextLine()));
        d.setyPole(Integer.parseInt(scanner.nextLine()));
        d.walkingDude(d.getxPole(),d.getyPole());


    }

}
