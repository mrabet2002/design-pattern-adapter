package computer;

public class TV implements HDMI {
    public void streamData(byte[] data) {
        System.out.println("== TV: " + new String(data));
    }
}
