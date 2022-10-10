import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class is the starting point to the program which displays a linked list of integers from user input.
 * @author Ronnie King
 */
public class Main {

    /**
     * This method runs the entire program which creates a linked list from the input and sorts the linked list
     *
     * @param args
     */
    public static void main(String[] args) {

        LinkedList<Integer> linkedList;

        linkedList = createLinkedList();

        linkedList.sort(Comparator.naturalOrder());

        System.out.println(linkedList);

    }

    /**
     * This method askes for user input for numbers. The program adds each number to the Linked List.
     * The linked list uses the Collections class built into Java. This method also uses this class to sort the linked
     * list.
     *
     * @return integer linked list through user input
     */
    public static LinkedList<Integer> createLinkedList(){

        Scanner inputScanner = new Scanner(System.in);
        int inputNumber;
        LinkedList<Integer> linkedList = new LinkedList<>();

        do {

            System.out.print("Please enter a number: ");

            inputNumber = inputScanner.nextInt();

            linkedList.add(inputNumber);

        }

        while(enterMoreNumbers());

        return linkedList;

    }

    /**
     * This method asks if the user would like to add more numbers to the linked list
     *
     * @return a boolean to continue adding numbers
     */
    public static boolean enterMoreNumbers(){

        Scanner inputScanner = new Scanner(System.in);
        String enterMoreNumbersInput;

        System.out.print("Enter more numbers? [y/n]");

        enterMoreNumbersInput = inputScanner.nextLine().toUpperCase();

        if(enterMoreNumbersInput.equals("Y")){
            return true;
        }

        return false;

    }

}