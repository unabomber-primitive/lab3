package environment;

import java.util.Objects;

public class Hotel extends Place {


    public Hotel() {
        super("гостиница");
        Berth berthes = new Berth(1488);
        Bench bench = new Bench();
        this.add(berthes);
        this.add(bench);
    }

    public Hotel(String name) {
        super("гостиница " + name);
        Berth berthes = new Berth(1488);
        Bench bench = new Bench();
        this.add(berthes);
        this.add(bench);
    }

    public String toString() {
        return getClass().getName() + " descr: " + getDescr();
    }

    public int hashCode() {
        return Objects.hash(AliveContent, getDescr(), notAliveContent);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hotel objHotel = (Hotel) obj;
        return getDescr().equals(objHotel.getDescr())
                && AliveContent.equals(objHotel.AliveContent)
                && notAliveContent.equals(objHotel.notAliveContent);
    }
}
