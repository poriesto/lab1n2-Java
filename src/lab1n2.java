/**
 * Created by poriesto on 2/14/14.
 */
/**
 * Создать приложение с 2 параметрами, которое вычислит количество лет ,за которые сумма денег,положенная в банк, должна удвоится.
 * В качестве параметров задаются любые неотрицательные числа.
 *1-ое число - количество денег, 2-ое число-годовой процент.
 *Учесть, что проценты начисляются раз в месяц и капитализируются.Сосчитать и вывести на дисплей результат подсчета.
 * */
public class lab1n2 {
    public static void main(String[] argv){
        int year = 0;
        float init_money = Float.parseFloat(argv[0]), percent_per_year = Float.parseFloat(argv[1])/100, doxod = init_money*percent_per_year, target = init_money*2;
        System.out.println("Initial data:\n" + "Initial money = " + init_money + "\nPercent = " + percent_per_year + "%\nDoxod per year = " + doxod + "\nTarget money = " + target + "\n");

        while(init_money < target){
            init_money += doxod;
            System.out.print(init_money);
            System.out.print("\n");
            year++;
            if(year > 0){
                doxod = init_money*percent_per_year;
                System.out.print(doxod);
                System.out.print("\n");
            }
        }

        System.out.println("\nResults:" + "\n" + "Final result money = " + init_money + "\n" + "Years = " + year);
    }
}