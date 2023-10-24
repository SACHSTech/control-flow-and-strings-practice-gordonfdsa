class C3MiddleAbc extends ConsoleProgram {

    /**
     * Given a string, does "abc" appear in the middle of the string? To define
     * middle, we'll say that the number of characters to the left and right of the
     * "abc" must differ by at most one.
     * 
     * @author: Gordon Z
     */

    public void run() {

        String input = readLine("What is your string? ");

        int intMiddle = input.length()/2;
        intMiddle-=1;  //this is the index of the supposed 'a'

        if(input.charAt(intMiddle)=='a'&&input.charAt(intMiddle+1)=='b'&&input.charAt(intMiddle+2)=='c'){
            println(true);
        }else{
            println(false);
        }


    }
}
