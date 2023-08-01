

public class Espresso extends Menu{
    public int Cup;
    private String Espresso;
    //필드
    static String name = "에스프레소";
    static int Money = 4000;
    int Water = 250;
    int Bean = 16;

    //생성자

    public Espresso(int Money, int Water, int Bean, int Cup) {
        this.Money = Money;
        this.Water = Water;
        this.Bean = Bean;

    }


    //메소드
    public int getMoney() {
        return Money;
    }

    public int getWater() {
        return Water;
    }

    public int getBean() {
        return Bean;
    }

    public String getEspresso() {
        return Espresso;
    }

    public static String getName() {
        return name;
    }

    public void setMoney(int Money) {
        this.Money += Money;
    }

    public void setWater(int Water) {
        this.Water -= Water;
    }

    public void setBean(int Bean) {
        this.Bean -= Bean;
    }

    public void setEspresso(String espresso) {
        Espresso = espresso;
    }

}
