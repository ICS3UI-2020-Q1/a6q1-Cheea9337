import java.util.Scanner;
/**
 * calculate the average of heights
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how many heights they are going to give
    System.out.println("How many heights would you like to enter?");
    int heightsNumber = input.nextInt();

    // create an array to store the heights
    int[] heights = new int[heightsNumber];

    // ask the user for the heights
    System.out.println("Please enter the heights on seperate lines");

    // create a for loop to get all the heights
    for(int i = 0; i < heights.length; i++){
      heights[i] = input.nextInt();
    }

    // create a variable to store all of the heights
    int total = 0;
    // use a for loop to add each value into total
    for(int i = 0; i < heights.length; i++){
      // add each grade into total
      total = total + heights[i];
    }

    // calculate the average
    int average = total/heights.length;

    // let the user know the average
    System.out.println("The average height is " + average);
  
  
  }
}
