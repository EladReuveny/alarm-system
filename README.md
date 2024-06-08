# AlarmSystem

## Description
This project simulates a basic alarm system with various types of alarms including smoke, fire, and elevator alarms. Each alarm can be activated and processed, demonstrating inheritance and polymorphism in Java.

## Classes
- **Alarm**: An abstract base class representing a general alarm.
- **BadAlarm**: An exception class for handling invalid alarm conditions.
- **Elevator**: A subclass of `Alarm` representing an elevator alarm.
- **Fire**: A subclass of `Alarm` representing a fire alarm.
- **Smoke**: A subclass of `Alarm` representing a smoke alarm.
- **TestAlarms**: A class to test the functionality of the alarm system.

## Usage
1. **Compile the classes**: Ensure all Java files are compiled. For example:
    ```sh
    javac q1/*.java
    ```

2. **Run the main class**: Execute the `TestAlarms` class to test the alarm system.
    ```sh
    java q1.TestAlarms
    ```

3. **Follow the on-screen instructions**: Add different types of alarms and see their actions.

## Example
After running the `TestAlarms` class, you will be prompted to add various alarms:

Here's a README.md file you can include in your repository:

markdown
Copy code
# AlarmSystem

## Description
This project simulates a basic alarm system with various types of alarms including smoke, fire, and elevator alarms. Each alarm can be activated and processed, demonstrating inheritance and polymorphism in Java.

## Classes
- **Alarm**: An abstract base class representing a general alarm.
- **BadAlarm**: An exception class for handling invalid alarm conditions.
- **Elevator**: A subclass of `Alarm` representing an elevator alarm.
- **Fire**: A subclass of `Alarm` representing a fire alarm.
- **Smoke**: A subclass of `Alarm` representing a smoke alarm.
- **TestAlarms**: A class to test the functionality of the alarm system.

## Usage
1. **Compile the classes**: Ensure all Java files are compiled. For example:
    ```sh
    javac q1/*.java
    ```

2. **Run the main class**: Execute the `TestAlarms` class to test the alarm system.
    ```sh
    java q1.TestAlarms
    ```

3. **Follow the on-screen instructions**: Add different types of alarms and see their actions.

## Example
After running the `TestAlarms` class, you will be prompted to add various alarms:
TestAlarms Menu

1. Smoke Alarm
2. Fire Alarm.
3. Elevator Alarm.
4. 0 Finishing adding items.

You can add multiple alarms and then finish the process to see the actions being performed.
