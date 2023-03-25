import java.util.*; 
class Box{     
public static void main(String agrs[]){         
Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the no of seconds:");          
		float s= sc.nextFloat();         
		float m,h;         
		m=s/60;         
		h=m/60;  
        System.out.println(s+"seconds = "+m+" minutes");         
		System.out.println(s+"seconds = "+h+" hours"); 
         
    } 
} 
