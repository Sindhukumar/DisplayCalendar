import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DisplayCalendar {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int year, month,lastdate=0;
		String mName="";
		System.out.println("Enter the Month in number");
		month = sc.nextInt();
		System.out.println("Enter the Year:");
		year = sc.nextInt();
		SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date MyDate = newDateFormat.parse(01+"/"+month+"/"+year);
		Calendar c = Calendar.getInstance();
		c.setTime(MyDate);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		switch(month){
		case 1:mName="January";lastdate = 31;break;
		case 3:mName="March";lastdate = 31;break;
		case 5:mName="May";lastdate = 31;break;
		case 7:mName="July";lastdate = 31;break;
		case 8:mName="August";lastdate = 31;break;
		case 10:mName="October";lastdate = 31;break;
		case 12:mName="December";lastdate = 31;break;
		case 2:mName="Feburary";
			if(year%4!=0 || (year%100==0&&year%400!=0))
				lastdate = 28;
			else
				lastdate = 29;
			break;
		case 4:mName="April";lastdate=30;break;
		case 6:mName="June";lastdate=30;break;
		case 9:mName="September";lastdate=30;break;
		case 11:mName="November";lastdate=30;
		break;
		}
		System.out.println("               "+mName+"  "+year);
		System.out.println("\nSun 	Mon 	Tue 	Wed 	Thu 	Fri 	Sat");
		for(int i=1;i<dayOfWeek;i++)
			System.out.print("     	");
		for(int i=1;i<=lastdate;i++){
			System.out.print(i+" 	");
			if(dayOfWeek%7==0)
				System.out.println();
			dayOfWeek++;
		}
		
		sc.close();
	}

}
