//program for interface implementation
//sabeeh k 49 
interface printable{  
void print();  
}  
class Main implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
Main obj = new Main();  
obj.print();  
 }  
}  

