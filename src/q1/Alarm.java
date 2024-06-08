/*
 * The q1.Alarm class is an abstract class representing a general alarm object that
 has an address and an activation time.
 */

package q1;

import java.util.Date;

public abstract class Alarm {
    /**
     * The address of the alarm.
     */
    protected String address;

    /**
     * The time the alarm was activated.
     */
    protected Date activationTime;

    /**
     * Creates a new instance of the q1.Alarm class with the given address.
     *
     * @param address The address of the alarm.
     * @throws BadAlarm if the address is null.
     */
    public Alarm(String address) throws BadAlarm {
        if (address == null)
            throw new BadAlarm("Address cannot be null.");
        this.address = address;
        this.activationTime = new Date();
    }

    /**
     * Returns a string representation of the activation time of the alarm.
     *
     * @return A string representation of the activation time of the alarm.
     */
    public String toString() {
        return activationTime.toString();
    }

    /**
     * Performs the action associated with the alarm.
     */
    public abstract void action();

}
