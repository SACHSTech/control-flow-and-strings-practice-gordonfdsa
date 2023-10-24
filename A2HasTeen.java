class A2HasTeen extends ConsoleProgram {

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values via user input, output true if 1 or more of them are teen.
     * 
     * @author: Gordon Z
     */

    public void run() {

        int intFirstNumber;
        int intSecondNumber;
        int intThirdNumber; 

        intFirstNumber = readInt("what is the first number: ");
        intSecondNumber = readInt("what is the second number: ");
        intThirdNumber = readInt("what is the third number: ");

        if((intFirstNumber>=13&&intFirstNumber<=19)||(intSecondNumber>=13&&intSecondNumber<=19)
        ||(intThirdNumber>=13&&intThirdNumber<=19)){
            System.out.println(true);
        }

    }
}
