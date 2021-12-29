package environment;

import java.util.Objects;

public class Food extends Thing{
    private String descr;
    public boolean isMany;

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return this.descr;
    }

    public Food() {
        this.isMany = false;
        this.descr = "еда";
    }

    public Food(String descr) {
        this.isMany = false;
        this.descr = descr;
    }

    public Food(int quant) {
        this.isMany = true;
        this.descr = "запасы еды";
    }

    public Food(String descr, int quant) {
        this.isMany = true;
        this.descr = descr;
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
        Food objFood = (Food) obj;
        return getDescr().equals(objFood.getDescr()) && isMany == objFood.isMany;
    }
}
