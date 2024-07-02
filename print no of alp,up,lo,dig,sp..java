import java.util.*;
class Test03
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int alp=0,up=0,lo=0,d=0,sp=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(Character.isLetter(ch))
{
alp++;
if(Character.isUpperCase(ch))
up++;
else
lo++;
}
else if(Character.isDigit(ch))
d++;
else
sp++;
}
System.out.println("Alphabet="+alp);
System.out.println("Upper Case="+up);
System.out.println("Lower Case="+lo);
System.out.println("Digits="+d);
System.out.println("Symbols="+sp);
}
}
