package heroes;

import environment.Thing;
import interfaces.*;

import java.util.Objects;

public class Rat extends Animal implements NoseMove, RunAway, LookAt, GotOutFrom {
    public void noseMove() {
        System.out.println(this.getName() + " стала шевелить носом");
    }

    public void runAway() {
        System.out.println(this.getName() + ", не особенно торопясь, отбежала в сторонку");
    }

    public void lookAt(Object obj) {
        Hero x = (Hero) obj;
        System.out.println(this.getName() + " стала поглядывать на " + x.getName());
    }

    public void gotOutFrom(Thing thing) {
        System.out.println(this.getName() + " вылезла из-под " + thing.getDescr());
    }

    public Rat() {
        super();
        this.setDescr("крыса");
    }

    public Rat(String name) {
        super(name);
        this.setDescr("крыса");
    }

    public Rat(int quant) {
        super(quant);
        this.setDescr("крысы");
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
        Rat objRat = (Rat) obj;
        return getDescr().equals(objRat.getDescr()) && getName().equals(objRat.getName()) && isMany == objRat.isMany;
    }
}
