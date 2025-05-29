package _27_Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//생성자 정의하고, @Getter, @Setter, @ToString 해서 import 하면 UserEntity 에서 정의한 그대로 쓸 수 있음

//2. @Getter, @Setter, @ToString 불러오기
@Getter
@Setter
@ToString

public class UserEntityLombok {

    //1. 생성자 정의
    private int UserId;
    private String userName;
    private int age;
    private String email;



}
