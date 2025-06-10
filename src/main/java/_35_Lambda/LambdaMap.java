package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//1. 스캐너 객체 선언, 입력받아서 저장할 Map 선언(String, Integer)
//2. 상품을 입력할 갯수를 count 로 입력받기(nextInt)
//3. count 만큼 반복해서 상품명(키) 와 가격(값)으로 입력받고 map 에 추가
public class LambdaMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        System.out.println("상품의 개수 : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("상품명: ");
            String product = scanner.nextLine();
            scanner.nextLine();
//            System.out.println("상품명 : " + product + "등록함");

            System.out.print("가격 : ");
            int price = scanner.nextInt();
            scanner.nextLine(); //nextInt(): 개행이 포함되어있음 -> nextLine 한 번 해주기
//            System.out.println("가격 : " + price + "등록함");

            productMap.put(product, price);
            System.out.println(productMap);

            System.out.println("[상품목록]");
            productMap.forEach((name, pr) ->
                    System.out.println("상품명 : " + name + "가격 : " + pr));






        }
    }


}
