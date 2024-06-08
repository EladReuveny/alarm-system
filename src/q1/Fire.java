/*
 * The q1.Fire class represents a fire alarm that can be activated by an operator and deactivated.
 * It extends the abstract class q1.Alarm and implements the action() method.
 */

package q1;

public class Fire extends Alarm{

    /**
     * The name of the operator who activated the alarm
     */
    protected String operatorName;

    /**
     * Whether the alarm is currently active
     */
    protected boolean active;

    /**
     * Constructs a new q1.Fire alarm with the given address and operator name.
     *
     @param address the address of the fire alarm
     @param operatorName the name of the operator who activated the alarm
     @throws BadAlarm if the address is null
     */
    public Fire(String address, String operatorName) throws BadAlarm {
        super(address);
        this.operatorName = operatorName;
        this.active = true;
    }
    /**

     Prints out a message indicating that the fire alarm has been activated by the operator.
     Sets the active status of the alarm to false.
     */
    public void action() {
        System.out.println("Fire alarm activated at " + address + " on " + activationTime + " by " + operatorName);
        active = false;
    }
}