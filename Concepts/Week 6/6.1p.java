import java.util.*;

class RemoveStudent{
	    
	    public boolean property(Double value) {
		        if(value<65)
			            return true;
	        return false;			
	    }
	    
	    public void detained(Map<String, Double> obj) {
            // Define the detained() method}}
            Map<String,Double> redmap=new TreeMap<String,Double>();
            for (Map.Entry<String,Double> ele : obj.entrySet()){
                if (property(ele.getValue()))
                    continue;
                redmap.put(ele.getKey(), ele.getValue());
            }
            System.out.println(redmap);
		}
	    
	    public void display(Map<String, Double> obj) {
		        System.out.println(obj);
	    }
}

public class Test {
	    public static void main(String[] args) {
		        Map<String,Double> map=new TreeMap<String,Double>();
		        Scanner scanner=new Scanner(System.in); 
		        for (int i=0; i<6; i++) {
			            map.put(scanner.next(),scanner.nextDouble());
		        }
		        RemoveStudent obj=new RemoveStudent();
		        obj.detained(map);
	    }
}