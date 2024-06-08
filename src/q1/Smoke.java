/*
 * The q1.Smoke class represents a smoke alarm that can be activated by an operator.
 * It extends the abstract class q1.Alarm and implements the action() method.
 */

package q1;

public class Smoke extends Alarm {

    /** The name of the operator who activated the smoke alarm. */
    private String operatorName;

    /**
     * Creates a new q1.Smoke argument with the given address and operator name.
     *
     @param address The address of the smoke alarm.
     @param operatorName The name of the operator who activated the smoke alarm.
     @throws BadAlarm If the address is null.
     */
    public Smoke(String address, String operatorName) throws BadAlarm {
        super(address);
        this.operatorName = operatorName;
    }
    /**
     * Prints a message indicating that the smoke alarm has been activated by the operator.
     */
    public void action() {
        System.out.println("Smoke alarm activated at " + address + " on " + activationTime + " by " + operatorName);
    }
}