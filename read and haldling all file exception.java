//sabeeh k 49
//PROGRAM TO READ FROM A FILE AND WRITE TO A FILE
//25/1/2022

import java.util.*;
import java.io.*;
public class Main 
    {
        public static void main (String [] args) throws IOException
        {
                File objj = new File("javainput.txt");
                FileWriter obj1 =new FileWriter("javainput.txt");
                Scanner sc1 = new Scanner(objj);
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the content to be saved in the file:");
                String a;
                a=sc.nextLine();
                obj1.write(a);
                obj1.close();
                
                
                File obj =new File ("javaoutput.txt");
                FileWriter obj2 =new FileWriter("javaoutput.txt");
                BufferedReader obj3 = new BufferedReader(new FileReader(objj));
                
                String s;
                s = obj3.readLine();
    
                obj2.write(s);
                obj2.close();
                System.out.println("Successfully written and copied...");
        }
    }
