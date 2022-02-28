public class Test{

public static void main(String(] args) throws InterruptedException {

    Test t1 = new Test):
    Test t2 = new Test®):
    t1 = null;
    System.gc();

    t2 = null;

    Runtime.getRuntime().gc(;
    }
    @Override

    protected void finalize() throws Throwable{

        System.out.printin("Garbage collector called");
        System.out. printin("Object garbage collected : " + this);
    }
}