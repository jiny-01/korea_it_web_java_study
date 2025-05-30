package _30_Singleton.AppConfig;

import lombok.Data;

@Data  //자주 쓰는 시그니처 패키지 - 보통 다 달아둠
//안에 Getter, Setter, toString, EqualsAndHashCode, RequiredArgsConstructor,
public class AppConfig {
    private static AppConfig instance;    //AppConfig 가 들어갈 정적변수 instance

    private String apikey;
    private String appMode;

    private AppConfig(){
        this.apikey = "DEFAULT-KEY";
        this.appMode = "PRODUCTION";
    }

    public static AppConfig getInstance() {
        if(instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }


//    public void config(String message) {
//        System.out.println("AppConfig => " + message);
//    }




}
