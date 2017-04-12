
public class Vocalist extends Performer {
	String key;
	int volume;
	

	Vocalist(String key){
		setKey(key);
	}
	
	Vocalist(String key, int volume) {
		setKey(key);
		setVolume(volume);
	}

	@Override
	String perform() {
		return ("I sing in the key of"+" - " + key + " - "+unionID);
	}
	
	 
	String perform(int volume) {
		return ("I sing in the key of"+" - " + key + " - at the volume - "+ getVolume() + " - "+unionID);
	}
	
	int getVolume() {
		return volume;
	}

	void setVolume(int volume) {
		if(volume <= 10 || volume <= 1){
			this.volume = volume;
		}
		else{
			this.volume = 0;
		}
	}
	 
	String getKey() {
		return key;
	}
	void setKey(String key) {
		this.key = key;
	}
	
}
