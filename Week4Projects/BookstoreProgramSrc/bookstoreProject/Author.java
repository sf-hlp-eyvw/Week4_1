package bookstoreProject;

class Author {
	String firstName;
	String lastName;
	String city;
	
	Author(String firstName, String lastName, String city){
		setCity(city);
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	
	@Override
	public String toString(){
		return getFirstName()+" "+getLastName();
	}
	
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	
	
}
