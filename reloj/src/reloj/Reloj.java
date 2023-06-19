package reloj;

/**
 *
 * @author labtecweb10
 */
public class Reloj {

    
    public static void main(String[] args) throws InterruptedException {

        int s = 0;
        int m = 0;
        int h = 0;

        while (true) {
            System.out.println(h + ":" + m + ":" + s);

            s++;
            if (s == 59) {
                s = 0;
                m++;
                if (m == 59) {
                    h++;
                    m = 0;
                }
            }

            Thread.sleep(10);

        }
    }

}
