package code;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class MealprepSchedule  extends Schedules{
	public String meal; 
	ArrayList<String> mealList=new ArrayList<String>();
	
	public MealprepSchedule(String date) {
		super(date);
	}
	
	public void addMealList (String mealItem) {        
		if (mealItem != null && !mealItem.trim().isEmpty()) {
        mealList.add(mealItem.trim());}
	}
	
	public void deleteMealList(String mealItem) {
        for (int i = 0; i < mealList.size(); i++) {
            if (mealList.get(i).equals(mealItem)) {
                mealList.remove(i);
                break; // stop after removing
            }
        }
	}
	
    public ArrayList<String> getMealList() {
        return mealList;
    }
    
    //Load meals from a text file: one meal per line
    public void loadMealsFromFile(String filename) {
	    mealList.clear();
	    try (Scanner reader = new Scanner(new File("filename.txt"))) {
	        while (reader.hasNextLine()) {
	            String line = reader.nextLine().trim();
	            if (line.isEmpty() || line.startsWith("#")) continue; // skip blanks/comments
	            mealList.add(line);
	        }
	    } catch (FileNotFoundException e) {
	        System.out.println("An error occurred");
	        e.printStackTrace();
	    }
    }
}

//same thing done in UserData the (//Scanning file & add to List)

 