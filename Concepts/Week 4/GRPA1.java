/*
Create an abstract class StringOperations that has the following abstract methods:
    String reverse(String s)
    int vowelCount(String s)

Create StringReverse class that extends StringOperations class but defines only 
String reverse(String s) method. It reverses the string which is passed as parameter 
and returns the reversed string.

Create UpdatedStrings class that extends StringReverse class 
and defines int vowelCount(String s) method.  
It counts the vowels in the string which is passed as parameter 
and returns the count.
*/

/* my answer */

import java.util.*;
abstract class StringOperations{
  public abstract String reverse(String s);
  public abstract int vowelCount(String s);
}

class StringReverse extends StringOperations {
    
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

class UpdatedStrings extends StringReverse {
    
    public int vowelCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||
                    s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'A'|| s.charAt(i) == 'E'||
                    s.charAt(i) == 'I' || s.charAt(i) == 'O' ||
                    s.charAt(i) == 'U') {
                count += 1;
            }
        }
        return count;
    }
}

class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
    System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
}


/* answer */

import java.util.*;
abstract class StringOperations{
  public abstract String reverse(String s);
  public abstract int vowelCount(String s);
}
abstract class StringReverse extends StringOperations{
  public String reverse(String s){
    String s1 = "";
    for(int i = s.length() - 1; i >= 0; i--){
      s1 = s1 + s.charAt(i);
    }
    return s1;
  }
}

class UpdatedStrings extends StringReverse{
  public int vowelCount(String s){
    int count = 0;
    char[] arr = {'a','e','i','o','u'};
    for(int i = 0; i < s.length(); i++){
      for(int j = 0; j <arr.length; j++){
        if(s.charAt(i) == arr[j]){
          count = count + 1; 
        }
      }
    }
    return count;
  }
}
class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
    System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
} 