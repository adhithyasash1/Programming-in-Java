// 1

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member member) {
        if (this.height == member.getHeight()) {
            return 0;
        } else if (this.height > member.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}


@Override
public int compareTo(Member member) {
    return this.height - member.getHeight();
}


List<Member> member = new ArrayList<>();
member.add(new Member("mikael", 182));
member.add(new Member("matti", 187));
member.add(new Member("ada", 184));

member.stream().forEach(m -> System.out.println(m));
System.out.println();
// sorting the stream that is to be printed using the sorted method
member.stream().sorted().forEach(m -> System.out.println(m));
member.stream().forEach(m -> System.out.println(m));
// sorting a list with the sort-method of the Collections class
Collections.sort(member);
member.stream().forEach(m -> System.out.println(m));






// 2

public class Employee {
    
   private int employeeId;
   private String name;
   private String department;

   public Employee (int employeeId,String name, String department){
      this.employeeId = employeeId;
      this.name = name;
      this.department = department;
   }   

   public String getName(){
      return name;
   }

   public String getDepartment(){
      return department;
   }

   @Override
   public String toString() {
      return "\n[ " + employeeId
         +"," + name
         +"," + department
         +" ]";
   }    
}

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
   @Override
   public int compare(Employee employee1, Employee employee2) {
      return employee1.getName().compareTo(employee2.getName());
   }    
}

public class ObjectSortingDemo {

   public static void main(String[] args){

      /* Use of Arrays.sort() method to sort array  */
      Employee[] employeesObjects = new Employee[] {
         new Employee(100, "Aditya", "Finance"),
         new Employee(30, "Sashi", "Finance"),
         new Employee(50, "Goku", "Finance"),
         new Employee(12, "Piccolo", "Finance")
      };

      System.out.println("Unsorted Array : " 
         + Arrays.toString(employeesObjects));
      Arrays.sort(employeesObjects,new EmployeeNameComparator());   
      System.out.println();
      System.out.println("Sorted Array by name: " 
         + Arrays.toString(employeesObjects));      
   }
}   






// 3

package comparableVsComparator;

/**
 *  This class implements Comparable interface which has one method
 *  compare which takes one object and compare it to current object 
 *  For example, if one adds two keys a and b such that (!a.equals(b) &&
 *  a.compareTo(b) == 0) to a sorted set that does not use an explicit
 *  comparator, the second add operation returns false (and the size of
 *  the sorted set does not increase) because a and b are equivalent from
 *  the sorted set's perspective.
 *
 */

class Book implements Comparable {

    String tittle;
    String author;
    int publicationYear;

    public Book(String name, String author, int publicationYear) {
        super();
        this.tittle = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String name) {
        this.tittle = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book [name=" + tittle + ", author=" + author + ", publicationYear=" + publicationYear + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
        result = prime * result + publicationYear;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (tittle == null) {
            if (other.tittle != null)
                return false;
        } else if (!tittle.equals(other.tittle))
            return false;
        if (publicationYear != other.publicationYear)
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return getTittle().compareTo(((Book) o).getTittle());
    }

}

package comparableVsComparator;

import java.util.Comparator;

/**
 * 
 * This is NameComparable implements the comparator interface (Raw type) Which
 * sort the book objects on the basis Alphabetic order we will pass this class
 * to TreeSet constructor , Which is called strategic pattern..
 * 
 * Comparator interface has a one method compare which takes two objects and
 * sort them .. For example, suppose one adds two elements a and b such that
 * (a.equals(b) && c.compare(a, b) != 0) to an empty TreeSet with comparator c.
 * The second add operation will return true (and the size of the tree set will
 * increase) because a and b are not equivalent from the tree set's perspective,
 * even though this is contrary to the specification of the Set.add method.
 * 
 */
public class NameComparable implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Book) o1).getTittle().compareTo(((Book) o2).getTittle());
    }

}


package comparableVsComparator;

import java.util.Set;
import java.util.TreeSet;


public class Runner {
    
    public static void main(String[] args) {
        
        //Passing NameComparable class to TreeSet constructor is called strategy pattern 
        Set<Book> tSet  = new TreeSet<>(new NameComparable());
        
        
        Book book1 = new Book("dbz" , "frieza" , 2014);
        Book book2 = new Book("dbz" , "cell" , 2017);
        Book book3 = new Book("dbz" , "world tourney" , 2014);
        Book book4 = new Book("dbz" , "majin buu" , 2018);
        
        //adding three book objects to the Set
        tSet.add(book1);
        tSet.add(book2);
        tSet.add(book3);
        tSet.add(book4);
        
        System.out.println(tSet);
    }

}






// 4

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        // compare scores of a and b in DESCENDING order
        if (a.score < b.score)
            return 1;
        else if (a.score > b.score)
            return -1;
        else {//in case scores are equal
            //compare names of a and b in ASCENDING order
            int minLength = Math.min(a.name.length(), b.name.length());
            for (int i=0; i < minLength; i++) {
                //compare in common string length
                int aChar = Character.getNumericValue(a.name.charAt(i));
                int bChar = Character.getNumericValue(b.name.charAt(i));
                if (aChar < bChar)
                    return -1;
                else if (aChar > bChar)
                    return 1;
                else
                    continue;
            }
            //if the code runs to HERE without return,
            //eg. [bb, 20] and [bbb, 20]
            //then compare string lengths for decision
            if (a.name.length() < b.name.length())
                return -1;
            else if (a.name.length() > b.name.length())
                return 1;
            else
                return 0;
        }
    }
}


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/* 
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. 
The Player class is provided in the editor below. It has two fields:

1. name: a string.
2. score: an integer.

Given an array of n Player objects, write a comparator that sorts them in order of decreasing score. 
If 2 or more players have the same score, sort those players alphabetically ascending by name. 
To do this, you must create a Checker class that implements the Comparator interface, 
then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

In short, when sorting in ascending order, a comparator function returns -1 if a<b, 1 if a>b, and 0 if a=b.

For example, given n = 3 Player objects with Player.name, Player.score values of 
data = [Smith,20],[Jones,15],[Jones,20], we want to sort the list as 
data_sorted = [Jones,20],[Smith,20],[Jones,15].

Function Description

Declare a Checker class that implements the comparator method as described. 
It should sort first descending by score, then ascending by name. 
The code stub reads the input, creates a list of Player objects, uses your method to sort the data, and prints it out properly.
*/






// 5

