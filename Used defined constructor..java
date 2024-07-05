import java.util.*;
class TestK
{
void show()
{
System.out.println("Show method");
}
TestK()
{
System.out.println("Constructor");
}
public static void main(String args[])
{
TestK t1=new TestK();
TestK t2=new TestK();
t1.show();
}
}
