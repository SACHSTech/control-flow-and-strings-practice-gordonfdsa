class B4IsPrime extends ConsoleProgram {

    /**
     * Write a program that lets you enter an integer, and that will print
     * appropriately "is a prime number" or "is a composite number".
     * 
     * @author: Gordon Z
     */

    public void run() {

        int intNumber = readInt("Input a number: ");

        if (intNumber == 2) {
            println("is a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(intNumber); i++) {
                if (intNumber % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime)
                println("is a prime number");
            else
                println("is a composite number");

        }

    }
}
