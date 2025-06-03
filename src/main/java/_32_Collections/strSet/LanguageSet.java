package _32_Collections.strSet;


import java.util.*;

//문제
//1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"
//리스트 만들어서 추가
//2. Set 하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기 -> 제거한 후 Set 출력
//3. 정렬을 위해서 다시 List2 로 만들고 Set 에 있던 요소들을 List 에 넣기
//4. List 를 정렬하고 정렬된 언어목록 출력하기
//5. searchLang 변수에 "Java"대입하고 해당 변수를 이용해서 리스트에서 몇 개 있는지 출력 (검색)
//6. 중복 제거를 위해 만들었던 set 를 이용해서 중복 제거된 후의 언어 갯수 출력하기


public class LanguageSet {
    public static void main(String[] args) {

        //1. 리스트 만들어서 추가
        List<String> langList1 = new ArrayList<>
                (Arrays.asList("Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"));

        //2. Set 하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기
//        Set<String> languageSet = new HashSet<>(langList1);   //바로 리스트 요소 Set 변환 가능

        Set<String> langSet1 = new HashSet<>();
        langSet1.addAll(langList1);
        System.out.println("중복 제거된 세트 : " + langSet1);

//        3. 정렬을 위해서 다시 List2 로 만들고 Set 에 있던 요소들을 List 에 넣기
        List<String> langList2 = new ArrayList<>();

        //4. 정렬된 언어목록
        Collections.sort(langList2);
        System.out.println("정렬된 언어목록 : " + langList2);

        Set<String> langSet2 = new HashSet<>();
        langSet2.addAll(langList2);

        //searchLang 변수에 "Java"대입
        String searchLang = "Java";
        int count = Collections.frequency(langList1, searchLang);
        System.out.println("\"" + searchLang + "\"의 개수: " + count);

        //중복제거 된 언어 갯수
        System.out.println("중복 제거된 언어 갯수 : " + langSet2.size());


//        Collections.frequency(langList1, "Java");










    }
}
