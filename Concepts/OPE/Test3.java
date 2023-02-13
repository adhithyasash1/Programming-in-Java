package Mock14;
import java.util.*;

/*
Write a program that checks for balanced parentheses in an expression
i.e. whether the pairs and the order of  "{ ",  " } ”, " ( ", " ) ”, " [ ", " ] ” are correct in the given input.

The program should keep taking expressions as input one after the other,
until the user enters the word `done' (not case-sensitive).

After all the expressions are input, for each input,
the program should print whether the given expression is
balanced or not (the order of the output should match the order of the input).

If an input expression is balanced, print Balanced else print Not Balanced


public class Test3 {
    public static boolean balanceCheck(String sequence) {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> expr_arr= new ArrayList<String>();
        String inp=null;

        do {
            inp = s.nextLine();
            if(!inp.equalsIgnoreCase("Done"))
                expr_arr.add(inp);
        } while(!inp.equalsIgnoreCase("Done"));

        for(String expr : expr_arr) {
            if(balanceCheck(expr)) {
                System.out.println("Balanced");
            }
            else {
                System.out.println("Not Balanced");
            }
        }
    }
}
 */