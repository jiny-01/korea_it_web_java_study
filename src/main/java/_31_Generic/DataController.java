package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData
//                ("데이터: ", "김지니", 25, 3.14);
//        System.out.println(responseData.toString());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());


        //제네릭 쓰려면 객체 타입 명시(생성 시)
        ResponseData<String> responseData1 = new ResponseData<>("이름: ", "김지니");
        //아까 적은 <T> => String 인 것 / 뒤에 String 은 앞에 명시해줬으므로 생략 O
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이: ", 25);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율: ", 3.14);

        Date now = new Date();    //실행 시점의 now(현재 시간)
        ResponseData<Date> nowData = new ResponseData<>("현재 날짜: ",now);
        System.out.println(now);


        //임의의 클래스에 toString 이 있으면 가능
        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(1);
        userEntityLombok.setUserName("김지니");

        ResponseData<UserEntityLombok> user = new ResponseData<>("유저:", userEntityLombok);
        System.out.println(user);

        //Product 패키지
        //ProductController.java, Product.java 클래스
        //상품정보 - 상품명(productName), 상품정보(productInfo)
        //Product(productName=Laptop, productInfo=intel i7, 16GB Ram, 512GB SSD) String
        //Product(productName = Smartphone, productInfo = 799,99) Double
        //Product(ProductName = Available, productInfo = true Boolean




    }

}
