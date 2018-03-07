import java.util.ArrayList; 

public class WhileTest { 
	public static void main(String[] args)  {   
		ArrayList<Integer> list = new ArrayList<Integer>(); 
 
		list.add(7); 
		list.add(4);
		list.add(21);
		list.add(15);   
		System.out.println(list);  
		
		int i = list.indexOf(21);  
		list.remove(i);
		list.add(2, 12);  
		int index = 0;  
  		while (index < list.size())   { 
  			System.out.println(list.get(index)); 
  			index++;           
  		} 
  }           
} 
