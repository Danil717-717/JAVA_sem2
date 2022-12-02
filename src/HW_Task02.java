import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;


public class HW_Task02 {

    static {
        System.setProperty("java.format", "%1$F %1$tT [%4$-7s] %3$s - 5$s %n");
    }

    static java.util.logging.Logger log = java.util.logging.Logger.getLogger(HW_Task02.class.getName());



    public static void main(String[] args) throws IOException {

        Handler fileHandler = new FileHandler("loggingCalc.log", 100 * 1024, 3, true);
        fileHandler.setFormatter((new SimpleFormatter()));
        log.addHandler(fileHandler);

        log.setLevel(Level.ALL);

        log.info("Start");

        Scanner scan = new Scanner(System.in);
        System.out.print("������� ������ �����: ");

        int num1 = scan.nextInt();
        log.info("���� 1 ����� " + num1);
        System.out.println();

        System.out.print("������� ������ �����: ");
        int num2 = scan.nextInt();


        log.info("���� 2 ����� " + num2);

        int res;

        System.out.print("������� �������� '+' '-' '*' '/' ");
        System.out.println();
        String action = scan.nextLine();
        action = scan.nextLine();
        System.out.println();
        log.info("���� �������� " + action);

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("���������: " + res);
                log.info("���������: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("���������: " + res);
                log.info("���������: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("���������: " + res);
                log.info("���������: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("error");
                    log.info("������");
                } else {
                    res = num1 - num2;
                    System.out.println("���������: " + res);
                    log.info("���������: " + res);
                }
                break;
            default:
                System.out.println("��� ���");
                log.info("��� ���");

        }
    }
}



