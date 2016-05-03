
public class Day5Example2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10, y = 20;
		int [] myNumbers = {10, 30, 50, 80, 34};
		//not saved and the value will b lost after the update on it.
		x = increaseNumber(x);
		// y will be saved coz of y= so it will change the value and be saved
		y = decreaseNumber(y);
		//
		increaseNumbers(myNumbers);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		for (int i=0; i<myNumbers.length; i++){
			System.out.println("MyNumbers["+i+"] = " + myNumbers[i]);
			
			
		}
		
		

	}
	
	public static int increaseNumber(int x ){
		return x++;
		
	}
	
	public static int decreaseNumber(int y){
		return y--;
		
		
	}
	
	public static void increaseNumbers(int[] nums){
		for (int i=0; i<nums.length; i++){
			nums[i]++;
			
		}
	}

}
