package lab1;
public class Main {
    public static void main(String[] args) {
        Course courseOne = new AdvancedJavaCourse("AdvJava", "123");
        Course courseTwo = new IntroJavaCourse("IntroJava", "234");
        Course courseThree = new IntroToProgrammingCourse("Programming", "345");

        System.out.println(courseOne);
        System.out.println(courseTwo);
        System.out.println(courseThree);
    }
}
