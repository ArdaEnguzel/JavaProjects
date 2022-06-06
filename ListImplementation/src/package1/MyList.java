package package1;

import java.util.Arrays;

public class  MyList <T> {
	private T[] arr;
	private final static int DEFAULT_SIZE=10;
	private int size=0;
	private int capacity=0;
	private int lastelement=0;
	
	MyList(){
		 arr=  (T[]) new Object[DEFAULT_SIZE];
		 this.capacity=10;
	}
	MyList(int capacity) {
		arr= (T[]) new Object[capacity];
		this.capacity=capacity;
	}	
	public int size() {
		return size;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public void add(T elt) {
		if(lastelement+1==capacity) {
			int k=0;
			Object temp[] = new Object[capacity*2];
			for(T elm:arr) {
				temp[k]=elm;
				k+=1;	
				arr= (T[]) temp;
				arr[lastelement]=elt;
				lastelement+=1;
				size+=1;
				capacity=capacity*2;
				}
			
	}
				
		if(lastelement==0) {
			arr[0]=elt;
		}
		else {
			arr[lastelement]=elt;
		}
		lastelement+=1;
		size+=1;
		
	}
	public T get(int index) {
		try {
			return arr[index];
		}
		catch(Exception e) {
			return null;
			
		}
	}
	public int indexOf(T data) {
		for(int i=0;i<size;i++) {
			if(arr[i]==data) {
				return i;
				
			}
		}
		return 0;
		
	}
			
		
		
	
	public String toString() {
		return Arrays.toString(arr);
		}
	
    public void clear() {
    	int i=0;
    	while(i<this.size) {
    		arr[i]=null;
    		i+=1;
    	}
    }
    public T[] toArray() {
    	return this.arr;
    }
    public boolean containts(T data) {
    	for(T elt:arr) {
    		if(elt==data) {
    			return true;
    		}
    		
    	}
    	return false;
    }
    public boolean isEmpty() {
    	if(size==0) {
    		return true;
    	}
    	return false;
    }
    public int lastIndexOf(T data) {
    	int index=0;
    	for(int i=0;i<size;i++) {
    		if(arr[i]==data) {
    			index=i;
    		}
    		
    	}
    	return index;
    }
	

}

