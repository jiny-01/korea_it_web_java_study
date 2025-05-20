//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Multi_test {
    public static void main(String[] args) {

        //다차원 배열 합 구하기 - 풀어보기
        // 3X3 크기 1부터 홀수만 차례대로 대입하고 출력해서 확인
        // 그 수들의 합 구하기

        int[][] numlist = new int[3][3];
        int num = 1;
        int sum = 0;
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist[i].length; j++) {
                numlist[i][j] = num;            //2차원 배열 i의 j 에 num 대입
                num += 2;                       //홀수만 입력되도록
                sum += numlist[i][j];
                System.out.print(numlist[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("총합: " + sum);
//        int sum = 0;
//        for (int[] numbers : numlist) {   //numlist의 각 요소는 numbers 로
//            for num : numbers) {        //numbers 배열 안 값 하나씩
//            sum += num;
//            }
//            System.out.println(numlist);
//        }




//        for (int i = 0; i < numlist.length; i++) {
//            for (int j = 0; j < numlist[i].length; j++) {
//            }
//            System.out.println();

    }
}
