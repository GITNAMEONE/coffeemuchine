public class Status {
    static int Water;
    static int Milk;
    static int Bean;
    static int Cup;
    static int Money;
    Cappuccino cappuccino =new Cappuccino(6000,200,100, 12,1 );
    Espresso espresso = new Espresso(4000,250,16,1);
    Latte latte = new Latte(7000, 350,75,20,1);

    Status(int Water, int Milk, int Bean, int Cup, int Money) {
        this.Water = Water;
        this.Milk = Milk;
        this.Bean = Bean;
        this.Cup = Cup;
        this.Money = Money;
    }


    void PrintStatus(){
        System.out.println("남은 재료와 돈 상태 : ");
        System.out.println("물 : " + Water + " ml");
        System.out.println("우유 : " + Milk + " ml");
        System.out.println("원두 : " + Bean + " g");
        System.out.println("일회용 컵 " + Cup + " 개");
        System.out.println("돈 : " + Money + " 원");
    }
    void Espresso(){
        Status.Water-=espresso.Water;
        Status.Bean-=espresso.Bean;
        Status.Money+=espresso.getMoney();
        Status.Cup --;
    }

    void Cappuccino(){
        Status.Water -= cappuccino.Water;
        Status.Milk -= cappuccino.Milk;
        Status.Bean -= cappuccino.Bean;
        Status.Money += cappuccino.getMoney();
        Status.Cup --;

    }

    void Latte(){
        Status.Water -= Latte.Water;
        Status.Milk -= Latte.Milk;
        Status.Bean -= Latte.Bean;
        Status.Money += Latte.getMoney();
        Status.Cup --;

    }
    static int Withdraw(int withdraw){
        System.out.println("출금할 돈을 입력해주세요.");
        Money -= withdraw;
        return Money;
    }
}
