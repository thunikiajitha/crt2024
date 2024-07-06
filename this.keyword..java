import java.util.*;
class TestN
{
int a=10,b=20;
void show(int a,int b)
{
System.out.println(a+b);
System.out.println(this.a+this.b);
}
public static void main(String args[])
{
TestN t1=new TestN();
t1.show(100,200);
}
}
