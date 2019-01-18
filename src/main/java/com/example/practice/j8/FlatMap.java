package com.example.practice.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a simple text".split(" "));

		// list.stream().forEach(System.out::print);

		list.stream().map(s -> s.toCharArray()).collect(Collectors.toList()).stream().filter(s -> s.length > 4).forEach(System.out::print);
		
		list.stream().filter(s -> s.length()>4).forEach(System.out::print);
		
		List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
    	Writer w1 = new Writer("Mohan", books);
    	books = Arrays.asList(new Book(30, "CCC"), new Book(15, "DDD"));
    	Writer w2 = new Writer("Sohan", books);    	
    	books = Arrays.asList(new Book(45, "EEE"), new Book(25, "FFF"));
    	Writer w3 = new Writer("Vikas", books);
    	books = Arrays.asList(new Book(5, "GGG"), new Book(15, "HHH"));
    	Writer w4 = new Writer("Ramesh", books);
    	
    	List<Writer> writers = Arrays.asList(w1,w2,w3,w4);
    	
    	writers.stream().flatMap(x -> x.getBooks().stream()).filter(x-> x.getName().equals("BBB")).forEach(x-> System.out.println(x.getName()));
    	
    	writers.stream().filter(x-> x.getBooks().stream().anyMatch(y-> y.getName().equals("BBB"))).forEach(x-> System.out.println(x.getName()));
    	
    	writers.stream().flatMap(x -> x.getBooks().stream().filter(y->y.getName().equals("BBB"))).forEach(x-> System.out.println(x.getName()));
    	
	}
}


class Writer {
	private String name;
	private List<Book> books;
	public Writer(String name, List<Book> books) {
		this.name = name;
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
} 

class Book {
	private int price;
	private String name;
	public Book(int price, String name) {
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
} 