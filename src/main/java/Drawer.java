public class Drawer {
    public void drawProgress(int percent){
        System.out.print("Calculating: [");
        for (int j = 0; j < percent; j++) {
            System.out.print("*");
        }
        for (int j = percent; j < 100; j++) {
            System.out.print(" ");
        }
        System.out.print("] " + percent + "%");
        System.out.print("\r");
    }
    public void drawStart(){
        System.out.print("Calculating: [");
        for (int i = 0; i < 100; i++) {
            System.out.print(" ");
        }
        System.out.print("]\r");
    }
}
