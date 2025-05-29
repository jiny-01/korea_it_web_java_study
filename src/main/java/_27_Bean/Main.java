package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //userId, userName, age, email => private
        // 기본생성자 하나 만들기
        // getter, setter
        //toString 오버라이드 해서 정보 모두 출력되도록

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUserName("김지니");
        userEntity.setAge(25);
        userEntity.setEmail("allie7019@naver.com");

        System.out.println(userEntity);

        userEntity.setUserId(2);
        userEntity.setUserName("홍길동");
        userEntity.setAge(20);
        userEntity.setEmail("gildong@naver.com");

        System.out.println(userEntity);



    }


    //빌드 - 컴파일, 테스트, 리소스복사
    //컴파일 - .java -> .class

    //maven 프로젝트 pom.xml 다운받기
    //pom.xml dependencies 안에 거 지우기
    //-> 작게 버튼 뜨는 거 누르면 동기화
    //<dependency>
    //            <groupId>org.projectlombok</groupId>
    //            <artifactId>lombok</artifactId>
    //            <version>1.18.38</version>
    //</dependency>
    //구글 - mvn 검색 - mvn 레퍼지토리-lombok 다운(1.18.38)- 코드 복붙 -> pom.xml

//    <dependencies>     //태그 열림
//        <dependency>
//            <groupId>org.projectlombok</groupId>
//            <artifactId>lombok</artifactId>
//            <version>1.18.38</version>
//        </dependency>
//    </dependencies>    //태그 닫힘

    //lombok 쓰려면 maven
    //pom.xml 경로 바꾸기 - pom.xml

    //Entity는 Bean 될수도, 안될수도 있음 but 별개의 개념
    //DB 테이블에서 1:1 매칭이 되는 것 => Entity
    //Bean -> 하나의 객체 설계 규칙(명세, 가이드라인)



}
