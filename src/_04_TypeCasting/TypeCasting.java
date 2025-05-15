package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting

        //정수에서 실수로
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);    //sout((변환할 타입) 변수)
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);            //그대로 98 출력

        //실수에서 정수로
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);      //정수부분만 출력

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;       //눈에 보이진 않지만 (double)98 임
        System.out.println(sum1);     //합산된 값 175.3 출력

        int sum2 = 98 + (int)55.3F;
        System.out.println(sum2);

        System.out.println(convertedScoreInt);
        int covertedScoreInt = (int) scoreDouble; //int 에서 double 일 땐 수동

        //double -> float -> long -> int (수동 형변환)

        double convertedScoreDouble = scoreInt;  //double 이 Int보다 크기 때문에 가능
        //int -> long -> float -> double (자동 형변환)

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        //숫자에서 문자열로
        //int 에서 문자열
        String strNum1 = String.valueOf(55); //첫번째 방법
        strNum1 = Integer.toString(55); //두번째 방법
        System.out.println(strNum1);

        //double 에서 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        //float 에서 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        //문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);
        double d = Double.parseDouble("123.45");
        System.out.println(d);

        i = Integer.pareseInt("숫자");
        System.out.println(i);








        //int-> char 변환 강제 변환
    }
}
