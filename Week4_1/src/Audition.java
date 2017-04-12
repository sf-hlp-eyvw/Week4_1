import java.util.ArrayList;
import java.util.List;


class Audition {

	List<Performer> performerList;
	
	
	Audition(){
		performerList = new ArrayList<Performer>();
		
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Performer());
		performerList.add(new Dancer("Hip hop"));
		performerList.add(new Dancer("Salsa"));
		performerList.add(new Vocalist("G"));
		
		
	}


	public String performAllPerformers() {
		String allPerformers = "";
		for(Performer performer: performerList){
			allPerformers = allPerformers + performer.perform() + "\n"; 
			
		}
		System.out.println(allPerformers);
		return allPerformers;
	}

}
