package _30_Singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getInstance();

        System.out.println(appConfig1);
//        appConfig1.config("첫 번째 config");

        appConfig1.setApikey("TEST-KEY-123");
        appConfig1.setAppMode("DEBUG");
        System.out.println(appConfig1);

        AppConfig another = AppConfig.getInstance();
        System.out.println(another);

        System.out.println(appConfig1 == another);
        //싱글톤- 객체 하나로 돌려쓰는 것

    }
}
