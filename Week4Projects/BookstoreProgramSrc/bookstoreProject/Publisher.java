package bookstoreProject;

class Publisher {
	String publisherName;
	String publisherAddress;
	
	
	Publisher(String publisherName, String publisherAddress){
		setPublisherName(publisherName);
		setPublisherAddress(publisherAddress);
	}
	
	String getPublisherName() {
		return publisherName;
	}
	void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	String getPublisherAddress() {
		return publisherAddress;
	}
	void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}

	public String toString(){
		return publisherName + " " + publisherAddress;
	}
	
	
}
