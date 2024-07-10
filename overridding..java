class Father
{
void surName()
{
System.out.println("a");
}
void designation()
{
System.out.println("Clerk");
}
}
class Child extends Father
{
void getName()
{
System.out.print("Ajitha");
}
void designation()
{
System.out.println("Java Programmaer");
}
}
class Testt1
{
public static void main(String args[])
{
Child c1=new Child();
c1.getName();
c1.surName();
c1.designation();
}
}
