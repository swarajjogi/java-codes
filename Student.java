import java.util.*;
class Student{
	String name,branch;
	int roll;
	public void setname(String name){
	this.name=name;
	}
	public void setid(int roll){
	this.roll=roll;
	}
	public void setclass(String branch){
	this.branch=branch;
	}
	public String getname(){
	return name;
	}
	public int getroll(){
	return roll;
	}
	public String getclass(){
	return branch;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	String branch = sc.nextLine();
	int id= sc.nextInt();
	
	
	
	
Student e1 = new Student();
e1.setname(name);
e1.setid(id);
e1.setclass(branch);

System.out.println("name:"+e1.getname());
System.out.println(e1.getroll());
System.out.println(e1.getclass());
}
}