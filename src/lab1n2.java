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
        double month = 0, summ_month = 12, d_per_m;
        double init_money = Double.parseDouble(argv[0]), percent_per_year = (Double.parseDouble(argv[1])/100);
        double doxod = init_money*percent_per_year, target = init_money*2;

        System.out.println("Initial data:\n" + "Initial money = " + init_money + "\nPercent = " + percent_per_year + "%\nDoxod per year = " + doxod + "\nTarget money = " + target);

        while(init_money < target){
            d_per_m = init_money*(percent_per_year);
            init_money = init_money + (d_per_m/12);
            month++;
        }
        month = month+1;

        System.out.println("\nResults:" + "\n" + "Final result money = " + init_money + "\n" + "Years = " + month/summ_month);
    }
}
