package _16_MultiArrayLoop;

public class MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회 - 이중 for문

        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //seats[0] -> A줄  {"A1", "A2", "A3", "A4", "A5"}
        // seats[0].length => 5
        //반복
        //seats[1] -> B줄  {"B1", "B2", "B3", "B4", "B5"}
        //seats[1].length => 5
        for (int i = 0; i < seats.length; i++) {              //세로 -> 3줄
            for (int j = 0; j < seats[i].length; j++) {          //가로 -> 5개  seats의 i번째 길이
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        String[][] imaxSeats = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j] = eng[i] + (j+1);
            }
        }

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }
        //위에서 [10][15] 지정해줘서 length 가 10, 15 로 반복되는지?
    }
}
