
public class Book {
	private String title, author, publisher;
	private int year;

	Book(String titl,String auth, String publ, int yea){
		title = titl;
		author = auth;
		publisher = publ;
		year = yea;
	}
	
		public static void main(String[] args) { 
			
			Book TextBox = new Book("The Tale of Jonah", "Jonah Largen", "Surfaced, INC", 2014);
			String bookDescription = TextBox.toString();
			System.out.println("The details of this book are: " + bookDescription);
		}
	
	@Override
	public String toString() 
	{
		String bookDescription;
		bookDescription = "\nTitle: " + title +"\nAuthor: "
		+ author +"\nPublisher: " + publisher + "\nYear: " + year;
		return bookDescription;
	}
	
	public boolean isEqualTo(Object obj) {
		if (this == obj)
			return true;
		if (getClass()!= obj.getClass())
			return false;
		Book Textbox = (Book) obj;
		if (author == null) {
			if (Textbox.author!= null)
				return false;
		}
		else if (title == null) {
			if (Textbox.title!=null)
				return false;
		}
		else if (publisher ==null) {
			if (Textbox.publisher!= null)
				return false;
		}
		else if (year == 0) {
			if (Textbox.year!= 0)
				return false;
		}
		else if (!title.equals(Textbox.title))
			return false;
		return true;
	}


	/*public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}*/
}

