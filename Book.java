public class Book {
	//private data members
	private String title;
	private String author;
	private String publisher;
	private int crdate;
	
	public Book(String title, String author, String publisher, int crdate)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.crdate = crdate;
	}
	//return title
	public String getTitle()
	{
		return title;
	}
	//update title
	public void setTitle(String title)
	{
		this.title = title;
	}
	//return author
	public String getAuthor()
	{
		return author;
	}
	//update author
	public void setAuthor(String author)
	{
		this.author = author;
	}
	//return publisher
	public String getPublisher()
	{
		return publisher;
	}
	//update publisher
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	//return copyright date
	public int getCrdate()
	{
		return crdate;
	}
	//update copyright date
	public void setCrdate(int crdate)
	{
		this.crdate = crdate;
	}
	//returns String description of book
	public String toString()
	{
		String description = "";
		description += "Title: \t" + title + "\n";
		description += "Author: \t" + author + "\n";
		description += "Publisher: \t" + publisher + "\n";
		description += "Copyright Date: \t" + crdate + "\n";
		return description;
	}
}
