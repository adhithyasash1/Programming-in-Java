package openSession;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingTest1 {
    private static final Logger logger = Logger.getLogger("LoggingTest");

    public static String getFullname(String fn, String ln) {
        if (fn == "" || fn == null || fn.length() == 0 || fn == " ") {
            logger.warning("Bad Arguments");
        }
        return fn.concat(ln);
    }

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        System.out.println(getFullname("","Sashi"));
    }
}