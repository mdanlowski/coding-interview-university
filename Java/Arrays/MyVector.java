// Implementation of a dynamic, mutable array
// https://github.com/mdanlowski/coding-interview-university/blob/master/README.md#arrays
// data type: String

// TODO implement size() and change the use of Array.length to MyVector.size() everywhere below
// TODO all commented out methods
// TODO getter for N

public class MyVector {
	
	private
		int N; // store current array length
		String[] arr; 						// STRING ARRAY ENTITY WE WORK ON IN THIS CLASS
		
	MyVector(int initSize){ // CONSTR.
		N = initSize;
		arr = new String[N];
		for(int x=0; x < N; x++){
			arr[x] = "[]"; 					// Initial fill to avoid nulls - this surely needs to be done differently 
		}
	}
	/*
//	public int size(){ 						// ayy what?
//		int size = 0;
////			while( arr[size] != null){		// THIS WILL REQUIRE CATCHING EXCEPTIONS
////				size++;
////			}
//		return size+1;
//	}
//	public void capacity(){
//		// number of items it can hold
//	}
//	public void is_empty(){
//		
//	}
//	public void at(int index){
//		// returns item at given index, blows up if index out of bounds
//	}
	*/
	public void push(String item){
		if( N == arr.length ){ // check if full and then:
			resize(2*N);
		}
		arr[N++] = item;
	}
	
	public void pop(){ // remove from end, return value
		
	}
/*		
//	public void insert(int index, String item){
//		// inserts item at index, shifts that index's value and trailing elements to the right
//	}
//	public void prepend(String item) {
//		//can use insert above at index 0
//	}
//	public void delete(int index){
//		// delete item at index, shifting all trailing elements left
//	}
//	public void remove(String item){
//		//looks for value and removes index holding it (even if in multiple places)
//	}
//	public void find(String item) {
//		// looks for value and returns first index with that value, -1 if not found
//	}
 * */
	private void resize(int newCap){
		// private function; when you reach capacity, resize to double the size; when popping an item, if size is 1/4 of capacity, resize to half
		String[] temp = new String[newCap];
		for(int i = 0; i < arr.length; i++){
			temp[i] = arr[i];
		}
		arr = temp;
	}

}
