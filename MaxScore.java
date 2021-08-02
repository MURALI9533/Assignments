

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class MaxScore {
 public static void main(String[] args) {
	 System.out.println("Enter number of players ");
	 Scanner scan=new Scanner(System.in);
	 String name;
	 String pname="";
	 long score;
	 int size=scan.nextInt();
	 HashMap<String, Long>mp= new HashMap<String,Long>();
	 for(int i=0;i<size;i++) {
		 System.out.println("Enter name : ");
		 name=scan.next();
		 System.out.println("Enter Score : ");
		 score=scan.nextLong();
		 mp.put(name,score);
	 }
	 long maxValueInMap=(Collections.max(mp.values()));
	 for(Entry<String, Long> entry : mp.entrySet()) {
		 System.out.println(entry.getKey());
		 if(entry.getValue()==maxValueInMap) {
			  pname=entry.getKey();
			  break;
			  
		 }
	 }
	 System.out.println("Maximum score : "+maxValueInMap+" by "+pname);
	 
 }
}