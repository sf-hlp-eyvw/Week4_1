package bookstoreProject;

class Magazine extends Book {
	Publisher publisher;
	
	Magazine(String firstName, String lastName, String city, String title,String publisherName, String publisherAddress ) {
		super(firstName, lastName, city, title);
		publisher = new Publisher(publisherName, publisherAddress);
	}

	@Override
	int calculatePrice(){
		return (author.getFirstName().length() + author.getLastName().length() )* 12;
	}
	
	@Override
	public String toString(){
		return title +" : " + author.toString() + " : " + publisher.toString();
	}
	
	
	Publisher getPublisher() {
		return publisher;
	}

	void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	
}
