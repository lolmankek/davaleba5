public class java_logger {

    private Object Exeption;

    void JavaLogger (LoggingLevels logginglevel, String message){
        if (message == null) {
            System.out.println("message is empty");
        }
        switch (logginglevel){
            case ERROR -> System.out.println("ERROR " + message);
            case INFO -> System.out.println("INFO" + message);
            case WARNING -> System.out.println("WARNING " + message);
        }

    }


    public static void main(String[] args) {
        java_logger logger = new java_logger();

        System.out.println("---------------------");
        try{
            logger.JavaLogger(LoggingLevels.ERROR,"this is error message");
            logger.JavaLogger(LoggingLevels.INFO,"this is info message");
            logger.JavaLogger(LoggingLevels.WARNING,"this is warning message");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }

    }
}
