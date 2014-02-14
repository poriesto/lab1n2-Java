import java.util.*;
/**
 * Created by poriesto on 2/14/14.
 */
public class lab1n2 {
    public static void main(String[] argc){
        int year = 0;
        float init_money = Float.parseFloat(argc[0]), percent_per_mo = Float.parseFloat(argc[1]), doxod = (init_money*percent_per_mo)*12, target = init_money*2;
        System.out.print("Initial data:\n");
        System.out.print("Initial money = "); System.out.print(init_money); System.out.print("\n");
        System.out.print("Doxod per mo = "); System.out.print(init_money*percent_per_mo); System.out.print("\n");
        System.out.print("Doxod per year = "); System.out.print(doxod); System.out.print("\n");
        System.out.print("Target money = "); System.out.print(target); System.out.print("\n");

        while(init_money < target){
            init_money += doxod;
            year++;
        }
        System.out.print("Results:\n");
        System.out.print("final result money = "); System.out.print(init_money); System.out.print("\n");
        System.out.print("Years = "); System.out.print(year); System.out.print("\n");
    }
}
