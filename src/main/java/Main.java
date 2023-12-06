import java.util.Arrays;
import java.util.Map;

public class Main {
    static Door [] doors = new Door[] {
            new Door("1", false, false),
            new Door("2", false, false),
            new Door("3", false, false),
    };
    public static void main(String[] args) throws InterruptedException  {
        //if someone hide a treasure behind random door
        //what probability to find it at first try
        firstChoice(doors[0], 1000);


    }
    public static void firstChoice(Door door, int iterations) throws InterruptedException{
        double marks = 0;
        int percent = 0;

        System.out.print("Calculating: [");
        for (int i = 0; i < 100; i++) {
            System.out.print(" ");
        }
        System.out.print("]\r");

        for (int i = 0; i <= iterations; i++) {
            int random = (int)(Math.random() * 3);
            doors[random].setRight(true);
            System.out.print("Calculating: [");

            if(door.isRight){
                marks ++;
                percent = (int)((marks / iterations) * 100);
            }
            for (int j = 0; j < percent; j++) {
                System.out.print("*");
            }
            for (int j = percent; j < 100; j++) {
                System.out.print(" ");
            }

            doors[random].setRight(false);
            System.out.print("] " + percent + "%");
            //Thread.sleep(80);
            System.out.print("\r");
        }
    }
}
