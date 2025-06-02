package _31_Generic.Generic_Wildcard.UnBoundedWildcard;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(1235);


        Box<Date> dateBox = new Box<>();
        dateBox.getItem();
        //UnBoundedWildcard 는 가능? 그냥 <?>


        UnBoundedWildcard.printBox(stringBox);
        UnBoundedWildcard.printBox(integerBox);
    }

}
