import java.util.Random;

class B1DiceGame extends ConsoleProgram {

    /**
     * Write a program that lets you simulate the rolling of 100 pairs of dice. For
     * each roll,
     * 
     * If the pair adds up to 2, print "snake eyes!"
     * If the pair adds up to 7, print "lucky seven"
     * if the pair adds up to any other sum, do not print out anything
     * 
     * @author: Gordon Z
     */

    public void run() {

        for (int i = 0; i < 100; i++) {

            Random myRandom = new Random();
            int roll1 = myRandom.nextInt(1, 7);
            int roll2 = myRandom.nextInt(1, 7);    
            if (roll1 + roll2 == 7)
                System.out.println("lucky seven!");
            if (roll1 + roll2 == 2)
                println("snake eyes!");

        }
    }
}
