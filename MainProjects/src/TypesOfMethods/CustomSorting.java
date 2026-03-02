package TypesOfMethods;

import java.util.Arrays;

class Pair
{
	public int first;
	public int second;
	
	Pair(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
	
	@Override
	public String toString()
	{
		return "{"+this.first+"},{"+this.second+"}";
	}
	
}

class Student {

    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class CustomSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair[] pair=new Pair[5];
		pair[0]=new Pair(19,13);
		pair[1]=new Pair(18,13);
		pair[2]=new Pair(11,6);
		pair[3]=new Pair(1,31);
		pair[4]=new Pair(10,13);
		Arrays.sort(pair,(a,b)->{
			if(a.second!=b.second)
				return a.second-b.second;
			else
				return b.first-a.first;
		});
		for(Pair p:pair)
			System.out.println(p);
		
		Student[] arr = {
			    new Student(1, "Aman", 92.0d),
			    new Student(2, "Kiran", 85.90d),
			    new Student(5, "Neha", 75.8d),
			    new Student(3, "Rahul", 85.91d)
			};
		System.out.println(Math.ceil(0.01d));
		Arrays.sort(arr,(a,b)->{
			if(a.getMarks()!=b.getMarks())
				return (int)(Math.ceil(b.getMarks()-a.getMarks()));
			else
				return a.getRollNo()-b.getRollNo();
		});
		for(Student student:arr)
			System.out.println(student);
		
	}

}
