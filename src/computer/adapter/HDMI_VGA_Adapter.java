package computer.adapter;

import computer.HDMI;
import computer.VGA;

public class HDMI_VGA_Adapter implements VGA {
    private HDMI hdmi;

    public HDMI_VGA_Adapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    public void connect(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    public void streamData(String data) {
        System.out.println("== HDMI_VGA_Adapter ==");
        byte[] bytes = data.getBytes();
        hdmi.streamData(bytes);
        System.out.println("======================");
    }
}
