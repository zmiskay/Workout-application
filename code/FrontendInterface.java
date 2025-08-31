package code;

import java.util.ArrayList;
import java.util.List;

public class FrontendInterface {
	ArrayList<WorkoutSchedule> workoutSchedule = new ArrayList<WorkoutSchedule>();

    public void addWorkoutSchedule(WorkoutSchedule ws) {
    	if (ws != null) workoutSchedule.add(ws);
    }

    //Uses a for-loop to find workouts for a given day.
    //If no matching day is found, it returns an empty list.
    
    public List<String> getWorkoutsByDay(String day) {
        List<String> result = new ArrayList<>();

        if (day == null) return result;

        // for-loop to search schedules
        for (int i = 0; i < workoutSchedule.size(); i++) {
            WorkoutSchedule ws = workoutSchedule.get(i);
            if (ws.getdate() != null && ws.getdate().equalsIgnoreCase(day)) {
                result.addAll(ws.getWorkoutList());
                break; // stop searching once we find the match
            }
        }

        return result;
    }
	

	
}
