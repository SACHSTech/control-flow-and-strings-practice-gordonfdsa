
class C4IsSandwich extends ConsoleProgram {

    /**
     * A sandwich is two pieces of bread with something in between. Return the
     * string that is between the first and last appearance of "bread" in the given
     * string, or output the empty string "" if there are not two pieces of bread.
     * 
     * @author: Gordon Z
     */

    public void run() {

        String input = readLine("What is your string? ");

        int firstApperance =  input.indexOf("bread");
        int lastApperance = input.lastIndexOf("bread");

        if(firstApperance!=-1&&firstApperance!=lastApperance)
        System.out.println(input.substring(firstApperance+5, lastApperance));
        

    }
}
