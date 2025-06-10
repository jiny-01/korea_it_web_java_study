package _36_StreamApi;

//StreamAPI
// Java8 도입되었음, 컬렉션(List, Set) 과 배열에 저장된 데이터를 선언형으로 처리하기 위한
//추상화된 반복 프레임워크
//필터링, 매핑, 정렬, 집계 등

//간결성 => 가독성 향상(메소드 체이닝)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사",
                "최오", "최육", "이칠", "박팔");
        System.out.println(names);

        //filter() => 말 그대로 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream().filter
                     (name -> name.startsWith("김"))     //김으로 시작되는지? - 반환: boolean 이므로 toList
                     .toList();                                       //toList 안하면 Stream 타입

        System.out.println(namesWithKim);

        List<String> englishNames = Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy");
        System.out.println("englishNames : " + englishNames);

        List<String> result = englishNames.stream().filter
                    (name -> name.startsWith("a"))      // name 을 매개변수로 참조해서 a로 시작하는 것 필터링
//              // = map(name -> name.toUpperCase)
                .map(String::toUpperCase)
                .sorted()     //정렬
                .toList();
        //map - 요소 하나하나에 어떤 것(메소드)을 적용시킴 -> filter 로 걸러낸 값은 모두 String 이기 때문
        //-> 내부 요소들에게 각각 메소드를 적용하는 형태

        //() -> , ::  같은 작용
        // () -> 는 각각 요소를 매개변수로 받아서 매개변수를 참조하여 메소드를 호출
        // :: 는 해당 타입 클래스의 메소드를 직접 호출하여 각각 요소에 적용


        System.out.println("result : " + result);

//        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);

        //만약에 이름 길이가 3이상인것만 갯수를 구한다면?

//

//        List<String> a_Result = englishNames.stream().filter
//                (name -> System.out.println(name.length()).toList;


//        int count = a_Result.size();

        int count = 0;
        for (int i = 0; i < englishNames.size(); i++) {

            if(englishNames.get(i).length() >= 4) {
                count++;
            }
            System.out.println("문자열 길이 4이상(일반 for문) : " + count);

//            int len = englishNames.size();
//
//            int count = englishNames.get(i).length();
//            int isCount = count >= 3;
//            System.out.println(isCount);
        }

        System.out.println("문자열 길이 4이상(일반 for문) : " + count);

        long count1 = englishNames.stream()
                .filter(name -> name.length() >= 4)
                .count();              //count 가 long 으로 반환함  -> 따라서 int 가 아닌 long 으로 해줘야함
        System.out.println("문자열 길이 4이상(stream) : " + count1);
    }

}
