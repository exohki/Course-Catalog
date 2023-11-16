package lab1;

public class Driver {

    public static void main(String[] args) {
        Course introJava = new IntroJavaCourse("Intro to Java", "JAVA100");
        introJava.setCredits(3.0);

        Course advancedJava = new AdvancedJavaCourse("Advanced Java", "JAVA200");
        advancedJava.setCredits(4.0);

        Course introProgramming = new IntroToProgrammingCourse("Intro to Programming", "PROG101");
        introProgramming.setCredits(2.5);


        System.out.println("Course: " + introJava.getCourseName() + ", Credits: " + introJava.getCredits());
        System.out.println("Course: " + advancedJava.getCourseName() + ", Credits: " + advancedJava.getCredits());
        System.out.println("Course: " + introProgramming.getCourseName() + ", Credits: " + introProgramming.getCredits());
    }
}


// This architecture exemplifies a good use of abstraction and inheritance by centralizing common features and allowing specialized behavior in subclasses. However, it also illustrates some limitations, such as the potential for added complexity and the need for careful design to avoid rigid structures that are hard to modify.