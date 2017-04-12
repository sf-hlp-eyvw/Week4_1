package bookstoreProject;

import java.util.Date;

class ElectronicBook extends Book implements Transmitor{

	Date dateSent;
	
	ElectronicBook(String firstName, String lastName, String city, String title, Date dateSent) {
		super(firstName, lastName, city, title);
		
	}
	
	
	@Override
	int calculatePrice(){
		return 1;
	}
	
	@Override
	public String toString(){
		return title +" : " + author.toString() + " : " + getDateSent().toString();
	}
	
	
	public String transmit()	{
		return "transmitted";
	}
	
	Date getDateSent(){
		return this.dateSent;
	}
	
	void setDateSent(Date dateSent){
		this.dateSent = dateSent;
	}
	
	
}
