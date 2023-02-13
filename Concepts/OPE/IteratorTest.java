package Mock4;
import java.util.*;

interface Iterator {
    public boolean has_next();
    public Object get_next();
}

class Customer {
    private String custName;
    private int numItems;

    public Customer(String custName, int num) {
        this.custName = custName;
        this.numItems = num;
    }
    public String toString() {
        return custName;
    }
    public int getNumItems() {
        return numItems;
    }
    public String getName() {
        return custName;
    }
}

class CustomerList {
    private Customer[] cArr;

    public CustomerList(Customer[] ca) {
        cArr = ca;
    }
    public Iterator getIterator() {
        return new CustIterator();
    }
    private class CustIterator implements Iterator {
        private int index;

        public CustIterator() {
            index = -1;
        }
        public boolean has_next() {
            return index < cArr.length - 1;
        }
        public Object get_next() {
            index++;
            return(cArr[index]);
        }
    }
}

public class IteratorTest {
    public static Customer getMaxCustomer(CustomerList cList) {
        // complete
        int maxi = 0;
        Customer ans = null;
        Customer x = null;
        Iterator it = cList.getIterator();
        while (it.has_next()) {
            Object obj = it.get_next();
            if (obj instanceof Customer) {
                x = (Customer)obj;
                if (x.getNumItems() > maxi) {
                    maxi = x.getNumItems();
                    ans = x;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] cA = new Customer[4];
        for (int i = 0; i < 4; i++) {
            cA[i] = new Customer(sc.next(), sc.nextInt());
        }
        CustomerList custList = new CustomerList(cA);
        System.out.println(getMaxCustomer(custList));
        sc.close();
    }
}
