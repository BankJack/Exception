package test1;

public class Com {
    private String name;
    private int cont;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Com{" +
                "name='" + name + '\'' +
                ", cont=" + cont +
                ", money=" + money +
                '}';
    }

    public Com() {
    }

    public Com(String name, int cont, double money) {
        this.name = name;
        this.cont = cont;
        this.money = money;
    }
}
