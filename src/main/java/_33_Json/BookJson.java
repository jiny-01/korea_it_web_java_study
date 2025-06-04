package _33_Json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor

class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;

};

public class BookJson {
    public static void main(String[] args) {

        JsonObject bookJson = new JsonObject();
        Gson gson = new Gson();

        //Json -> Map
        Map<String, String> bookMap2 = gson.fromJson(bookJson, Map.class);
        System.out.println(bookMap2);



        //Map => Json
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("isbn", "978-1234567890");
        bookMap.put("tile", "자바의 정석");
        bookMap.put("author", "남궁성");
        bookMap.put("price", "38000");
        bookMap.put("publisher", "도우출판");

        //Map -> Pretty Json
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("isbn", "978-1234567890");

        System.out.println("gson 사용 : " + gson.toJson(bookMap));
        System.out.println("gsonBuilder 사용 : " + gsonBuilder.toJson(bookMap));
        String bookMap = gsonBuilder.toJson(bookMap);

        //Json => Map


        //Json -> Book 객체




    }
}
