package org.tnsif.collection;

import java.util.*;
//program to demonstrate DI in the form of collection
public class CollectionDemo {
	private List<String> contactNo;
	private Set<String> Books;
	public List<String> getContactNo() {
		return contactNo;
	}
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public Set<String> getBooks() {
		return Books;
	}
	public void setBooks(Set<String> books) {
		Books = books;
	}
	
	public void display()
	{
		System.out.println("List of contactNo:  ");
		for(String contact : contactNo)
		{
			System.out.println( contact );
		}
		
		System.out.println("\n"+ "List of Books:  ");
		for(String b : Books)
		{
			System.out.println( b );
		}
	}
	
	
}
