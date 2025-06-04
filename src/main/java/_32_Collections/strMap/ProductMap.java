package _32_Collections.strMap;

//문제
//1. 스캐너 객체 하나 생성, 변수명이 productMap 인 hashMap 생성(키: String, 값: Integer)
//2. 상품 등록하기 라고 출력하고 for 문 이용, 5번 반복, 상품명(키) 입력받고 가격(값) 입력받고
//   productMap 에 추가
//**상품명을 입력받고 공백을 꼭 제거할 것**
//3. 전체 상품을 출력하기 => for each 사용(향상된 for문)
//4. 상품 가격 수정 => 수정할 상품명 입력받ㄱ고 (공백제거)
//=>> 입력한 상품이 존재하면 가격을 입력받고
//만약에 존재하지 않으면 존재하지 않는다고 출력
//5. 특정 상품 검색 => 검색할 상품명 입력받고 (공백 제거)
//=> 입력한 상품이 productMap 에 있는지부터 확인
// 확인하고 있으면 해당 상품명과 가격 출력 = > 없으면 없다고 출력
//6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬 => 정렬하고 for each 출력
//7. 역순 정렬 => for each 출력


import java.util.*;

public class ProductMap {
    public static void main(String[] args) {

//        1. 스캐너 객체 하나 생성, 변수명이 productMap 인 hashMap 생성(키: String, 값: Integer)
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        //2. 상품 등록하기 라고 출력하고 for 문 이용, 5번 반복, 상품명(키) 입력받고 가격(값) 입력받고 productMap 에 추가

        System.out.println("상품 등록하기");
        for (int i = 0; i < 5; i++) {
            System.out.print("상품명 입력: ");
            String product = scanner.nextLine();
            System.out.print("가격 입력: ");
            Integer price = scanner.nextInt();
            scanner.nextLine();

//            int price = Integer.parseInt(scanner.nextLine());


            productMap.put(product.trim(), price);
            System.out.println(product.trim() + " 등록함");
        }

        //3. 전체 상품을 출력하기 => for each 사용(향상된 for문)

        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ":" + entry.getValue() + "원");
        }

//        for (String productKey : productMap.keySet()) {
//            System.out.println("키: " + productMap.get(productKey));
//        }

        //4. 상품 가격 수정 => 수정할 상품명 입력받고 (공백제거)
        System.out.print("수정할 상품명 : ");
        String re_product = scanner.nextLine().trim();
        System.out.print(re_product.trim());

        if(productMap.containsKey(re_product)) {
            System.out.println("수정할 가격 : ");
            int newPrice = Integer.parseInt(scanner.nextLine());
            productMap.put(re_product, newPrice);
            System.out.println("수정완료 : " + re_product + "->" + newPrice + "원");
        } else {
            System.out.println("해당 상품이 존재하지 않음");
        }


        boolean isProduct = productMap.containsKey(re_product);
        //=>> 입력한 상품이 존재하면 가격을 입력받고
        //만약에 존재하지 않으면 존재하지 않는다고 출력
        if (isProduct) {
            System.out.println("입력한 상품이 존재합니다. 수정할 가격을 입력하세요 : ");
            Integer re_price = scanner.nextInt();
        } else {
            System.out.println("입력한 상품이 존재하지 않습니다.");
        }

        //5. 특정 상품 검색 => 검색할 상품명 입력받고 (공백 제거)
        //=> 입력한 상품이 productMap 에 있는지부터 확인
        // 확인하고 있으면 해당 상품명과 가격 출력 = > 없으면 없다고 출력

        String searchProduct = scanner.nextLine();
        boolean searchResult = productMap.containsKey(searchProduct);
        if (searchResult) {
            System.out.println("검색한 상품이 존재합니다.");
            System.out.println(productMap.entrySet());
        } else {
            System.out.println("검색한 상품이 존재하지 않습니다.");
        }

        //6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬 => 정렬하고 for each 출력
//        Set<Map.Entry<String, Integer>> productSet = productMap.entrySet();
        List<Map.Entry<String, Integer>> productList = new ArrayList<>(productMap.entrySet());

        Collections.sort(productList, Map.Entry.comparingByKey());       //키 기준 정렬
        for (Map.Entry<String, Integer> entry : productList) {
            System.out.println("정렬결과: " + "- " + entry.getKey() + ":" + entry.getValue() + "원");
        }

//        for (int i = 0; i < productList.size(); i++) {
//            System.out.println("정렬한 리스트 출력: " + productList);
//        }


        for (Map.Entry<String, Integer> entry : productList) {
            System.out.println("- " + entry.getKey() + ":" + entry.getValue() + "원");
        }


        //6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬 => 정렬하고 for each 출력
        //7. 역순 정렬 => for each 출력
        Collections.sort(productList, Map.Entry.comparingByKey(Comparator.reverseOrder()));   //키 기준 역순 정렬

        for (Map.Entry<String, Integer> entry : productList) {
            System.out.println("역순정렬결과: " + "- " + entry.getKey() + ":" + entry.getValue() + "원");
        }



    }
}
