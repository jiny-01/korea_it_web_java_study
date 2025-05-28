package _26_Objects;

import java.util.Objects;

public class Teacher {

    //멤버변수 지정
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    //매개변수 타입과 개수가 같기 때문에 오버로딩 조건이 안됨


    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }


    @Override
    public String toString() {
        return name + "선생님의 근무지는" + schoolName + "입니다";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);   //Objects. -> 변환해줌
    }
    //name 과 schoolName 의 값을 기반으로 고유한 숫자(hashCode)를 생성


    // 해시코드 무시하고 내용만 같으면 equal 성립하도록 메소드 정의
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;   //자기자신이냐?
        //this -> .찍은 객체, obj -> 비교할 객체
        if (!(obj instanceof Teacher)) return false;   //Teacher 클래스 맞냐
        Teacher teacher = (Teacher) obj;               //다운캐스팅
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);  //내용 같은지만 비교

    }

    //equals 랑 hashcode 는 항상 같이 다님 -> 오버라이드 무조건 둘 다 같이 해줘야함
    //-> equals 에서 같다고 판별된 객체는 같은 해시코드를 가져야한다. => 자바 규칙
}
