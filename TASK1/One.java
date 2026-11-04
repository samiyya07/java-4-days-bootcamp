import java.util.Scanner;
public class One{
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name:");
    String name=sc.nextLine();
    System.out.println("enter the age:");
    int age=sc.nextInt();
    sc.nextLine();
    System.out.println("enter the college name:");
    String college=sc.nextLine();
    System.out.println("My name is "+name+". I am "+age+". I study at "+college);  
    sc.close();      
    }
    
}
