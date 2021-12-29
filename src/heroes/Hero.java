package heroes;

import environment.Food;
import environment.Place;
import interfaces.*;

public abstract class Hero implements LookAround, NoticeThat, Sleep, LayQuiet, HadCold, Nightmare, RememberedAbout {
    public boolean isMany;
    private String descr;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (name == null ? this.descr : this.name);
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return this.descr;
    }

    public void lookAround() {
        System.out.println(this.getName() + " осмотрелся по сторонам");
    }

    public void noticeThat() {
        System.out.print(this.getName() + " заметил, что ");
    }

    public void sleep() {
        if(!this.isMany) {
            System.out.println(this.getName() + " спит");
        }
        else {
            System.out.println(this.getName() + " спят");
        }
    }

    public void layQuiet() {
        System.out.println(this.getName() + " лежал тихо");
    }

    public void hadCold() {
        if(!this.isMany) {
            System.out.println(this.getName() + " был простужен и задыхался от кашля");
        }
        else {
            System.out.println(this.getName() + " были простужены и задыхались от кашля");
        }
    }

    public void nightmare() {
        if(!this.isMany) {
            System.out.println(this.getName() + " был терзаем кошмарами, стонал мычал и вскрикивал во время сна");
        }
        else {
            System.out.println(this.getName() + " были терзаемы кошмарами, стонали мычали и вскрикивали во время сна");
        }
    }

    public void rememberedAbout(Object obj) {
        Hero x = (Hero) obj;
        System.out.println(this.getName() + " вспомнил про " + x.getName());
    }

    public FoodCountIn rocket = (Place place) -> {System.out.println(this.getName() + " начал считать, на сколько дней может хватить запасов еды в " + place.getDescr());};


/*    public Hero() {
        this.isMany = false;
        this.descr = "персонаж";
    }

    public Hero(String name) {
        this.isMany = false;
        this.descr = "персонаж";
        this.name = name;
    }

    public Hero(int quant) {
        this.isMany = true;
        this.descr = "персонажи";
    }

    public Hero(String groupName, int quant) {
        this.isMany = true;
        this.descr = groupName;
    }*/
}
