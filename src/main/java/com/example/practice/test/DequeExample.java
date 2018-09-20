package com.example.practice.test;

//Java program to demonstrate working of 
//Deque in Java 
import java.util.*; 

public class DequeExample 
{ 
 public static void main(String[] args) 
 { 
     Deque<Integer> deque = new LinkedList<Integer>();
     
     // We can add elements to the queue in various ways 
     deque.add(1); // add to tail
     deque.add(2); // add to tail 
     deque.add(3); // add to tail 
     deque.add(4); // add to tail 
     deque.add(5); // add to tail 
     deque.add(6); // add to tail 

     
     printReverse(6,5,deque);
     System.out.println(deque + "\n"); 

//     // Iterate through the queue elements. 
//     System.out.println("Standard Iterator"); 
//     Iterator iterator = deque.iterator(); 
//     while (iterator.hasNext()) 
//         System.out.println("\t" + iterator.next()); 
//
//
//     // Reverse order iterator 
//     Iterator reverse = deque.descendingIterator(); 
//     System.out.println("Reverse Iterator"); 
//     while (reverse.hasNext()) 
//         System.out.println("\t" + reverse.next()); 
//
//     // Peek returns the head, without deleting 
//     // it from the deque 
//     System.out.println("Peek " + deque.peek()); 
//     System.out.println("After peek: " + deque); 
//
//     // Pop returns the head, and removes it from 
//     // the deque 
//     System.out.println("Pop " + deque.pop()); 
//     System.out.println("After pop: " + deque); 
//
//     // We can check if a specific element exists 
//     // in the deque 
//     System.out.println("Contains element 3: " + 
//                     deque.contains("Element 3 (Tail)")); 
//
//     // We can remove the first / last element. 
//     deque.removeFirst(); 
//     deque.removeLast(); 
//     System.out.println("Deque after removing " + 
//                         "first and last: " + deque); 

 }

	private static void printReverse(int i, int j, Deque<Integer> deque) {
		 Deque<Integer> deque1 = new LinkedList<Integer>();
	     Iterator iterator = deque.iterator(); 
	     while (iterator.hasNext()) {
	    	 int value = (Integer)iterator.next();
	    	 if(value == j) {
	    		 Iterator reverse = deque1.descendingIterator(); 
	    	     while (reverse.hasNext()) 
	    	         System.out.print(" " + reverse.next());
	    	     
	    	     break;
	    	 }
	    	 deque1.add(value);
	     }
	     
	     iterator = deque.iterator(); 
	     while (iterator.hasNext()) {
	    	 int value = (Integer)iterator.next();
	    	 if(value >= j) {
	    		 System.out.print(" " + value);
	    	 }
	     }
		 
	} 
}