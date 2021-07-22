import java.util.Random;
import java.util.Scanner;

public class Player {
    private int x;
    private int y;
    private int xPole;
    private int yPole;
    private boolean isPlaying = true;
    private int hp = 100;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public String getFace() {
        return face;
    }

    private String face = "☺";

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }



    public void setPos(int xPole,int yPole){
        this.xPole = xPole;
        this.yPole = yPole;
        Random r = new Random();
        setX(r.nextInt(xPole));
        setY(r.nextInt(yPole));
        System.out.println("\nX= "+(x+1)+" Y= "+ (y+1));
    }



    public void movement(){
        Scanner sc = new Scanner(System.in);
        boolean gate = false;
        while (!gate) {
            switch (sc.nextLine()) {
                case "w" -> {
                    if(y - 1 >= 0){
                        setY(y - 1);
                        gate = true;} else System.out.println("\nВы не можете выйти за границу карты\n");
                }
                case "a" -> {
                    if(x - 1 >= 0){
                        setX(x - 1);
                        gate = true;} else System.out.println("\nВы не можете выйти за границу карты\n");
                }
                case "s" -> {
                    if(y + 1 < yPole){
                        setY(y + 1);
                        gate = true;} else System.out.println("\nВы не можете выйти за границу карты\n");
                }
                case "d" -> {
                    if(x + 1 < xPole){
                        setX(x + 1);
                        gate = true;} else System.out.println("\nВы не можете выйти за границу карты\n");
                }
                case "end" -> {
                    setPlaying(false);
                    gate = true;
                }

                default -> System.out.println("\nНеправильный ввод\n");
            }
        }

    }





}
