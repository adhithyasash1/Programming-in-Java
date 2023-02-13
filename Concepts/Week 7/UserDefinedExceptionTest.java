package openSession;
import java.lang.*;

class DivisionByThreeException extends Exception{
}

class Division {
    int input;

    public Division(int input) {
        this.input = input;
    }
    public void div() throws DivisionByThreeException {
        // if condition inside this if block is satisfied then we are throwing a user-defined error!
        if (input % 3 == 0) {
            try {
                throw new DivisionByThreeException();
            }
            catch(DivisionByThreeException e) {
                System.out.println("Input should not be divisible by 3");
            }
        }
        // else we are proceeding with whatever the function is programmed to do!
        else {
            System.out.println(input/3);
        }
    }
}

public class UserDefinedExceptionTest {
    public static void main(String[] args) throws DivisionByThreeException {
        Division obj = new Division(10);
        obj.div();
    }
}
