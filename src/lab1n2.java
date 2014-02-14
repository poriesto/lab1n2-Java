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
    public static void main(String[] argc){
        int year = 0;
        float init_money = Float.parseFloat(argc[0]), percent_per_mo = Float.parseFloat(argc[1]), doxod = (init_money*percent_per_mo)*12, target = init_money*2;
        System.out.println("Initial data:\n" + "Initial money = " + init_money + "\nDoxod per mo = " + init_money*percent_per_mo +
                "\nDoxod per year = " + doxod + "\nTarget money = " + target + "\n");

        while(init_money < target){
            init_money += doxod;
            year++;
            if(year > 1){
                doxod = (init_money*percent_per_mo)*12;
            }
        }

        System.out.println("\nResults:" + "\n" + "Final result money = " + init_money + "\n" + "Years = " + year);
    }
}