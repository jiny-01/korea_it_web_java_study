package _32_Collections.strList;

import java.util.*;

public class ToDo {
    public static void main(String[] args) {
        //문제 - TodoList
        //1. todolist 를 담을 리스트 생성, 스캐너 객체도 하나 생성
        //2. 사용자에게 todo를 입력받을 건데 몇 개 입력할건지 count 변수에 입력받기
        //3. count 만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        //4. 향상된 for문을 이용, todoList 출력하기
        //5. todoList 출력한 뒤 특정 todo를 포함여부를 확인하기 위해서 searchTodo 라는 변수
        //   찾을 키워드를 입력받고 해당 searchTodo 가 있는지 여부 출력하기
        //6. 삭제할 todo 입력받아서 deleteTodo 에 대입해두고 삭제 후 성공여부 출력
        //   포함하고 있으면 삭제
        //7. todo들 정렬하고 전체 출력
        //8. 이번엔 역순으로 정렬하고 전체 출력
        //9. 전체 todo들의 갯수 출력

        //1. todolist 를 담을 리스트 생성
        List<String> todolist = new ArrayList<>();

//        List<String> todolist = new ArrayList<>(Arrays.asList("집가기"));

        //2. 스캐너로 입력받기
        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();

        System.out.println("할 일을 몇 개 입력하시겠습니까? ");
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(count);

        //3. count만큼 반복문, todo 입력받기
        for (int i = 0; i < count; i++) {
//            System.out.println((i + 1) + "번째 할일을 입력하세요 : ");
            String todo = scanner.nextLine();
            todolist.add(todo);
        }

        //4. 향상된 for문 이용
        for (String task : todolist){
            System.out.println("- " + task);
        }
        System.out.println(todolist);


        //5. 특정 todo 포함 여부

        System.out.println("포함 여부를 확인할 todo 를 입력해주세요 : ");
        String searchTodo = scanner.nextLine();
        boolean searchResult = todolist.contains(searchTodo);
        System.out.println("-> \"" + searchTodo + "\" 포함여부 : " + searchResult);


        //삭제할 todo 입력받기, deleteTodo 에 대입해두고 삭제 후 성공여부 출력, 포함하고 있으면 삭제
        System.out.println("삭제할 todo를 입력해주세요 : ");
        String del1 = scanner.nextLine();
        System.out.println(del1);

        boolean isDelete = todolist.contains(del1);
        if (isDelete) {
            todolist.remove(del1);
            boolean delResult = todolist.remove(del1);
            System.out.println(del1 + "의 삭제여부 : " + delResult);
        } else {
            System.out.println("해당 todo 는 존재하지 않습니다.");
        }
        System.out.println(todolist);


//        //6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 후 삭제, 성공여부 출력
//        System.out.print("삭제할 todo를 입력해주세요 : ");
//        String deleteTodo = scanner.nextLine();
//        boolean isContain = todoList.contains(deleteTodo);
//        if(isContain) {
//            boolean removeResult = todoList.remove(deleteTodo);
//            System.out.println("-> \"" + deleteTodo + "\" 삭제 여부 : " + removeResult);
//        } else {
//            System.out.println("해당 todo는 존재하지 않습니다.");
//        }

        //7. todo 정렬, 전체 출력
        Collections.sort(todolist);
        System.out.println("정렬된 ToDo 리스트 : " + todolist);
        for (String task : todolist){
            System.out.println("- " + task);
        }

        //8. 역순 정렬
        Collections.sort(todolist, Collections.reverseOrder());
        System.out.println("역순 정렬된 ToDo 리스트 : " + todolist);
        for (String task : todolist){
            System.out.println("- " + task);
        }

        //9. 전체 todo의 갯수
        System.out.println("전체 todo 의 갯수 : " + todolist.size());

    }
}
