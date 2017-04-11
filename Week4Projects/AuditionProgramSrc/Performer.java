
class Performer {
	int unionID;

	Performer(){
		this.unionID = (int) ((Math.random()*999)+1);

	}
	
	String perform() {
		return (unionID + " - performer");
	}
	
	int getUnionID() {
		return unionID;
	}

	void setUnionID(int unionID) {
		this.unionID = unionID;
	}


	
	
}
