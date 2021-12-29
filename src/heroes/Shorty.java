package heroes;

import environment.Thing;
import interfaces.ClimbOnto;

import java.util.Objects;

public class Shorty extends Hero implements ClimbOnto {
    public Shorty() {
        this.isMany = false;
        this.setDescr("коротышка");
    }

    public Shorty(String name) {
        this.isMany = false;
        this.setDescr("коротышка");
        this.setName(name);
    }

    public Shorty(int quant) {
        this.isMany = true;
        this.setDescr("коротышки");
    }

    public Shorty(String groupName, int quant) {
        this.isMany = true;
        this.setDescr(groupName);
    }

    public void climb(Thing thing) {
        System.out.println(this.getName() + " полез на " + thing.getDescr());
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
        Shorty objShorty = (Shorty) obj;
        return getDescr().equals(objShorty.getDescr()) && getName().equals(objShorty.getName()) && isMany == objShorty.isMany;
    }
}
