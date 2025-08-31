package code;
	import java.util.ArrayList;
	import java.io.*;
	import java.util.Scanner;
	
public class UserData {
	private int weight;
	private int waist; 
	private int thigh; 
	private int forearm; 
	
	public UserData() {
		//Lists of Measurements 
		ArrayList<Double> weightList=new ArrayList<Double>();
		ArrayList<Double> waistList=new ArrayList<Double>();
		ArrayList<Double> thighList=new ArrayList<Double>();
		ArrayList<Double> forearmList=new ArrayList<Double>();
		
		//Scanning file & add to List 
		try {
			File obj = new File("filename.txt");
			Scanner reader = new Scanner(obj); 
			while (reader.hasNextDouble()) {
			    double w  = reader.nextDouble();
			    double ws = reader.nextDouble();
			    double th = reader.nextDouble();
			    double fa = reader.nextDouble();

			    weightList.add(w);
			    waistList.add(ws);
			    thighList.add(th);
			    forearmList.add(fa);
			} reader.close(); 
			
		} catch (FileNotFoundException e){
			System.out.println("An error occured");
			e.printStackTrace();}
		}
	
// Weight Getter & Setters 
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	
// Waist Getter & Setters 	
	public void setWaist(int waist) {
		this.waist = waist;
	} 
	public int getWaist() {
		return waist;
	} 
	
// thigh Getter & Setters 
	public void setThigh (int thigh) {
		this.thigh = thigh; 
	}
	public int getThigh () {
		return thigh;
	}
	
// forearm Getter & Setters
	public void setForearm (int forearm) {
		this.forearm =forearm;
	}
	public int getForearm() {
		return forearm; 
	}
}
	
