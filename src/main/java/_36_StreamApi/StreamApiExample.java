package _36_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//1. 스캐너 객체 생성, product List 하나 생성
//2. 브랜드 키워드 입력받기 => stream filter 이용해서 키워드 브랜드 뽑아내고 List
//.isEmpty() => 뽑아온 브랜드 상품들 출력 없으면 없다고 출력
//브랜드 키워드 입력 받을 때, 만약 영어로 브랜드를 입력했을 때 영어 -> 한글로 알아서 바꾸도록(대소문자 구별없이 비교)
public class StreamApiExample {
    public static void main(String[] args) {
        List<String> productList = Arrays.asList(
                "애플 아이폰 15 Pro", "애플 맥북 프로 M3", "애플 아이패드 에어 5세대",
                "삼성 갤럭시 s24 울트라", "삼성 갤럭시 Z 플립 5", "삼성 갤럭시탭 S9",
                "엘지 울트라기어 게이밍 모니터");

        Scanner scanner = new Scanner(System.in);

        System.out.print("브랜드 입력 : ");
        String brand = scanner.nextLine();

        if(brand.equalsIgnoreCase("apple")) {
            brand = "애플";
        } else if (brand.equalsIgnoreCase("samsung")) {
            brand = "삼성";
        } else if (brand.equalsIgnoreCase("lg")) {
            brand = "엘지";
        }

        String keyword = brand;    //상수 선언

        List<String> brandList = productList.stream()
                .filter(name -> name.contains(keyword)).toList();   //contains 안에는 상수만 가능


        System.out.println(keyword + "브랜드 상품 목록");

//        boolean isBrand = brandList.contains("brand");

        if(brandList.isEmpty()) {
            System.out.println("해당 브랜드 상품이 없습니다");
        } else {
            brandList.forEach(System.out::println);
        }
        System.out.println();
        System.out.println("키워드 포함하는 브랜드 : " + brandList);






    }
}
