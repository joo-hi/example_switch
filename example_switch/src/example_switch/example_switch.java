package example_switch;
import java.util.Scanner;

public class example_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month;
		 
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		month = scan.nextInt();
		 
		if ( month==1 ||month==3||month==5||month==7||month==8||month==10||month==12 ) {
		   System.out.println("해당 날 수: 31\n");
		}else if ( month==4 || month==6 || month==9 || month==11) {
			System.out.println("해당 날 수: 30\n");
		}else {
		   if (year % 4 ==0 && year%100 != 0 || year % 400 ==0){
			   System.out.println("해당 날 수: 29\n");
		   }else {
			   System.out.println("해당 날 수: 28\n");
		   }
		}
	}

}
