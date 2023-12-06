import java.util.Arrays;
import java.util.Map;

public class Main {
    static Door [] doors = new Door[] {
            new Door("1", false, false),
            new Door("2", false, false),
            new Door("3", false, false),
    };
    public static void main(String[] args) throws InterruptedException  {

        progress(doors[0].isRight);
    }
    public static void progress(boolean istRight) throws InterruptedException{
        double marks = 0;
        int percent = 0;
        int iterations = 10000;

        System.out.print("Calculating: [");
        for (int i = 0; i < 100; i++) {
            System.out.print(" ");
        }
        System.out.print("]\r");

        for (int i = 0; i <= iterations; i++) {
            int random = (int)(Math.random() * 3);
            doors[random].setRight(true);
            System.out.print("Calculating: [");

            if(doors[0].isRight){
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
            Thread.sleep(0);
            System.out.print("\r");
        }


//        int total = 100;
//        int width = 50;
//
//        System.out.print("Calculating: [");
//        for (int i = 0; i < width; i++) {
//            System.out.print(" ");
//        }
//        System.out.print("]\r");
//
//        for (int i = 0; i <= 100; i++) {
//            int progress = width * i / total;
//
//            System.out.print("Calculating: [");

//            for (int j = 0; j < progress; j++) {
//                System.out.print("*");
//            }
//            for (int j = progress; j < width; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("] " + i + "%");
//
//            Thread.sleep(80);
//            System.out.print("\r");
//        }
    }
    public static void firstChoice() throws InterruptedException {
        //if someone hide a treasure behind random door

//        System.out.println(doors[0].toString());
//        System.out.println(doors[1].toString());
//        System.out.println(doors[2].toString());


        //what probability to find it at first try


        //System.out.print((int)(Math.random() * 3) + " ");


    }
}
