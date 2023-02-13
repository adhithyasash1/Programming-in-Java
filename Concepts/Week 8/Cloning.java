// Object class defines a method clone()

Employee e1 = new Employee(...);
e2 = e1.clone(); // returns a bitwise copy

/*
why a bitwise copy? 
    Object class doesn't have access to 
    private variables of Employee class
*/






/*
Shallow Copy

Copy happens faithfully at the top level
but the foundations/semantics of what the
object really is, is bleak!

ex : 
e2 = e1.close(); // bitwise copy is a shallow copy

e2 inherits the correct String name, double Salary etc 

but e2 doesn't know that the class e1 belongs
to has a method updateDate() which updates 
Data instance variable of e1 object

e2 would have not copied the actual Date 
instance variable value but just the memory location of it.

because Date is an instance variable that is pointing to an Object
unlike String and double which are wrapper classes and primitive datatypes

Date is an object with its on specific implementation enabled by the Employee class,
hence a clone wouldn't be faithful all the way down  following it into Date class objects!

Hence any change we make in e1 using its methods, that gets reflected in e2 as well!

This is how a Shallow Copy works.
*/

public class Employee {
    private String name;
    private double salary;
    private Date birthday;
    ...
    public void setname(String n){
        name = n;
    }
    
    public void setbday(int dd, int mm, int yy){
        birthday.update(dd,mm,yy);
    }
}
...

Employee e1 = new Employee("Dhruv", 21500.0);
Employee e2 = e1.clone();
e2.setname("Eknath"); // e1 name not updated
e2.setbday(16,4,1997); // e1 bday updated!






/*
Deep Copy

Deep Copy recursively copies the nested Objects as well

ex: There will be two proper dates unlike shallow copy

involves over-riding clone() method from Object Class
*/

public class Employee {
    private String name;
    private double salary;
    private Date birthday;
    ...
    public void setname(String n) {...}
    
    public void setbday(...) {...}
    
    public Employee clone() {
        Employee newemp = (Employee) super.clone();
        Date newbday = birthday.clone();
        newemp.birthday = newbday;
        return newmp;
    }
}

/*
In the above code,

you first use the superclass clone. So, you take the object
clone and make a bitwise copy. And now, you recognize that this birthday is also something
that needs to be cloned. 

So, you make a bitwise copy of the birthday object. And now we
assign, so we have created a new employee object, which is a bitwise copy of the old
employee object.

Now, this includes a reference to the old birthday object, which we does not want. So, we
make a new birthday object by keeping a bitwise copy of the birthday thing. 

And we assign the birthday value of the new employee to be this new birthday object to be created. 

So, we have basically done a nested copy. So, in first copy this whole thing. And then this thing was
pointing here. So, we made a copy here and then we make this new e2 point here.

So, in this process, now everything is done, we does not have any overlap between e1 and e2,
they both have a separate copy of the name, a separate copy of the salary. And there are 2
birthday objects, one pointed to by e1 and one pointed to by e2.
*/

public Employee clone(){
    Employee newemp = (Employee) super.clone() // typecasting 
    Date newbday = birthday.clone();
    newemp.birthday = newbday;
    return newmp;
}

/*

since super.clone() is a method belonging to the Object class, it returns an Object
so we Typecast that to the required, note subclass cannot point to an object of the super class

ex : in here, we typecast{ (Employee)super.close() }to Employee object
*/


/*
Problems? 

So, what could go wrong with a deep copy? 

So, the problem with this is the hierarchical nature of the Java class
hierarchy. So, once I say that employee allows a deep copy, it has its own version of clone,
then that clone is now visible below the hierarchy. So, if I now extend employee with a
manager, then manager will also inherit the clone from the most recent ancestor, which is
employee.
*/


public class Employee {
    private String name;
    private double salary;
    private Date birthday;
    ...
    public void setname(String n){...}
    public void setbday(...){...}
    public Employee clone(){...}
}

public class Manager extends Employee {
    private Date promodate;
    ...
}

/*
So, suppose now that we have this Manager class, which extends employee and it has not 1
date, but 2 dates, it gets a date from the parent class employee. So, it has these 3 private
fields, which it cannot even access. So, it gets this, but it also has a new date, say the
promotion date. So, the manager has a birthday and also the date on which they got their
promotion.

So, now, the problem is that if I invoke an employee copy on this, it will do a shallow copy of
the whole object, then it will correctly assign a shallow copy of date in the new object. So, it
has a new birthday, but it has no knowledge that there are sub classes like manager which
have other objects below it, which need also to be deep copy.

So, if manager, the class manager inherits this clone, and it does not
overwrite clone with a better deep copy clone, which uses the object, the clone of employee,
and then in addition, also deep copies this promo date, then we will have something where we
end up with a shallow copy of the promotion date.

So, therefore, if I have 2 managers, now when I make a clock copy, if I 1 manager and I make
a copy of that manager, then the second manager will have an independent salary name and
independent salary and independent birthday, but we will share the joining date/promotion date with the
original one. So, if I update the joining date of one manager, it will update here. So, we are
back to the same problem shallow copy.
*/






/*
implements Cloneable

To allow clone() to be used, a class
has to implement Cloneable interface
    -> Marker interface

clone() in Object is protected
Only Employee objects can clone()

Redefine clone() as public to allow
other classes to clone Employee
Expanding visibility from protected
to public is allowed

Object.clone() throws
CloneNotSupportedException
Catch or report this exception
Call clone() in try block
*/

public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date birthday;
    ...
    public void setname(String n){...}
    
    public void setbday(...){...}
    
    public Employee clone() throws CloneNotSupportedException {...} 
    
    // override clone() method by just making it public, cuz its protected by default
    // you can say inside -> return (Employee)super.clone(); 
    // always remember to typecast this clone into the suitable object, cuz its coming in as a raw object from Object class
    // Always use clone() in a try block with this checked exception in place!
}

/*
Restrictions on clone() method :

    • 
    the first restriction is that a class that uses clone, which allows clone to be done on its objects must indicate this by implementing this interface called Cloneable.

    If we do not implement Cloneable, then this will give a compiler error saying that objects of this class is not a candidate for clone() to be applied upon.

    So, Cloneable does not do anything, so Cloneable is just an indicator it is like a Boolean value, it is just saying that this particular class is an instance of the interface Cloneable. So, this we have seen before, but here, it is just a marker was called a marker interface, it does not have any functions that need to be implemented. So, to implement Cloneable this class has to do nothing else except declare that it implements clone.

    • 
    So, if you want other classes to clone not only must to implement Cloneable you must also redefine clone to be public. 
    So, at a simple level, you can just redefine it to be public and make the effect of clone just super
    clone.
    
    So, you can just say public whatever clone say employee say and you can say return a cast
    version of the object clone. So, this really does not change the meaning of clone it is still the shallow copy, but you have made it public. 
    
    So, other classes can invoke clone on objects of type employee and these other classes will get back not an object, but an employee. So,
    expanding the visibility is allowed.
    
    • 
    if you actually call clone, and the class does not implement this interface, 
    then you will get this CloneNotSupportedException.
    
    Remember that when you extend or override a function with some kind of that throws an
    exception, a checked exception like this, then you must either continue to throw the checked
    exception, or you must fix it, you must catch it. 
    
    So, therefore, if now we also write this clone thing, we must, the simplest way is to just 
    continue to throw clone support exception.
*/

