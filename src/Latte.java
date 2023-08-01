public class Latte extends Menu {
    public static int Cup;
    static String name = "라떼";
    static int Money = 7000;
    static int Water = 350;
    static int Milk = 75;
    static int Bean = 20;

    //생성자

    public Latte(int Money, int Water,int Milk, int Bean, int Cup) {
        this.Money = Money;
        this.Water = Water;
        this.Bean = Bean;
        this.Milk = Milk;
    }


    //메소드
    public static int getMoney() {
        return Money;
    }

    public int getWater() {
        return Water;
    }

    public int getBean() {
        return Bean;
    }

    public static String getName() {
        return name;
    }

    public static int getMilk() {
        return Milk;
    }


    public static void setName(String name) {
        Latte.name = name;
    }

    public static void setMoney(int Money) {
        Latte.Money = Money;
    }

    public static void setWater(int Water) {
        Latte.Water = Water;
    }

    public static void setMilk(int Milk) {
        Latte.Milk = Milk;
    }

    public static void setBean(int Bean) {
        Latte.Bean = Bean;
    }
}

