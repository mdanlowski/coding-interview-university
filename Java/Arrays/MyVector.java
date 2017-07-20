// Implementation of a dynamic, mutable array
// https://github.com/mdanlowski/coding-interview-university/blob/master/README.md#arrays
// data type: String

// TODO all commented out methods
// DONE getter for N

public class MyVector {
	
	private int N; // store current array length
		
	/*private*/ String[] arr; 						// STRING ARRAY ENTITY WE WORK ON IN THIS CLASS
		
	MyVector(int initSize){ // CONSTR.
		N = initSize;
		arr = new String[N];
		for(int x=0; x < N; x++){
			arr[x] = "one ";
		}
	}
	
	public int size(){
		return N;
	}
	
	public int capacity(){
//		System.out.println("Free cells yet: " + (arr.length - N));
		return arr.length;// - N; // number of items it can hold (yet)
	}
	
	public boolean isEmpty(){
		return ( N == 0 );
	}
	
	public String at(int index){ // returns item at given index, blows up if index out of bounds
		if ( index >= 0 && index <= (arr.length-1) ) return arr[index];
		else return null;
	}
	
	public void push(String item){
		if( N == arr.length ){  // check if full and then:
			resize(2*N);		// uwotm8 to myself: WHY N DOES NOT ALWAYS REFLECT SIZE: WE JUST _USE_ N TO RESIZE THE ARR, THEN LENGTH CHANGES BUT N STAYS AT PREV. VAL.
		}
		arr[N++] = item;
	}
	
	public String pop(){ // remove from end, return value
		
		if( N == arr.length/4 ){
			resize(arr.length/2);
		}
			String temp = arr[N-1];
			arr[--N] = null;
			
			//N--; // OR without this line but with: arr[--N] = null; This is easier to read though
			
		return temp;
	}
	
	public void insert(int index, String item){
		// inserts item at index, shifts that index's value and trailing elements to the right
		if ( index >= N ){
			push(item);
		}
		else {
			if ( N == arr.length ) {
				resize(2*N);
			}
			
			for (int i = 0; i <= N-index; i++){
				arr[N-i] = arr[N-1-i];
				if(i==N-1) break;
			}
			arr[index] = item;
			N++;
		}
	}
	
	public void prepend(String item) {
		//can use insert above at index 0, therefore user does not have to specify index if he wishes to "unshift" the stack
		insert(0, item);
	}
	
	public void delete(int index){
		// delete item at index, shifting all trailing elements left
		if( index <= N-1 ){
			for (int i = 0; i < N-1-index; i++){
				arr[index+i] = arr[index+i+1];
			}
			arr[N-1] = null;
			}
		else {
			System.out.println("Index exceeding size, nothing done");
		}
	}
	
	public void remove(String item){
		//looks for value and removes index holding it (even if in multiple places)
		
	}
	
	public int find(String item) {
		// looks for value and returns first index with that value, -1 if not found
		int ret = 0;
		for (int i = 0; i < N; i++){
			if( arr[i].equals(item) ) {
				ret = i;
				break;
			}
		}
		if( ret > 0 ) return ret;
		else return -1;
	}

	
	private void resize(int newCap){
		// private function; when you reach capacity, resize to double the size; when popping an item, if size is 1/4 of capacity, resize to half
		String[] temp = new String[newCap];
		
		if(newCap < N) // then pushing
		{
			for(int i = 0; i < arr.length; i++){
				temp[i] = arr[i];
			}
		}
		else if (newCap > N) // then popping
		{
			for(int i = 0; i < newCap/2; i++){
				temp[i] = arr[i];
			}
		}
		
		arr = temp;
	}

}
