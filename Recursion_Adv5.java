import java.util.ArrayList;

public class Recursion_Adv5 {
//Q-> Print all the subsets of a set of first n natural numbers
	
	public static void findSubset(int n,ArrayList<Integer>subset) {
		
		if(n==0) {
			
			for(int i=0; i<subset.size();i++) {
				System.out.print(subset.get(i)+" ");
			}
			System.out.println();
			return;
		}
		
		// Add hoga tab 
		 subset.add(n);
		 findSubset(n-1,subset);
		 
		 // add nahi hoga tab
		 subset.remove(subset.size()-1); // jo add nhi hona chata usko nikal diya
		 findSubset(n-1,subset);
		 
	}
	
	public static void main (String[]args) {
		int n = 3;
		ArrayList<Integer> subset = new ArrayList<>();
		findSubset(n,subset);
	}
}
