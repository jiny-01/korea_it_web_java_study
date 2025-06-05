package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor


//1) Book 객체 → JSON 문자열:
//{"isbn":"978-1234567890","title":"자바의 정석","author":"남궁성","price":"38000","publisher":"도우출판"}
//
//2) JSON → Map:
//{isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판}
//
//3) Map → Pretty JSON:
//{
//  "isbn": "978-1234567890",
//  "title": "자바의 정석",
//  "author": "남궁성",
//  "price": "38000",
//  "publisher": "도우출판"
//}
//
//4) JSON → Book 객체:
//Book(isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판)


class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;

}

public class BookJson {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        //1) Book 객체 → JSON 문자열:
        //"isbn":"978-1234567890","title":"자바의 정석","author":"남궁성","price":"38000","publisher":"도우출판"

//        String bookJson = null;

        Book book = new Book(
                "978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판");
        System.out.println("Book 객체 생성  :" + book);
        System.out.println();

        String bookJson = gson.toJson(book);
        System.out.println("book 객체 => json 형태로 변환 : " + bookJson);
        System.out.println();


        //2) JSON → Map:
        Map<String, String> bookMap1 = gson.fromJson(bookJson, Map.class);    //Map.class : 맵 형태로 하나의 객체를 넣는다
        System.out.println("Json => Map 으로 변환 : " + bookMap1);
        System.out.println();


        //Map => Json
        Map<String, String> bookMap2 = new HashMap<>();
        bookMap2.put("isbn", "978-1234567890");
        bookMap2.put("title", "자바의 정석");
        bookMap2.put("author", "남궁성");
        bookMap2.put("price", "38000");
        bookMap2.put("publisher", "도우출판");
        System.out.println("Map => Json 으로 변환 : " + bookMap2);
        System.out.println();


        //Map -> Pretty Json - 앞에서 만든 bookMap2 이용
        String prettyJsonFromMap = gsonBuilder.toJson(bookMap2);
        System.out.println(prettyJsonFromMap);

        //3) Map → Pretty JSON:
        Map<String, String> bookMap3 = new HashMap<>();
        bookMap3.put("isbn", "978-1234567890");
        bookMap3.put("title", "자바의 정석");
        bookMap3.put("author", "남궁성");
        bookMap3.put("price", "38000");
        bookMap3.put("publisher", "도우출판");

        System.out.println("gson 사용 : " + gson.toJson(bookMap3) + "- 한 줄 Json");    //한 줄 Json
        System.out.println("--------------------------------------------------");

        System.out.println("gsonBuilder 까지 사용 : " + gsonBuilder.toJson(bookMap3) + "- 줄바꿈된 예쁜 Json");  //줄바꿈된 예쁜 Json
        System.out.println("--------------------------------------------------");

        //4) JSON → Book 객체:
        Book book2 = gson.fromJson(bookJson, Book.class);
        System.out.println("Json => Book 객체로 변경 : " + book2);

        //Json 은 키-값 형식이긴 하지만 단순히 String(문자열)임 -> "key" : Value 처럼 " 붙음

        //Json-> Map 이랑 Map-> Json 어느쪽으로 가든 Map 이면 순서 보장이 안 되어서 출력될 떄 무작위로 나온다?
        //Map 순서보장 안됨


        //1. 먼저 Book 클래스 생성
        // class Book {
//        private String isbn;
//        private String title;
//        private String author;
//        private String price;
//        private String publisher;
        // }

        //2. Book 객체 => Json 문자열 :
//        Gson gson = new Gson();
//        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        //Book 객체 생성
//        Book book = new Book (
//        "978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
//        )

        //String jsonBook = gson.toJson(book);


        //2) Json => Map
        //Map<String, String> bookMap = gson.fromJson(jsonbook, Map.class);
//        System.out.println("Json => Map 으로 변환 : " + bookMap);


        //3) Map => PrettyJson
        //String prettyJsonFromMap = gsonBuilder.toJson(bookMap);


        //4) Json => Book 객체
        //Book book2 = gson.fromJson(json, Book.class);




    }
}
