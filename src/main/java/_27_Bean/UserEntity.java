package _27_Bean;

//Bean
//하나의 객체 설계 규칙(명세, 가이드라인)
//멤버 변수들은 private => 캡슐화
//기본 생성자
//getter / setter => 외부 접근을 위해
public class UserEntity {

    //멤버변수 정의
    private int userId;
    private String userName;
    private int age;
    private String email;

    public UserEntity() {
    }



    //getter
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    //setter
    public void setUserId(int userId) {
        userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }



//    @Override
//    public String toString() {
//        return "UserEntity(" +
//                "userId= " + userId +", "
//                + "userName= "+ userName +", "
//                + "age= " + age +", "
//                + "email= " + email +")";
//    }


    @Override
    public String toString() {
        return super.toString();
    }
    //오버라이드할 때 자동으로 return super. 이 뜨는데 여기서 super. 부분 지워도 되는지?
    //super. 에서 super 는 지워도 됨, 최상위 클래스 Object 이기 때문에 지워도 됨
    //참조 주소까지 출력하고 싶으면super.toString() 명시해도 됨

}
