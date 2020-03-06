package epamcom.collectionFramework;

import java.util.Arrays;
public class CollectionFrameWorkList<E> {
	private int c = 0;
	private static final int INITIAL_c = 10;
	private Object n[];
	public CollectionFrameWorkList() {
		n = new Object[INITIAL_c];
	}
	public void addingElement(E e) {
		if (c == n.length) {
			ensure();
		}
		n[c++] = e;
	}
	public E gettingElement(int i) {
		if (i >= c || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) n[i];
	}
	public E removingElement(int i) {
		if (i >= c || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		Object item = n[i];
		int numElts = n.length - ( i + 1 ) ;
		System.arraycopy(n, i + 1, n, i, numElts ) ;
		c--;
		return (E) item;
	}
	public int gettingsize() {
		return c;
	}
	public String toString(){
		 StringBuilder s = new StringBuilder();
		 s.append('[');
		 for(int i = 0; i < c ;i++) {
			 s.append(n[i].toString());
			 if(i<c-1){
				 s.append(",");
			 }
		 }
		 s.append(']');
		 return s.toString();
	}	
	private void ensure() {
		int newSize = n.length * 2;
		n = Arrays.copyOf(n, newSize);
	}
}
