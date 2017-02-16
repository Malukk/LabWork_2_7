package labWork_2_7_1to5;

/**
 * Created by Bulik on 26.07.2016.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed=speed;
        this.mac=mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+
                "speed=" + speed +
                ", mac=" + mac;
    }

    @Override
    public boolean equals(Object o) {
        if ( !super.equals(o)) return false;
        if (!(o instanceof EthernetAdapter)) return false;
        EthernetAdapter adapter = (EthernetAdapter) o;
        if (speed != adapter.speed) return false;
        return (mac.equals(adapter.mac));
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result +speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}
