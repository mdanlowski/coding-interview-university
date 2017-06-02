// Implementation of a dynamic, mutable array
// https://github.com/mdanlowski/coding-interview-university/blob/master/README.md#arrays
public class Main {

	public static void main(String[] args) {
		
		MyVector Arr = new MyVector(1);
		
//		System.out.println(Arr.N); // N should be private
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		
		Arr.push("ayy ");
		Arr.push("lmao ");
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
	}
}
