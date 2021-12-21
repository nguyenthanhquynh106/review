package exception_handle;

import java.io.IOException;

public class ExceptionDemo {
    void aMethod() throws IOException {
        throw new IOException("Device error");
    }

    public static void main(String args[]) {
        try {
            ExceptionDemo obj = new ExceptionDemo();
            obj.aMethod();
        } catch (Exception e) {
            System.out.println("Exception handled!");
        }

        System.out.println("Hello Quynh!");
    }
}
