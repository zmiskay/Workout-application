package code;

import java.util.ArrayList;
import java.util.List;

public class WorkoutSchedule extends Schedules{
	public String workout; 
	ArrayList<String> workoutList=new ArrayList<String>(); 
	private Object reader;
		
	
	public WorkoutSchedule(String date) {
		super(date);
	}

	
	public void addWorkoutList () { 
		reader = null;
		workoutList.add(reader.toString());
	}
	
	public void deleteWorkoutList() {
		reader = null;
		workoutList.remove(reader.toString());
	}
	
    public List<String> getWorkoutList() {
        return workoutList;
    }
}
