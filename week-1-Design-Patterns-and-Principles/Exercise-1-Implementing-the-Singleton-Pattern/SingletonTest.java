package singleton;
public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("It is first message in log.");
        logger2.log("It is second message in log.");
        if (logger1 == logger2) {
            System.out.println("Created two logger instances are same then  Singleton works!");
        } else {
            System.out.println("Created two logger instances are different then Singleton failed.");
        }
    }
}
