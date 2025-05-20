package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회 (반복문 & 배열)

        // 반복문 for 문을 통해 배열 순회
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]);
//        }

//        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i]);
//        }

        //enhanced for 문 (for-each) : 향상된 for 문
        for (String country : countries){
            System.out.println(country);
        }
        //for(배열 자료형 새 변수 : 배열 이름) -> 하나씩 뽑아서 새 변수에 담아서 출력 -> 배열의 크기만큼 반복

    }
}
