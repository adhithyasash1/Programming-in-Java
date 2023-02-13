package grpa1;

public class StringReverse extends StringOperations {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(i));
        }
        sb.append(temp.reverse());
        return sb.toString();
    }

    @Override
    public int vowelCount(String s) {
        return 0;
    }
}
