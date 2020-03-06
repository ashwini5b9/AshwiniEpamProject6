package epamcom.collectionFramework;

import java.util.*;
public class CollectionFrameWork {
    public static void main(String[] args){
    	CollectionFrameWorkList<Integer> list = new CollectionFrameWorkList<Integer>();
        boolean status = true;
        @SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
        while(status){
        	System.out.println("Operation on list,Select one among the following");
        	System.out.println("1. Add element");
        	System.out.println("2. Remove element");
        	System.out.println("3. Size");
        	System.out.println("4. Access element");
        	System.out.println("5. Print");
        	int n = sc.nextInt();
        	switch(n) {
	        	case 1 : 
	        		System.out.println("Enter number to be added");
	        		list.addingElement(sc.nextInt());
	        		System.out.println("Do you want to continue?");
		        	if(sc.next().charAt(0) == 'y') {
		        		status = true;
		        		break;
		        	} else {
		        		System.out.println("finish");
		        		status = false;
		        		break;
		        	}
	        	case 2 : 
	        		System.out.println("Enter numstatuser to statuse deleted");
	        		list.removingElement(sc.nextInt());
		        	System.out.println("Do you want to continue?");
		        	if(sc.next().charAt(0) == 'y') {
		        		System.out.println("finish");
		        		status = true;
		        		break;
		        	} else {
		        		status = false;
		        		break;
		        	}
	        	case 3 : 
	        		System.out.println("The size of list is "+list.gettingsize());
		        	System.out.println("Do you want to continue?");
		        	if(sc.next().charAt(0) == 'y') {
		        		status = true;
		        		break;
		        	} else {
		        		System.out.println("finish");
		        		status = false;
		        		break;
		        	}	
	        	case 4 :
	        		System.out.println("Enter index : Indexing starts from 0");
	        		System.out.println("The element is "+list.gettingElement(sc.nextInt()));
		        	System.out.println("Do you want to continue?");
		        	if(sc.next().charAt(0) == 'y') {
		        		status = true;
		        		break;
		        	} else {
		        		System.out.println("finish");
		        		status = false;
		        		break;
		        	}
	        	case 5 : 
	        		System.out.println("The list is "+list);
		        	System.out.println("Do you want to continue?");
		        	if(sc.next().charAt(0) == 'y') {
		        		status = true;
		        		break;
		        	} else {
		        		System.out.println("finish");
		        		status = false;
		        		break;
		        	}
        	}
        }
    }
}