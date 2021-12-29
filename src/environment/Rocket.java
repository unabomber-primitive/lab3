package environment;

import java.util.Objects;

public class Rocket extends Place {
    public Rocket() {
        super("ракета");
    }

    public Rocket(String name) {
        super(name);
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
        Rocket objRocket = (Rocket) obj;
        return getDescr().equals(objRocket.getDescr())
                && AliveContent.equals(objRocket.AliveContent)
                && notAliveContent.equals(objRocket.notAliveContent);
    }
}
