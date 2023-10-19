class A1FreezingHot extends ConsoleProgram {

  /**
  * Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.
  * @author: Gordon Z
  */
  
  public void run() {

    int a = readInt("first temperature: ");
    int b = readInt("first temperature: ");

    println((a<0&&b>100)||(b<0&&a>100));
    
  }
}

