import java.util.*;
class Test02
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(Character.isLetterOrDigit(ch))
{
System.out.println("Alphabet-Numeric");
if(Character.isLetter(ch))
{
System.out.println("Alphabet");
if(Character.isUpperCase(ch))
{
System.out.println("Upper case");
}
else
{
System.out.println("Lower Case");
}
}
else
{
System.out.println("Digit");
}
}
else
{
System.out.println("Special symbol");
}
}
}
