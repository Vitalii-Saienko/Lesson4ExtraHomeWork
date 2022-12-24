public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("John");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Bob");
        robot2.sayYourName();
        robot2.sayHello();

    }
}
