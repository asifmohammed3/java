//print string ,integer using BufferedReader
//sabeeh  k 49 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name : ");
        String name=obj.readLine();
        System.out.print("Enter roll number : ");
        String roll=obj.readLine();
        int a=Integer.parseInt(roll);
        System.out.println("The name is "+name+" and the roll number is "+a+".");
        
    }
}


