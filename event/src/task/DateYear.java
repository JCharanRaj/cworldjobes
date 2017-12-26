package task;
import java.sql.*;

public class DateYear {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		Date today = new Date(time); 
		String total=today.toString();
		String date[]=total.split("-");	
		System.out.println(Integer.parseInt(total.substring(0, 4))-4); 
		int a=2019;
		if(a<Integer.parseInt(date[0])){
			if((Integer.parseInt(date[0])-a)<=5){
				System.out.println("Price of song :"+(10-(Integer.parseInt(date[0])-a)));
			}
			else{
				System.out.println("Price of song :"+5);
			}

			
		}else{
			System.out.println("Please check your input");
		}
				
		
	}

}
