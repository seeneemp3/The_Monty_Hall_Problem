import java.util.*;

public class Main {
    static Random randomClass = new Random();
    static Drawer drawer = new Drawer();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Guess at first try");
        firstChoice(1, 10000);
        System.out.println();
        System.out.println("If you save choice");
        saveChoice(1, 10000);
        System.out.println();
        System.out.println("If you change it");
        changeChoice(1, 10000);
    }

    //We have three doors in front of us
    static List<Door> initList() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(1));
        doors.add(new Door(2));
        doors.add(new Door(3));
        return doors;
    }
    //Choose one of the three doors (int doorNumber)
    public static void firstChoice(int doorNumber, int iterations) throws InterruptedException {
        List<Door> doors = initList();

        double marks = 0;
        int percent = 0;
        //Render the probability display
        drawer.drawStart();

        for (int i = 0; i <= iterations; i++) {
            //Hide a prize behind a random door
            Door chosen = setRandomAndChosen(doors, doorNumber);

            //Remember if we guessed the right door
            if (chosen.hasPrize) {
                marks++;
                percent = (int) ((marks / iterations) * 100);
            }
            //Obtain the probability of choosing the door with the prize on the first attempt
            drawer.drawProgress(percent);

            //Reset data for the next iteration
            doors = initList();
        }
    }
    //Do everything the same as before
    public static void saveChoice(int doorNumber, int iterations) throws InterruptedException {
        List<Door> doors = initList();

        double marks = 0;
        int percent = 0;

        drawer.drawStart();

        for (int i = 0; i <= iterations; i++) {
            Door chosen = setRandomAndChosen(doors, doorNumber);

            //But now remove the door behind which there is definitely no prize and which we did not choose
            Door toRemove = doors.stream().filter(d -> !d.hasPrize && !d.isChosen).findFirst().orElseThrow(RuntimeException::new);
            doors.remove(toRemove);

            //Check the probability that there will be a prize behind the chosen door if we do not change the chosen door
            if (chosen.hasPrize) {
                marks++;
                percent = (int) ((marks / iterations) * 100);
            }
            //Render the result
            drawer.drawProgress(percent);

            doors = initList();
        }
    }
    //Do everything the same as before
    public static void changeChoice(int doorNumber, int iterations) throws InterruptedException {
        List<Door> doors = initList();

        double marks = 0;
        int percent = 0;

        drawer.drawStart();

        for (int i = 0; i <= iterations; i++) {
            Door chosen = setRandomAndChosen(doors, doorNumber);

            Door toRemove = doors.stream().filter(d -> !d.hasPrize && !d.isChosen).findFirst().orElseThrow(RuntimeException::new);
            doors.remove(toRemove);

            //But now change the choice after removing one non-prize door
            chosen.setChosen(false);
            chosen = doors.stream().filter(door -> door.number != doorNumber).findFirst().orElseThrow(RuntimeException::new);
            chosen.setChosen(true);

            if (chosen.hasPrize) {
                marks++;
                percent = (int) ((marks / iterations) * 100);
            }

            //Render the result
            drawer.drawProgress(percent);

            doors = initList();
        }
    }

    public static Door setRandomAndChosen(List<Door> doors, int doorNumber){
        int random = randomClass.nextInt(3);
        doors.get(random).setHasPrize(true);
        Door chosen = doors.stream().filter(door -> door.number == doorNumber).findFirst().orElseThrow(RuntimeException::new);
        chosen.setChosen(true);
        return chosen;
    }

}
