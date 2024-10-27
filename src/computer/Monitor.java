package computer;

public class Monitor implements VGA {
    public void streamData(String data) {
        System.out.println("== Monitor: " + data);
    }
}
