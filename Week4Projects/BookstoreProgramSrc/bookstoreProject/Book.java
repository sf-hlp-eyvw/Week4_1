package bookstoreProject;

class Book {
	Author author;
	String title;
	
	Book(String firstName, String lastName, String city, String title){
		setAuthor(new Author(firstName, lastName, city));
		setTitle(title);
	}
	
	int calculatePrice(){
		return author.getFirstName().length() + author.getLastName().length();
	}
	
	@Override
	public String toString(){
		return title +" : " + author.toString();
	}
	
	
	Author getAuthor() {
		return author;
	}
	 void setAuthor(Author author) {
		this.author = author;
	}
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	
}
