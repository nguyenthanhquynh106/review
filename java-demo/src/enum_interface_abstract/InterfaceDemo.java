package enum_interface_abstract;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class InterfaceDemo {
    public static void main(String args[]) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.print();
        obj.show();
    }

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }
}
