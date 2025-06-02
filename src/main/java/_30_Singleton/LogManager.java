package _30_Singleton;

public class LogManager {
    //시스템 전체에서 로그를 기록하는 객체인데 얘는 하나만 있으면 됨
    //싱글톤(singleton)
    //애플리케이션(프로그램) 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    //자원 공유가 필요할 때 ex)설정파일(세팅)
    //객체를 여러 번 만들 필요가 없고, 한 번만 만들고 재사용하는 경우

    private static LogManager instance;    //static: 클래스 수준 -> 정적변수인 instance 안에 LogManager 클래스 자신의 변수를 담음

    private LogManager () {}   //생성자를 private 으로 막아서 외부에서 new 금지
    //생성자를 private 로 막는다는 게 무슨 말?

    //LogManager 의 객체를 쓰고 싶을 때 getInstance() 쓸 것 정의
    public static LogManager getInstance() {
        if (instance == null) {      // 정적 변수에 인스턴스가 있는지 확인
            instance = new LogManager();  // 없다면 최초 1회 객체 생성
        }
        return instance; //있다면 정적 변수에 있는 객체를 반환
    }

    //고유메소드(객체 수준)
    public void log(String message) {
        System.out.println("LOG => " + message);
    }
}
