package heroes;

import java.util.Objects;

public class Bedbugs extends Animal {
    public Bedbugs() {
        super();
        this.setDescr("клоп");
    }

    public Bedbugs(int quant) {
        super(quant);
        this.setDescr("клопы");
    }

    public String toString() {
        return getClass().getName() + " descr: " + getDescr() + " name: " + getName() + " isMany: " + isMany;
    }

    public int hashCode() {
        return Objects.hash(getName(), getDescr(), isMany);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bedbugs objBedbugs = (Bedbugs) obj;
        return getDescr().equals(objBedbugs.getDescr()) && getName().equals(objBedbugs.getName()) && isMany == objBedbugs.isMany;
    }
}
