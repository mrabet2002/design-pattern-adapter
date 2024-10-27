package computer;

public class Computer {
    private VGA vga;

    public Computer(VGA vga) {
        this.vga = vga;
    }

    public void connect(VGA vga) {
        this.vga = vga;
    }

    public void streamData(String data) {
        vga.streamData(data);
    }
}
