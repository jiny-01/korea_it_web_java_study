package _32_Collections.strList;

//그냥 배열, map, set, list 중 유일하게 정렬 가능
//Collection - 여러 객체를 모아놓는 것 (안에 다 클래스 타입)
//list => 순서가 있는 데이터의 집합, 중복된 요소 허락함
//ArrayList(기본), LinkedList
//List 는 <E> 즉, elements 제네릭 사용
//배열과의 차이 : 크기 지정 X
//List, Arrays, ArrayList 가져와야 사용 가능

import java.util.*;

public class StrList {
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>();    //방법1
//        //element 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A");  //중복허용

        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A"));    //방법2
        System.out.println(strList1);

        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("Kotlin");
//        strList2.add("test@gmail.com");

        //비교를 위한 배열
        String[] strArray = new String[2];
        strArray[0] = "김지니";
        strArray[1] = "홍길동";

        System.out.println(Arrays.toString(strArray));
        System.out.println(strList2);

        //특정 element 의 포함 여부 => contains() 메소드 사용 => boolean 으로 리턴(true/false)
        String searchElem1 = "python";
        boolean isContains1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함여부: " + isContains1);

        String searchElem2 = "py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함여부: " + isContains2);
        //요소의 일부분을 물으면 완전하지 않으므로 false 나옴


//        String email = "test@gmail.com";
//        boolean isContains3 = strList2.contains("@");
//        System.out.println("@의 포함 여부 : " + isContains3);      //이건 false

        String email = "test@gmail.com";
        boolean isContains3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + isContains3);      //=> true
        //String 의 경우 char 들이 '순서대로' 나열된 것이기 때문에 char 하나가 포함된 것을
        //contains 로 부분검색이 가능하나
        //searchElem2 의 경우는 element 가 완전히 일치하는지를 확인하기 때문에
        //위와 같은 결과가 나온다.

        //특정 element를 삭제 -> remove() => return boolean
        String removeElem1 = "Kotlin";
        boolean removeResult = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제여부 : " + removeResult);
        System.out.println(strList2);

        //List 의 정렬 => 배열과 동일
        Collections.sort(strList2);     //마찬가지로 원본 리스트를 정렬시킴
        System.out.println("정렬된 strList2 : " + strList2);

        //역순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println("역순 정렬된 strList2 : " + strList2);

        //일반 for 문 순회
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + " 언어");
        }

        //향상된 for 문
        for (String lang : strList2) {
            System.out.println(lang);
        }


        //문제 - TodoList
        //1. todolist 를 담을 리스트 생성, 스캐너 객체도 하나 생성
        //2. 사용자에게 todo를 입력받을 건데 몇 개 입력할건지 count 변수에 입력받기
        //3. count 만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        //4. 향상된 for문을 이용, todoList 출력하기
        //5. todoList 출력한 뒤 특정 todo를 포함여부를 확인하기 위해서 searchTodo 라는 변수
        //   찾을 키워드를 입력받고 해당 searchTodo 가 있는지 여부 출력하기
        //6. 포함 여부 확인 후 삭제할 todo 입력받아서 deleteTodo 에 대입해두고 삭제 후 성공여부 출력
        //   포함하고 있으면 삭제
        //7. todo들 정렬하고 전체 출력
        //8. dlqjsdps durtnsdmfh wjdfufgkrh wjscp cnffur
        //9. 전체 todo들의 갯수 출력

        //1. todolist 를 담을 리스트 생성
        List<String> todolist = new ArrayList<>();


        //스캐너로 입력받기
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        //3. count만큼 반복문
        for (int i = 0; i < count; i++) {

        }

        String searchTodo = "집가기";





    }

}
