/**
	A class providing ArrayList-like functionality for a list of String objects.
**/
public class StringList {

	//declare data members to hold an array of strings and an
	//int to keep track of the number of items in the list

	/**
		A constructor that takes no input and instantiates a new
		String[] of size 10.
	**/
	public StringList() {
		//YOUR CODE HERE
	}

	/**
		A constructor that takes a size and instantiates a new
		String[] of size size.
	**/
	public StringList(int size) {
		//YOUR CODE HERE
	}

	/**
		Adds the new item s to the end of the array 
		and returns true. In case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to 
		the new array.
	**/
	public void add(String s)  {
		//YOUR CODE HERE
	}
	
	/**
		Adds the new item to the array at the location 
		specified by index, in case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to the
		new array.
	**/
	public void add(int index, String s) {
		//YOUR CODE HERE
	}

	/**
		Returns a string representation of the array.
		Following is an example of the expected format:
		{A,B,C,D,E}
		For full credit your solution must iterate over
		the array and build the string. 
	**/
	public String toString() {
		//REPLACE WITH YOUR CODE
		return null;
	}


	/**
		Returns true if the array contains the string s
		and false otherwise.
	**/
	public boolean contains(String s) {
		//REPLACE WITH YOUR CODE
		return false;
	}

	/**
		Returns true if there are no elements in the array
		and false otherwise.
	**/
	public boolean isEmpty() {
		//REPLACE WITH YOUR CODE
		return false;
	}

	/**
		Returns the number of elements in the array. Note this
		is not the total number of spaces in the array, but 
		the total number of valid elements.
	**/
	public int size() {
		//REPLACE WITH YOUR CODE
		return -1;
	}

	/**
		Returns the first index of the given String,
		or -1 if not found.
	**/
	public int indexOf(String s) {
		//REPLACE WITH YOUR CODE
		return -1;
	}

	/**
		Returns the last index of the given String, 
		or -1 if not found.
	**/
	public int lastIndexOf(String s) {
		//REPLACE WITH YOUR CODE
		return -1;
	}

	/**
		Returns the String at the given index.
		Returns null if index is out of range.
	**/
	public String get(int index) {
		//REPLACE WITH YOUR CODE
		return null;
	}


	/**
		Removes the item at the given index and returns it.
		Returns null if index is out of range.
	**/
	public String remove(int index) {
		//REPLACE WITH YOUR CODE
		return null;
	}

	/**
		Removes the first occurance of the given item.
		Returns true if successful and false otherwise.
	**/
	public boolean remove(String s) {
		//REPLACE WITH YOUR CODE
		return false;
	}

	/**
		Replaces the element at index with the given string. 
		Returns null if index is out of range.
		Returns the item replaced.
	**/	
	public String set(int index, String s) {
		//REPLACE WITH YOUR CODE
		return null;
	}


}
