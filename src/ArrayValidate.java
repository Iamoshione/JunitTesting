
public class ArrayValidate {
	
	public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }
	

}
//here i created a method to return the highest number in an array 
// the method takes an array as an argument
//i declared a variable called max to capture the highest value
//i created a for loop to iterate through the array
//i used the Math.max method which returns the highest value of the 2 arguments passed to it
// i then returned the highest value 

