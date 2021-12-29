package environment;

import java.util.Objects;

public class Berth extends Thing {
    public Berth() {
        super("койка");
    }

    public Berth(int quant) {
        super("койки", 1488);
    }

    public String toString() {
        return getClass().getName() + " descr: " + getDescr() + " isMany: " + isMany;
    }

    public int hashCode() {
        return Objects.hash(getDescr(), isMany);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Berth objBerth = (Berth) obj;
        return getDescr().equals(objBerth.getDescr()) && isMany == objBerth.isMany;
    }
}
