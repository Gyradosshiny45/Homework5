package avgtemp;
import java.util.ArrayList;
import java.util.Scanner;
public class AvgTemp 
{
public static void main(String[] args)
{ 
	Scanner in = new Scanner(System.in);
	ArrayList<String> days = new ArrayList<>();
	ArrayList<Double> temperatures = new ArrayList<>();
	
	days.add("Monday");
	days.add("Tuesday");
	days.add("Wednesday");
	days.add("Thursday");
	days.add("Friday");
	days.add("Saturday");
	days.add("Sunday");
	
	for (String day: days) {
		System.out.println("Enter the temperature for: " + day);
		double temp = in.nextDouble();
		temperatures.add(temp);
	}
	double sum = 0.0;
	for (int i = 0; i < temperatures.size(); i++) {
		sum+= temperatures.get(i);
		}
	
	double average = (double) sum / temperatures.size();
	System.out.println("Average temperatures = " + average);
	
	
	
	
	}
}
