package _15_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        //다차원 배열 (2차원 배열)

        //영화관 좌석
        //A1~A5
        //B1~B5
        //C1~C5
        //
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //3 X 5 배열  //[3][5]
        //[ [], [], [] ] 형태
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //Alt + 드래그 -> 특정 영역 선택 복사
        //B3 출력
        System.out.println(seats[1][2]);  //[1]: 1번째 줄(B줄) [2]: B배열의 인덱스 2번쨰
        //C4 출력
        System.out.println(seats[2][3]);


        //첫 줄에 3칸, 두번째 줄에 4칸, 세번째 줄에 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[1][1]);



    }
}
