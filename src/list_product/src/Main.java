import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
class Products {
    private String name;
    private int price;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p1 = new Product("삼성 갤럭시북3 프로", 1850000);
        Product p2 = new Product("삼성 갤럭시북 이온", 1350000);
        Product p3 = new Product("삼성 갤럭시탭 S9", 950000);
        Product p4 = new Product("삼성 갤럭시 S24 울트라", 1590000);
        Product p5 = new Product("애플 맥북에어 M2", 1690000);
        Product p6 = new Product("애플 맥북프로 M3", 2490000);
        Product p7 = new Product("애플 아이패드 에어 5세대", 929000);
        Product p8 = new Product("애플 아이폰 15 프로", 1550000);
        Product p9 = new Product("LG 그램 17", 2190000);
        Product p10 = new Product("LG 울트라PC", 1140000);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        productList.add(p8);
        productList.add(p9);
        productList.add(p10);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);




        
        //리스트에 넣는 타입이 Product 클래스
        //<Product> 는 리스트의 제네릭 타입 -> Product 란 의미
        //리스트의 요소에 들어가는 애들이 Product 클래스 객체
        //객체 선언을 따로 하지 않고 바로 이렇게 List 의 요소로 넣는다?
        //List<Product> 가 잘 이해가 되지 않음

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);



//        List<Product> products = Arrays.asList(
//                new Product("삼성 갤럭시북3 프로", 1850000),
//                new Product("삼성 갤럭시북 이온", 1350000),
//                new Product("삼성 갤럭시탭 S9", 950000),
//                new Product("삼성 갤럭시 S24 울트라", 1590000),
//                new Product("애플 맥북에어 M2", 1690000),
//                new Product("애플 맥북프로 M3", 2490000),
//                new Product("애플 아이패드 에어 5세대", 929000),
//                new Product("애플 아이폰 15 프로", 1550000),
//                new Product("LG 그램 17", 2190000),
//                new Product("LG 울트라PC", 1140000)
//        );

        //리스트에 넣는 타입이 Product 클래스
        //리스트의 요소에 들어가는 애들이 Product 클래스 객체라는 의미?
        //객체 선언을 따로 하지 않고 바로 이렇게 List 의 요소로 넣는 것인지
        //List<Product> 가 잘 이해가 되지 않음

        //<Product> 는 리스트의 제네릭 타입




        System.out.print("브랜드 명 : ");
        String brand = scanner.nextLine();

        System.out.print("최대 가격 : ");
        int maxPrice = scanner.nextInt();

        List<Product> result = productList.stream()
                .filter(product -> product.getName().contains(brand))
                .filter(product -> product.getPrice() <= maxPrice)
                .toList();

        System.out.println("결과 출력");
        if(result.isEmpty()){
            System.out.println("해당 조건에 만족하는 상품이 없습니다.");
        } else {
            result.forEach(System.out::println);
        }



    }
}
