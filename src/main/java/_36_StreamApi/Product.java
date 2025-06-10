package _36_StreamApi;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

//가격이 내가 입력한 가격 이하의 제품만 필터링
//브랜드명, 입력가격보다 낮은 제품
//Product 의 객체들이 들어가는 리스트

//"삼성 갤럭시북3 프로", 1850000,
//"삼성 갤럭시북 이온", 1350000,
//"삼성 갤럭시탭 S9", 950000,
//"삼성 갤럭시 S24 울트라", 1590000
//"애플 맥북에어 M2", 1690000,
//"애플 맥북프로 M3", 2490000,
//"애플 아이패드 에어 5세대", 929000
//"애플 아이폰 15 프로", 1550000,
//"LG 그램 17", 2190000,
//"LG 울트라PC", 1140000

@Data
public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    Product productList = new Product(
            "삼성 갤럭시북3 프로", 1850000


            "삼성 갤럭시북 이온", 1350000,
            "삼성 갤럭시탭 S9", 950000,
            "삼성 갤럭시 S24 울트라", 1590000,
            "애플 맥북에어 M2", 1690000,
            "애플 맥북프로 M3", 2490000,
            "애플 아이패드 에어 5세대", 929000,
            "애플 아이폰 15 프로", 1550000,
            "LG 그램 17", 2190000,
            "LG 울트라PC", 1140000);



}
