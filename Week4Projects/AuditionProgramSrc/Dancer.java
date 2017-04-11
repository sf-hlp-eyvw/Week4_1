
class Dancer extends Performer{
	String danceStyle;
	Dancer(String danceStyle){
		
		setDanceStyle(danceStyle);
	}
	
	@Override
	String perform() {
		return (danceStyle +" - "+ unionID + " - dancer");
	}
	
	void setDanceStyle(String danceStyle) {
		this.danceStyle = danceStyle;
		
	}
	
	String getDanceStyle(){
		return this.danceStyle;
	}
}
