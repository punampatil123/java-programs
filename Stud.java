import java.util.*;
class Stud
{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String s=scan.next();
String[] name=new String[5];
int i=scan.nextInt();
int[] rollno=new int[5];
float f=scan.nextFloat();
float[] per=new float[5];
for(i=0;i<=5;i++)
{


System.out.println("enter name");

name[i]=scan.next();
System.out.println("name="+s);
System.out.println("enter rollno");
rollno[i]=scan.nextInt();
System.out.println("rollno"+i);
System.out.println("enter per");
per[i]=scan.nextFloat();
System.out.println("per"+f);


}
}
}
