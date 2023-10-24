class A3Within10 extends ConsoleProgram {

    /**
     * Given 2 int values via user input, output whichever value is nearest to the
     * value 10, or output 0 in the event of a tie. Note that Math.abs(n) returns
     * the absolute value of a number.
     * 
     * @author: Gordon Z
     */

    public void run() {

        int a = readInt("first value: ");
        int b = readInt("first value: ");

        int newA = Math.abs(a-10);
        int newB = Math.abs(b-10);

        if(newA==newB){
            println(0);
        }else if(newA<newB){
            println(a);
        }else{
            println(b);
        }

    }
}
