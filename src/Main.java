import computer.Computer;
import computer.adapter.HDMI_VGA_Adapter;
import computer.Monitor;
import computer.Projector;
import computer.TV;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new Monitor());
        computer.streamData("Hello, World!");


        HDMI_VGA_Adapter adapter = new HDMI_VGA_Adapter(new TV());
        computer.connect(adapter);
        computer.streamData("Hello, World!");

        adapter.connect(new Projector());
        computer.streamData("Hello, World!");

        computer.connect(new Projector());

        computer.streamData("Hello, World!");

    }
}