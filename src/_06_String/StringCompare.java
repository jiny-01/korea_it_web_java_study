package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); //== 이랑 .equals 같음 (같은지 묻는 것)
        System.out.println(str1.equals("Java"));
        System.out.println(str2.equalsIgnoreCase("python")); //equalsIgnoreCase: 대소문자 구별 안하고 내용만

        String password1 = "1234";
        String password2 = "1234";
        // 1234 가 저장되어있는 메모리 공간을 password1, password2 가
        // 같은 공간을 참조하고 있다.
        System.out.println(password1 == password2);  //참조 위치 비교
        System.out.println(password1.equals(password2));  //내용 비교
        password1 = new String("1234");  //String 클래스 - 해당 클래스에 객체(인스턴스) 선언
        password2 = new String("1234");\
        /*
        * new를 하면 내용이 같더라도 새로운 메모리 공간을
        * 각각 할당하여 다른 위치에 저장
        * 각각 참조하고 있음
        * */
        System.out.println(password1 == password2);        //-> == : false / 참조 위치 비교-다름
        System.out.println(password1.equals(password2));   //-> .equals : true / 내용은 같다







    }
}
