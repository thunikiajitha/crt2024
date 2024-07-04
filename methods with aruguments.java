import java.util.*;
class Student2
{
int admno;
String name;
void get(int x,String y)
{
admno=x;
name=y;
}
void Show()
{
System.out.println(admno+" "+name);
}
public static void main(String args[])
{
Student s1=new Student();
s1.get(101,"sss");
s1.Show();
Student s2=new Student();
s2.get(104,"kkk");
s2.Show();
}
}
