/**
 * This is simple java logger class
 *
 * @author David_G.
 */
public class java_logger {

    private Object Exeption;

    /**
     * Method witch takes two parameters and checks if they are empty, if not method writes message for type (btw, If you read it don't know English:)
     * @param logginglevel
     * @param message
     */
    void JavaLogger(LoggingLevels logginglevel, String message) {
        if (message == null) {
            System.out.println("Dude message is empty, whyY?");
        } else {
            switch (logginglevel) {
                case ERROR -> System.out.println("ERROR " + message);
                case INFO -> System.out.println("INFO" + message);
                case WARNING -> System.out.println("WARNING " + message);
            }
        }
    }

    /**
     * This is Launcher, just a launcher with try-catch block
     *
     * @param args
     */
    public static void main(String[] args) {

        java_logger logger = new java_logger();

        try {
            logger.JavaLogger(LoggingLevels.ERROR, "this is error message");
            logger.JavaLogger(LoggingLevels.INFO, "this is info message");
            logger.JavaLogger(LoggingLevels.WARNING, "this is warning message");
        } catch (Exception e) {
            System.out.println("Exception is caught, BUM!!!");
        }

    }
}
