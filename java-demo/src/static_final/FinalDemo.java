package static_final;

public class FinalDemo {
    static final int data; //Biến static final trống
    static {
        data = 50;
    }

    public static void main(String args[]) {
        System.out.println(FinalDemo.data);
    }
}
