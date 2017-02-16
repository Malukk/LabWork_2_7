package labWork_2_7_1to5;

/**
 * Created by Bulik on 26.07.2016.
 */
public class Monitor extends  Device{
    private  int resolutionX,
    resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX,int resolutionY ) {
        super(manufacturer, price, serialNumber);
        this.resolutionX=resolutionX;
        this.resolutionY=resolutionY;
    }


    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY ;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor)o;
        if (resolutionX != monitor.resolutionX) return false;
        return  (resolutionY == monitor.resolutionY);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 + result + resolutionX;
        result = 31 + result + resolutionY;
        return result;
    }
}

