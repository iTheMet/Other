import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dude {

    private static  ArrayList<ArrayList<String>> pole = new ArrayList<>();

    private  int yPole = 0;
    private  int xPole = 0;






    public int getyPole() {
        return yPole;
    }
    public void setyPole(int yPole) {
        this.yPole = yPole;
    }
    public int getxPole() {
        return xPole;
    }
    public void setxPole(int xPole) {
        this.xPole = xPole;
    }


    public String walkingDude(int xPole, int yPole){


        for(int i = 0; i < yPole; i++){
            ArrayList<String> stolb = new ArrayList<String>();
            for(int j =0; j<xPole;j++){
                Random r = new Random();
                switch(r.nextInt(10)){
                    case 0, 3,6 -> stolb.add("╟");
                    case 1, 4,7 -> stolb.add("╗");
                    case 2, 5 -> stolb.add("┌");
                    case 9 -> stolb.add("☻");
                    default -> stolb.add("╝");
                };
            }pole.add(stolb);

        }

        Player player = new Player();
        player.setPos(xPole,yPole);
        System.out.print("\n");
        while (player.isPlaying()) {
            System.out.println("\nХП = "+ player.getHp());
            String prev = pole.get(player.getY()).get(player.getX());
            pole.get(player.getY()).set(player.getX(), player.getFace());


            for (ArrayList<String> s : pole) {
                for (String word : s) {
                    System.out.print(word + " ");
                }
                System.out.print("\n");

            }
            pole.get(player.getY()).set(player.getX(), prev);
            System.out.print("\n");
            player.movement();
            if((pole.get(player.getY()).get(player.getX()).equals("☻"))){
                System.out.println("ай");
                player.setHp(player.getHp() - 20);
            }
            if(player.getHp() <= 0){
                System.out.println("Зря вы к нему полезли.\nЭтот человек был гадок...\nНе имея за собой никаких моральных принципов\nОн отмудохал вас и вы проиграли!");
                player.setPlaying(false);
            }


        }
        return "a";
    }

    private void dude(ArrayList<String[]> pole){

    }

}
