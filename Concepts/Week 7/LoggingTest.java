package openSession;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingTest {
    private static final Logger logger = Logger.getLogger("LoggingTest");

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.info("info message");
        logger.warning("warn message");
        logger.severe("severe message");
        logger.config("config message"); // this would not be displayed since it is above INFO level which the logger is set to.
    }
}
