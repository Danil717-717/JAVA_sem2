import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class HW_Task01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW_Task01.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        logger.setLevel(logger.getLevel());
        logger.log(INFO,"Текст");

        int [] mas = {11, 4, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}
