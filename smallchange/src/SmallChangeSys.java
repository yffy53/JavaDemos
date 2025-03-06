import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key;

        String details = "----------------零钱通明细----------------";

        double money;
        double balance = 0;
        Date date;  //表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");  //可以用于日期格式化

        String note;

        do {
            System.out.println("=======零钱通菜单=======");
            System.out.println("\t1 零钱通明细");
            System.out.println("\t2 收益入账");
            System.out.println("\t3 消费");
            System.out.println("\t4 退     出");

            System.out.print("请选择(1-4):");
            key = sc.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = sc.nextDouble();

                    balance += money;
                    date = new Date();  //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("消费金额:");
                    money = sc.nextDouble();

                    System.out.print("消费说明:");
                    note = sc.next();

                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) +"\t" + balance;
                    break;
                case "4":
                    String choice;
                    do {
                        System.out.println("你确定要退出吗？y/n");
                        choice = sc.next();
                    } while (!"y".equals(choice) && !"n".equals(choice));
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);

        System.out.println("----退出了零钱通项目----");

    }
}
