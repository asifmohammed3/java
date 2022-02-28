//Single inheritence
// Sabeeh k 49 
import java.util.Scanner;

class A {

    int a;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter a number:");
        a = sc.nextInt();
    }
}

class Main extends A {

    void display() {
        System.out.println("The value of a is:" + a);
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.input();
        obj.display();
    }
}
