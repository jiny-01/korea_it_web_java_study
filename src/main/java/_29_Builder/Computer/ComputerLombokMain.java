package _29_Builder.Computer;

public class ComputerLombokMain {
    public static void main(String[] args) {
        ComputerLombok computerLombok = ComputerLombok.builder()
                .cpu("AMD 7500f")
                .ram(16)
                .storage(256)
                .hasBluetooth(true)
                .hasWifi(true)
                .build();

        System.out.println(computerLombok);

    }


}
