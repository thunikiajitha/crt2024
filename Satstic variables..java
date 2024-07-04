import java.util.*;
class Sample
{
int a=10;
static int b=20;
}
class TestB
{
public static void main(String args[])
{
System.out.println(Sample.b);
Sample s1=new Sample();
System.out.println(s1.a+" "+s1.b);
Sample s2=new Sample();
System.out.println(s2.a+" "+s2.b);
}
}
