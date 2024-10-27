package computer;

public class Projector implements HDMI, VGA {
    public void streamData(byte[] data) {
        System.out.println("== Projector: " + new String(data));
    }

    public void streamData(String data) {
        System.out.println("== Projector: " + data);
    }
}
