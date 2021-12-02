package kitapSonuOrnekleri;
import java.util.Scanner;

/*İKİNCİ DERECEDEN DENKLEMİN KÖKÜNÜ BULMA*/
public class diskriminant {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        double a,b,c,x1,x2,Delta;

        System.out.printf("a değeri: ");
        a = gir.nextInt();
        System.out.printf("b değeri: ");
        b = gir.nextInt();
        System.out.printf("c değeri: ");
        c = gir.nextInt();
        Delta = (b*b) - (4 * a * c);
        if (Delta>0)
        {
            System.out.println("İki kök vardır");
            x1 = ((-1 * b) - Math.sqrt(Delta)) / (2 * a);
            x2 = ((-1 * b) + Math.sqrt(Delta)) / (2 * a);
            System.out.println(" x1 = " + x1 + " x2 = " + x2);
        }
        else if (Delta == 0)
        {
            System.out.println("Çakışık bir kök vardır");
            x1 = (-1 * b) / (2 * a) ;
            System.out.println("x1 = x2 " + x1);
        }
        else
        {
            System.out.println("Gerçek kök yoktur.");
        }}}
