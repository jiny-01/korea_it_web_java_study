package _14_Array;

public class Array01 {
    public static void main(String[] args) {
        // 배열 => 같은 자료형의 데이터를 여러 개 저장하는 연속된 공간
        // 고정된 크기

        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

        // 배열 선언 첫번째 방법 -> 일반적인 방법, 가장 많이 사용
//        String[] countries = new String[5];   //타입[] 배열 이름 = new 타입 [크기(갯수)]

        // 배열 선언 2번째 방법
//        String countries[] = new String[5];

//        countries[0] = "Hungary";
//        countries[1] = "Croatia";
//        countries[2] = "Slovenia";
//        countries[3] = "Austria";
//        countries[4] = "Czech";
//        countries[5] = "Korea";

//        System.out.println(countries[3]);
//        System.out.println(countries[5]);   //에러발생 -> 크기 5이므로 인덱스 4까지임 -> 인덱스 범위 벗어남

        // 배열 선언 세번째 방법
//        String[] countries = new String[]
//                {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};   //배열에 직접 값 입력

        // 배열 선언 네번째 방법
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        //배열에서 수정
        countries[1] = "Swiss";
        System.out.println(countries[1]);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] doubles = {12.34, 23.45, 12.55, 45.87};
        boolean[] booleans = {true, false, false, true};






    }
}
