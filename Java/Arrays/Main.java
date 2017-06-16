// Implementation of a dynamic, mutable array
// https://github.com/mdanlowski/coding-interview-university/blob/master/README.md#arrays
public class Main {

	public static void main(String[] args) {

		MyVector Arr = new MyVector(1);
		System.out.println(Arr.size()+"\t"+Arr.capacity());

//		Arr.push("x ");
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println("\n"+Arr.size()+"\t"+Arr.capacity());

		Arr.insert(8, "lamaeo");
//		Arr.insert(0, "lamaeo");
//		Arr.prepend("LMAO ");
//		Arr.prepend("LMAO ");
//		Arr.prepend("LMAO ");
//		Arr.prepend("LMAO ");
//
//		System.out.println();
//		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println("\n"+Arr.size()+"\t"+Arr.capacity());
		
		/*System.out.println(Arr.size() + " " + Arr.arr.length); // N should be private
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		Arr.push("to ");
		Arr.push("be ");
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		Arr.push("or ");
		Arr.push("ayy ");
		Arr.push("lmao ");
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		String t1 = Arr.pop();
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(t1 + " /popped");
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		String t2 = Arr.pop();
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(t2 + " /popped");
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		String t3 = Arr.pop();
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(t3 + " /popped");
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		String t4 = Arr.pop();
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(t4 + " /popped");
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		String t5 = Arr.pop();
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(t5 + " /popped");
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		String t6 = Arr.pop();
		
		for(String x : Arr.arr){
			System.out.print(x);
		}
		System.out.println();
		System.out.println(t6 + " /popped");
		System.out.println(Arr.size() + " " + Arr.arr.length);
		
		System.out.println(Arr.capacity());
		System.out.println(Arr.isEmpty());
		
		System.out.println(Arr.at(1)); */
		
		
		
	}
}
