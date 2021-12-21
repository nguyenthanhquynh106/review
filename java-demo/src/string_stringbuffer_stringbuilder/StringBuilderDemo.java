package string_stringbuffer_stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello ");
        sb1.append("Java");
        System.out.println(sb1); //Hello Java

        StringBuilder sb2 = new StringBuilder("Hello ");
        sb2.insert(1, "Java");
        System.out.println(sb2); //HJavaello

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.replace(1, 3, "Java");
        System.out.println(sb3); //HJavalo

        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.delete(1, 3);
        System.out.println(sb4); //Hlo

        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.reverse();
        System.out.println(sb5); //olleH

        StringBuilder sb6 = new StringBuilder();
        System.out.println(sb6.capacity()); //trả về dung lượng của bộ nhớ đệm (mặc định là 16)
        sb6.append("Hello");
        System.out.println(sb6.capacity()); //đến đây vẫn là 16
        sb6.append("java is my favourite language");
        System.out.println(sb6.capacity()); //đến đây là (16*2)+2=34

        StringBuilder sb7 = new StringBuilder();
        System.out.println(sb7.capacity()); //mặc định là 16
        sb7.append("Hello");
        System.out.println(sb7.capacity()); //đến đây là 16
        sb7.append("Java is my favourite language");
        System.out.println(sb7.capacity()); //đến đây là (16*2)+2=34
        sb7.ensureCapacity(10); //đến đây không có sự thay đổi
        System.out.println(sb7.capacity()); //đến đây là 34
        sb7.ensureCapacity(50); //đến đây là (34*2)+2
        System.out.println(sb7.capacity()); //đến đây là 70
    }
}
