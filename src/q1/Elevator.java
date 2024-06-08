/*
 The q1.Elevator class represents an elevator alarm.
 It extends the q1.Alarm class and includes a floor number to indicate the location of the alarm.
 * It extends the abstract class q1.Alarm, implements the action() method and includes a floor number
  to indicate the location of the alarm.
 */

package q1;

public class Elevator extends Alarm{
    /**
     * The floor number of the alarm.
     */
    private int floor;

    /**
     * Constructs an Elevator object with the given address and floor number.
     *
     @param address The address of the elevator alarm.
     @param floor The floor number of the elevator alarm.
     @throws BadAlarm if the address is null.
     */
    public Elevator(String address, int floor) throws BadAlarm {
        super(address);
        this.floor = floor;
    }

    /**
     * Prints a message indicating that the elevator alarm has been activated.
     */
    public void action() {
        System.out.println("Elevator alarm activated at " + address + " on " + activationTime + " from floor " + floor);
    }

    /**
     * Resets the floor number of the elevator alarm to 0.
     */
    public void reset() {
        floor = 0;
    }
}