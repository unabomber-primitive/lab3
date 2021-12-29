package environment;

public class Thing {
    private String descr;
    public boolean isMany;

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return this.descr;
    }

    public Thing() {
        this.isMany = false;
        this.descr = "предмет";
    }

    public Thing(String descr) {
        this.isMany = false;
        this.descr = descr;
    }

    public Thing(int quant) {
        this.isMany = true;
        this.descr = "предметы";
    }

    public Thing(String descr, int quant) {
        this.isMany = true;
        this.descr = descr;
    }

}
