import java.util.*;
class Test010
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String res[]={"C","CPP","JAVA","PYTHON"};
String str1=String.join(" ",res);
System.out.println(str1);
String str2=String.join("_",res);
System.out.println(str2);
String str3=String.join("language",res);
System.out.println(str3);
String str4=String.join(" ",res);
System.out.println(str4);
}
}
