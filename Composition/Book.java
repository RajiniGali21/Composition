package com.kn.Composition;

public class Book
{
 Page page;
 
public Book(String content)
{
	this.page = new Page(content);
	
}
public void readBook()
{
	System.out.println("book reading is in process......");
}
}
