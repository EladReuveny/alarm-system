/*
 * An exception class to indicate when an alarm is created with invalid arguments.
 */

package q1;

public class BadAlarm extends Exception {

    /**
     * Creates a new instance of q1.BadAlarm with the specified error message.
     * @param message The error message to be associated with this exception.
     */
    public BadAlarm(String message) {
        super(message);
    }
}
