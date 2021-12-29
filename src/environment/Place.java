package environment;

import heroes.*;

import java.util.ArrayList;
import java.util.List;

public class Place {
    public List<Thing> notAliveContent = new ArrayList<>();
    public List<Hero> AliveContent = new ArrayList<>();

    public void add(Thing thing) {
        notAliveContent.add(thing);
    }
    public void add(Hero hero) {
        AliveContent.add(hero);
    }

    private String descr;
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public String getDescr() {
        return this.descr;
    }
    public Place() {
        this.descr = "локация";
    }
    public Place(String descr) {
        this.descr = descr;
    }
}
