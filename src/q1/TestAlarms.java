/*
  The q1.TestAlarms class is responsible for testing the functionality of the different types of alarms.
  It allows the user to create and add q1.Smoke, q1.Fire, and q1.Elevator alarms to an ArrayList and then processes them
  to test their action methods.
  * @Author: Elad Reuveny
 */

package q1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAlarms {
    /**
     * ArrayList containing the alarms to be processed.
     */
    public static ArrayList <Alarm> alarms = new ArrayList<>();

    /**
     * Processes the given alarms by calling their action methods
     and tracking the number of q1.Smoke alarms triggered.
     *
     * @param alarms the ArrayList containing the alarms to be processed
     */
    public static void process(ArrayList <Alarm> alarms) {
        // initialize a counter for smoke alarms
        int smokeCounter = 0;
        // loop through all the alarms in the ArrayList
        for(int i = 0; i < alarms.size(); i++) {
            // get the current alarm object
            Alarm alarm = alarms.get(i);
            // if the alarm is a smoke alarm, increment the smoke counter
            if(alarm instanceof  Smoke)
                smokeCounter++;
                // if the alarm is an elevator alarm, reset it
            else if(alarm instanceof  Elevator)
                ((Elevator) alarm).reset();
            // print out the index and name of the alarm
            System.out.print("(" + (i+1) + ") ");
            alarm.action();;
        }
        // print out the number of smoke alarms activated
        System.out.println("The number of smoke alarms whom were activated is: " + smokeCounter);
    }

    /**
     * The main method allows the user to add q1.Smoke, q1.Fire, and q1.Elevator alarms to an ArrayList and then processes them
     by calling the process() method.
     *
     * @param args not used
     * @throws BadAlarm if an error occurs when creating a q1.Alarm object
     */
    public static void main(String[] args) throws BadAlarm {
        Scanner scn = new Scanner(System.in);
        // print out the instructions for the user
        System.out.println("***TestAlarms Menu***\n");
        System.out.println("1. Smoke Alarm\n2. Fire Alarm.\n3. Elevator Alarm.\n4. 0 Finishing adding items.");
        // read in the first input from the user
        int input = scn.nextInt();
        // initialize a counter for the alarms
        int i = 0;
        // loop until the user inputs 0
        while (input != 0) {
            // if the user inputs 1, create a new q1.Smoke alarm and add it to the ArrayList
            if (input == 1) {
                alarms.add(new Smoke("@Smoke" + i, "operator number " + i));
                i++;
            }
            // if the user inputs 2, create a new q1.Fire alarm and add it to the ArrayList
            else if (input == 2) {
                alarms.add(new Fire("@Fire" + i, "operator number " + i));
                i++;
            }
            // if the user inputs 3, create a new q1.Elevator alarm and add it to the ArrayList
            else if (input == 3) {
                alarms.add(new Elevator("@Elevator" + i, i));
                i++;
            }
            // if the user inputs anything else, print an error message and ask for input again
            else
                System.out.println("Only 0|1|2|3 buttons are allowed. Please try again.");
            // print out the instructions for the user again and read in the input
            System.out.println("1. Smoke Alarm\n2. Fire Alarm.\n3. Elevator Alarm.\n4. 0 Finishing adding items.");
            input = scn.nextInt();
        }
        // process all the alarms in the ArrayList
        process(alarms);
    }
}
