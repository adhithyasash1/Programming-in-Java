public class Employee{                       
        private String name;
        private String dept;
                                   
        public Employee(String name, String dept) {         
                this.name = name;
                this.dept = dept;
        }
                                   
        public String getName() {
                return name;
        }
                                   
        public void setName(String name) {       
                this.name = name;
        }
                                   
        public String getDept() {               
                return dept;
        }
                                   
        public void setDept(String dept) {               
                this.dept = dept;
        }          
}
           
public class Manager extends Employee{
        public String secretary;

        public Manager(String name, String dept, String sn) {
                super(name, dept);
                secretary = sn;
        }

        public void setSecretary(String sn) {
                this.secretary = sn
        }
}


// private variables of Employee can be changed in the Manager class using Mutators.
// private variables of Employee can be changed in the Manager class using superclass constructor.


/*
Employee e = new Manager('Sashi', 'CS', 'Head');

we cannot invoke e.setSecretary()

since Employee class doesn't have a  method named setSecretary.

If Employee class had a method called setSecretary() then, e.setSecretary would 
override that method and implement setSecretary() method described in Manager class
*/






/*
Typecasting

typecasting can only be done on a object if 
its created as an instance of its subclass
*/


Employee e = new Manager();
Employee f = new Employee();

e.setSecretary(x); // static type checking disallows this, there is no method setSecretary in Employee class

((Manager)e).setSecretary(x); // executes without error, since e is declared at runtime as object of Manager class

((Manager)f).setSecretary(y); // throw error during runtime, Cast fails since f is not an instance of Manager class

// while coding you can use reflection to use this concept

if (e instanceof Manager) {
        ((Manager)e).setSecretary(x); 
}
// else you won't be able to typecast right? 