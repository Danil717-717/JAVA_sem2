import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

import static java.util.logging.Level.INFO;

public class HW_Task01 {

    static {
        System.setProperty("java.format", "%1$F %1$tT [%4$-7s] %3$s - 5$s %n");
    }

    static java.util.logging.Logger log = java.util.logging.Logger.getLogger(HW_Task01.class.getName());
    public static void main(String[] args) throws IOException {

        Handler fileHandler = new FileHandler("logging.log", 100 * 1024, 3, true);
        fileHandler.setFormatter((new SimpleFormatter()));
        log.addHandler(fileHandler);

        log.setLevel(Level.ALL);

        log.log(INFO, "[11, 4, 14, 16, 7]");

        int [] mas = {11, 4, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        log.info("Start");
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    int count = i;
                    log.info(String.valueOf(count) + " - колличество операций");
                    System.out.println(count);
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

        log.info("End");


        Logger logger = Logger.getLogger(HW_Task01.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        //logger.setLevel(logger.getLevel());
        //logger.log(Level.WARNING, );
        //logger.info();

        // как написать?

    }

}
