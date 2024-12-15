package mads_Lib_game;
import java.util.*;


public class mads_libs{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;

    System.out.print("Enter an adjective(description): ");
    adjective1 = in.nextLine();
    System.out.print("Enter a noun (animal or person): ");
    noun1 = in.nextLine();
    System.out.print("Enter an adjective (description): ");
    adjective2 = in.nextLine();
    System.out.print("Enter a verb ending with -ing (action): ");
    verb1 = in.nextLine();
    System.out.print("Enter an adjective (description): ");
    adjective3 = in.nextLine();

    System.out.println("\nToday I went to a " + adjective1 + " zoo.");
    System.out.println("In an exhibit, I saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    System.out.println("I was " + adjective3 + "!");

    in.close();


  }
}
