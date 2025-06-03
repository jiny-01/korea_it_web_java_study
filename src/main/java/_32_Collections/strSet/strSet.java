package _32_Collections.strSet;

import java.util.*;

//중복 요소 제거하고 출력, 순서X (인덱스 없음)
/*
*  List 는 순서가 있고 중복을 허용하지만 set은 순서도 없고 중복 허용 안함
* 수학에서의 집합 개념을 도입한 게 set
* 특성 차이 때문에 List -> set, set -> List 로 형변환하는 게 중요
* 중복이 있는 list 를 만들고 중복을 한번에 제거하기 위해 set로 변환 후에 중복 제거 가능
*
*
* */
public class strSet {
    //Set - 중복을 허용하지 않는 데이터들의 집합 => HashSet, LinkedHashSet, TreeSet
    //같은 값을 두 번 이상 저장할 수 없으며, 보통 고유한 값의 집합을 다룰 때 사용
    // HashSet - 순서가 없고 가장 빠른 성능
    //
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");

        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");

        strSet1.add("1");
        strSet1.add("1");

        strSet1.add("2");
        strSet1.add("2");
        strSet1.add("2");

        System.out.println(strSet1);


        for (String elem : strSet1){
            System.out.println(elem);
        }


//        for (int i = 0; i < strSet1.size(); i++) {
//            System.out.println(strSet1.get());
//        }
        //set 은 순서 X -> 인덱스가 없으므로 get 불가능

        //특정 element 추출 -> List 로 형변환
        strList1.addAll(strSet1);           //리스트명.addAll(클래스로 이루어진 거만 가능)

        for (int i = 0; i < strList1.size(); i++) {
            System.out.println(strList1.get(i));
        }

        strList1.addAll(strSet1);
        strList1.addAll(strSet1);
        System.out.println("리스트에 중복이 추가 된 후");
        System.out.println(strList1);

        for (String str : strList1) {
            System.out.println(str);
        }

        Collections.sort(strList1);
        System.out.println(strList1);

        //리스트로 변환해서 정렬한 것을 다시 Set로
        Set<String> strSet2 = new HashSet<>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);



    }
}
