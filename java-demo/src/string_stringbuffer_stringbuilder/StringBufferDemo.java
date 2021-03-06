package string_stringbuffer_stringbuilder;

public class StringBufferDemo {
    public static void main(String[] args) {
        Test thread1 = new Test();
        thread1.start();
        Test thread2 = new Test();
        thread2.start();
        System.out.println(thread1.hello());
        System.out.println(thread2.hello());
    }
}

class Test extends Thread {
    StringBuffer stringBuffer;

    public Test() {
        stringBuffer = new StringBuffer();
    }

    public String hello() {
        stringBuffer.append("Hi I'm Quynh");
        return (stringBuffer.toString());
    }
}
