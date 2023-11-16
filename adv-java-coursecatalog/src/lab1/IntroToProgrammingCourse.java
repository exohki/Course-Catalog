package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        setPrerequisites(""); // No prerequisites
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        // No action needed as this course has no prerequisites
    }
}
