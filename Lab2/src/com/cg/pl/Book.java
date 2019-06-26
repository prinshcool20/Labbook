package com.cg.pl;

import java.util.Collection;

public class Book extends WrittenItem {
public Book() {
	// TODO Auto-generated constructor stub
}
	public Book(int id1, String title, String author, int noCopies) {
		// TODO Auto-generated constructor stub
		super(id1,title,author,noCopies);
	}

     ///checkin..........
	@Override
	public void checkIn(int bookId) {
		Item ob=bookList.get(bookId);
		ob.setNoCopies(ob.getNoCopies()+1);
		System.out.println("Book Returned Successfully");
	}
	///checkout.....................
	@Override
	public void checkOut(int bookId) {
		// TODO Auto-generated method stub
		Item ob=bookList.get(bookId);
		ob.setNoCopies(ob.getNoCopies()-1);
	}
	///display.............
	@Override
	public void print() {
	Collection<Item> c=bookList.values();
	for(Item o:c) {
		System.out.println(o.getBookId()+" "+o.getTitle()+" "+o.getNoCopies());
	}
		
	}
	//add........
	@Override
	public Item addItem(int id1, String title, String author, int noCopies) {
		Item item=new Book(id1,title,author,noCopies);
		bookList.put(id1, item);
		return item;
	}

}
