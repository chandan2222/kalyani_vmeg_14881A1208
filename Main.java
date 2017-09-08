import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Student[] stu=new Student[n];
		StudentGroup ss=new StudentGroup(n);
		for(int i=0;i<n;i++){
			int id=sc.nextInt();
			String name=sc.next();
			Date ee=new Date();
			Double av=sc.nextDouble();
			stu[i]=new Student(id,name,ee,av);
			ss.addFirst(stu[i]);
			
		}
		
	}

}
