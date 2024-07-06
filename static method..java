class Samplee
{
int a=45;
static int b=87;
void show()
{
System.out.println("Static:"+a+" "+b);
}
Samplee()
{
System.out.println("Constructor:"+a+" "+b);
}
static void display()
{
Samplee t=new Samplee();
System.out.println("Static:"+t.a+" "+b);
}
}
class TestP
{
public static void main(String args[])
{
Samplee.display();
Samplee s1=new Samplee();
s1.show();
s1.display();
}
}
