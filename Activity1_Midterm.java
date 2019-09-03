import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Activity1_Midterm {
    
    public static void main(String[] args) throws Exception{
    	
    	Scanner sc = new Scanner(System.in);
    	Calendar calendar = new GregorianCalendar();
    	SimpleDateFormat dFormat = new SimpleDateFormat("mm-dd-yyyy");
    	
  		System.out.println("Input your birthday: ");
    	String input_bday = sc.nextLine();
    	
    	Date bday = dFormat.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	
    	System.out.println("\nMy age is: " +age);
    
    	
    	  	
    	
    	
    	
    }
}
