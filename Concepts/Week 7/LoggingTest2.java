package openSession;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingTest2 {
    private static final Logger logger = Logger.getLogger("LoggingTest");

    public static String getFullname(String fn, String ln) throws IOException {
        FileHandler fh = new FileHandler("logging.log", true);
        logger.addHandler(fh);
        if (fn == "" || fn == null || fn.length() == 0 || fn == " ") {
            logger.warning("Bad Arguments");
        }
        return fn.concat(ln);
    }

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.INFO);
        System.out.println(getFullname("","Sashi"));
    }
}
