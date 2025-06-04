package _33_Json;

// "orderId": "ORD123456",

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        //
        JsonObject orderJson = new JsonObject();

        orderJson.addProperty("orderId", "ORD123456");
        orderJson.addProperty("customer", "곽두팔");
        orderJson.addProperty("product", "에어팟 프로 2세대");
        orderJson.addProperty("quantity", 1);
        orderJson.addProperty("price", 349000);

        Gson orderGson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = orderGson1.toJson(orderJson);     //gson 에서 예쁘게 변환 -> Json -> json1(그냥 String형태)

        System.out.println(json1);

        JsonObject address2 = new JsonObject();

        address2.addProperty("receiver", "곽두팔");
        address2.addProperty("phone", "010-5678-1234");
        address2.addProperty("city", "서울");
        address2.addProperty("district", "마포구");
        address2.addProperty("zipCode", "04123");


        orderJson.add("address", address2);   //중첩 객체를 처음의 JsonObject 에 넣어야함

        System.out.println(address2);



    }
}
