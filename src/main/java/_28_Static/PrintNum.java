package _28_Static;

public class PrintNum {
    private static int num = 10;

    public static void printNum() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        printNum();
    }

    //private int num = 10;    //인스턴스 수준
    //public static void printNum()   //클래스 수준
    //num 은 객체가 있어야하는데, printNum()은 객체 없이 호출되므로
    //num 에 접근할 수 없다.
}
