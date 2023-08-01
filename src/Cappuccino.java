public class Cappuccino extends Menu {
    static String name = "카푸치노";
    public int Cup;
    int Money = 6000;
    static int Water = 200;
    static int Milk = 100;
    static int Bean = 12;

    //생성자
    public Cappuccino(int Money, int Water, int Milk, int Bean,int Cup) {
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

    public int getCoffeeBean() {
        return Bean;
    }

    public int getMilk() {
        return Milk;
    }

    public static String getName() {
        return name;
    }

    public int setMoney(int Money) {
        this.Money += Money;
        return Money;
    }

    public int setWater(int Water) {
        this.Water -= Water;
        return Water;
    }

    public int setBean(int Bean) {
        this.Bean -= Bean;
        return Bean;
    }

    public int setMilk(int Milk) {
        this.Milk -= Milk;
        return Milk;
    }

    public static void setName(String name) {
        Cappuccino.name = name;
    }
}

