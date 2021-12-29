package environment;

import java.util.Objects;

public class Bench extends Thing {
    public Bench() {
        super("скамейка");
    }

    public Bench(int quant) {
        super("скамейки", 1488);
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
        Bench objBench = (Bench) obj;
        return getDescr().equals(objBench) && isMany == objBench.isMany;
    }
}
