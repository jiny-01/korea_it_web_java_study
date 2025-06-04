package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data

class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;


}


public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

        //java 객체 => Json
        User user = new User(
                "jiny",
                "4266",
                "allie7019@naver.com",
                "김지니",
                "25"
        );
        System.out.println("user 객체 : " + user);
        userJson = gson.toJson(user);    //=> user 객체를 String 형태
        System.out.println("gson 만 사용 : " + userJson);

        userJson = gsonBuilder.toJson(user);  //=> user 객체를 json 형태로 예쁘게 변환
        System.out.println("gsonBuilder 까지 사용 : " + userJson);

        //JsonObject -> json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "2025001");
        jsonObject1.addProperty("studentName", "김지니");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 만 사용 : " + jsonObject1);

        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println("gsonBuilder 사용 : " + studentJson);   //String 형태로 예쁘게 줄바꿈 되어서 나옴

        //Map => Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT980-KD14309");
        map1.put("productName", "삼성 갤럭시북 프로");

        System.out.println("gson 사용 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);


        //Json => Map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);     //클래스 형태(Map.class)
        System.out.println(map2);

        //json -> User
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        //json -> jsonObject => json 과 jsonObject 같은 형태가 아니다
        //studentJson 의 자료형 : String -> jsonObject 의 자료형 : JsonObject
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);



    }
}
