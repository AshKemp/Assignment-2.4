import java.util.*;
public class HighestOfThreeNumbers {
     public static void main(String args[]) {
	int a,b,c;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter a");
	a=s.nextInt();
	System.out.println("Enter b");
	b=s.nextInt();
	System.out.println("Enter c");
	c=s.nextInt();

	if(a>b && a>c)
	   System.out.println(a+" is highest");
	else if(b>c && b>a)
	   System.out.println(b+" is highest");	
	else
	   System.out.println(c+" is highest");
      }
}
	
	
	