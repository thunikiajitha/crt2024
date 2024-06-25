import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,sum=0;
        for(;;)
        {
            n=s.nextInt();
            if(n==-1)
            {
                break;
            }
            sum=sum+n;
        }
        System.out.println(sum);
        
            }
        }
    
