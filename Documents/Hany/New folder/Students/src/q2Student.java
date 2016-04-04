
import java.lang.*;
import java.io.*;
class student
{
	String name;
	int roll_no;
	int subject_no,subject_grade, no_of_subjects;
	int total;
	float per;
	int counter = 1;
	void getdata() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter Name of Student");
		name = br.readLine();
		System.out.println ("Enter Roll No. of Student");
		roll_no = Integer.parseInt(br.readLine());
		System.out.println ("Enter number of subjects student is taking: ");
		subject_no = Integer.parseInt(br.readLine());
		no_of_subjects = subject_no;
		System.out.println("Number of subjects " + subject_no);
		while (subject_no>0){
		System.out.println ("Enter marks out of 100 subject "+counter);
		subject_grade = Integer.parseInt(br.readLine());
		total = total + subject_grade;
		subject_no = subject_no -1;
		counter = counter+1;
		}
	}
	void show()
	{
		per=(total*100)/(100*no_of_subjects);
		System.out.println ("Roll No. = "+roll_no);
		System.out.println ("Name = "+name);
		System.out.println ("Total Marks = "+total);
		System.out.println ("Percentage = "+per+"%");
	}
}

class q2Student
{
	public static void main(String args[]) throws IOException
	{
		Section sectionObject = new Section();
		int studentCounter = sectionObject.getNum();
		
		while (studentCounter>0) {
		student s=new student();
		s.getdata();
		s.show();
		studentCounter = studentCounter-1;
		System.out.println("studentCounter  " + studentCounter);
	}
}
}
