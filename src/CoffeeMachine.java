import javax.swing.text.html.Option;
import java.util.Scanner;

public class CoffeeMachine {
    private static int Money;
    public static void Purchase() {
        System.out.println("커피를 고르세요");
        System.out.println("1.에스프레소(가격 : 4000원) ");
        System.out.println("2.라떼(가격 : 7000원) ");
        System.out.println("3.카푸치노(가격 :6000원) ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Status status = new Status(400,540,120,9,50000);
        boolean run = true;

        System.out.println("커피 머신이 가동되었습니다");
        System.out.println("현재 커피머신 상태 : ");
        status.PrintStatus();
        while (run) {
            System.out.println("옵션을 선택하세요");
            System.out.println("1.구매,2.채우기,3.가져가기,4.종료");
            int option = scanner.nextInt();
            System.out.println("메뉴 선택> ");

            if (option == 1) {
                Purchase();
                int menu = scanner.nextInt();
                try {
                    if (menu == 1) {
                        System.out.println("커피 구매 완료 감사합니다");
                        System.out.println(Espresso.name + "가 준비되었습니다 맛있게 드세요");
                        status.Espresso();
                        status.PrintStatus();
                    } else if (menu == 2) {
                        System.out.println("커피 구매 완료 감사합니다");
                        System.out.println(Latte.name + "가 준비되었습니다 맛있게 드세요");
                        status.Latte();
                        status.PrintStatus();
                    } else if (menu == 3) {
                        System.out.println("커피 구매 완료 감사합니다");
                        System.out.println(Cappuccino.name + "가 준비되었습니다 맛있게 드세요");
                        status.Espresso();
                        status.PrintStatus();
                    }
                } catch (Exception e) {
                    if (status.Bean < 0 | status.Water < 0 | status.Milk < 0 | status.Cup < 0) {
                        System.out.println("재료가 부족합니다");
                    }
                }


            } else if (option == 2) {
            System.out.println("추가할 물의 양을 입력하세요.");
            status.Water += (scanner.nextInt());
            System.out.println("추가할 우유의 양을 입력하세요.");
            status.Milk += (scanner.nextInt());
            System.out.println("추가할 원두의 양을 입력하세요.");
            status.Bean += (scanner.nextInt());
            System.out.println("추가할 일회용 컵의 양을 입력하세요.");
            status.Cup += (scanner.nextInt());
            status.PrintStatus();
        } else if (option == 3) {
            System.out.print("돈을 꺼내기 : ");
            status.Money -= scanner.nextInt();
            status.PrintStatus();

        } else if (option == 4) {
            System.out.println("커피머신이 종료되었습니다.");
            run = false;
        }
      }
    }
  }



