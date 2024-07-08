import java.util.*;
class Student100
{
int admno=111;
String name="ss";
void display()
{
System.out.println("---------------------");
System.out.println("Student Report");
System.out.println("---------------------");
}
}
class Marks extends Student100
{
int mat=76,phy=85,che=67;
void show()
{
System.out.println("admno="+admno);
System.out.println("Name="+name);
System.out.println("Maths="+mat);
System.out.println("Physics="+phy);
System.out.println("Chemistry="+che);
}
}
class Testtttt
{
public static void main(String args[])
{
Student100 s1=new Student100();
s1.display();
//s1.show();
Marks m1=new Marks();
m1.display();
m1.show();
}
}
