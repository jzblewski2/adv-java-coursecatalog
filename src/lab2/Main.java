package lab2;

public class Main {
    public static void main(String[] args) {
        Course courseOne = new IntroJavaCourse("IntJava", "123");
        Course courseTwo = new AdvancedJavaCourse("AdvJava", "234");
        Course courseThree = new IntroToProgrammingCourse("IntProgramming", "345");

        System.out.println(courseOne);
        System.out.println(courseTwo);
        System.out.println(courseThree);
    }
}
