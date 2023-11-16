package lab2;

public class Driver {
    public static void main(String[] args) {
        CourseInterface javaCourse = new IntroJavaCourse("Intro to Java", "JAVA100");
        javaCourse.setCredits(3.0);
        javaCourse.setPrerequisites("Basic Programming");

        CourseInterface advancedJavaCourse = new AdvancedJavaCourse("Advanced Java", "JAVA200");
        advancedJavaCourse.setCredits(4.0);
        advancedJavaCourse.setPrerequisites("Intro to Java");

        CourseInterface programmingCourse = new IntroToProgrammingCourse("Intro to Programming", "PROG101");
        programmingCourse.setCredits(2.0);
        // IntroToProgrammingCourse has no prerequisites

        // Test and display the properties of each course
        System.out.println(javaCourse.getCourseName() + " (" + javaCourse.getCourseNumber() + "), Credits: " + javaCourse.getCredits() + ", Prerequisites: " + javaCourse.getPrerequisites());
        System.out.println(advancedJavaCourse.getCourseName() + " (" + advancedJavaCourse.getCourseNumber() + "), Credits: " + advancedJavaCourse.getCredits() + ", Prerequisites: " + advancedJavaCourse.getPrerequisites());
        System.out.println(programmingCourse.getCourseName() + " (" + programmingCourse.getCourseNumber() + "), Credits: " + programmingCourse.getCredits() + ", Prerequisites: " + programmingCourse.getPrerequisites());
    }
}


//The LSP is fully applicable when working with methods and properties defined in the CourseInterface. It allows different subclasses to be treated interchangeably as long as the interaction is limited to the behaviors defined in the interface.
//However, when subclass-specific behaviors are involved that are not captured by the interface, the LSP cannot be directly applied without resorting to downcasting, which is a practice generally discouraged.