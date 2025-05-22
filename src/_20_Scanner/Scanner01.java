package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner => 입력
        Scanner scanner = new Scanner(System.in);  //->스캐너 사용할 준비  Scanner-클래스 , import 확인(Ctrl+ Space)
        // scanner - Scanner 클래스 내 객체 이름 설정\

        //String 문자열을 입력받기
        //next() => 토큰 단위로 읽는다.
        //토큰 : 공백문자(띄어쓰기, 탭, 엔터)
        //nextLine() => 엔터 가 입력될 때까지(입력한 끝까지 인식함)

        //next()
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1은 " + str1);
//        System.out.println("str2은 " + str2);

//        String str3 = scanner.nextLine();
//        System.out.println("str3은 " + str3);

        //int 정수 입력받기
        //nextInt() => 토큰 단위로 읽는다
//        int num1 = scanner.nextInt();
//        System.out.println("num1은 " + num1); //12 34 -> 12 만 출력
//
//        int num2 = scanner.nextInt();
//        System.out.println("num2은 " + num2);

//        int num = scanner.nextInt();  //컴퓨터 입장에선 123 \n 한 것으로 인식
//        scanner.nextLine();           //바로 nextLine 으로 인식하는 것을 방지 (\n을 대신 인식해서 넘어가는 걸 방지)
//        String str = scanner.nextLine();  //\n 이니 enter 로 인식 -> nextLine 은 엔터까지 인식하기 때문
//        System.out.println("num은" + num + "str은" + str);


        //문제
//        int age;
//        String name;
        //두 개 입력받고 출력

//        int age = scanner.nextInt();
//        System.out.println("나이:" + age);
//
//        scanner.nextLine();
//
//        String name = scanner.nextLine();
//        System.out.println("이름:" + name);

        //두 개 입력받고 출력
        int age;
        String name;

        System.out.print("나이를 입력해주세요>>>");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력해주세요>>>");
        name = scanner.nextLine();


    }
}
