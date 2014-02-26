/**
 * Created by poriesto on 2/14/14.
 */
/**
 * Создать приложение с 2 параметрами, которое вычислит количество лет ,за которые сумма денег,положенная в банк, должна удвоится.
 * В качестве параметров задаются любые неотрицательные числа.
 *1-ое число - количество денег, 2-ое число-годовой процент.
 *Учесть, что проценты начисляются раз в месяц и капитализируются.Сосчитать и вывести на дисплей результат подсчета.
 * */
import java.util.*;
 class Economy{
    private Double month = 0.0;
    Integer year = 12;
    private Double percent_per_year, doxod_per_month, target;
    private Vector<Double> dpm = new Vector<Double>();
    public Double init_money;

    public void init(String[] str){
        init_money = Double.parseDouble(str[0]);
        percent_per_year = Double.parseDouble(str[1])/100;
        target = init_money*2;
    }
    public void print_initial_date(){
        System.out.println("Initial money: " + init_money + "\nTarget money: " + target + "\nPercent per year: " + percent_per_year*100 +"%");
    }
    public void print_results(){
        System.out.println("Result money = " + init_money + "\nYears: " +(month / year) + "\nDoxod per month:");
        DPM();
    }
    private void DPM(){
        int i = 0;
        while(i != dpm.size()){
            System.out.println("\tMonth " + (i+1) + " Doxod = " + dpm.elementAt(i));
            i++;
        }
    }
    public void calculate(){
        while(init_money < target){
            doxod_per_month = (init_money*(percent_per_year))/year;
            dpm.add(doxod_per_month);
            init_money = init_money + doxod_per_month;
            month++;
        }
    }
}

public class lab1n2 {
    public static void main(String[] argv){
        Economy ec = new Economy();
        ec.init(argv);
        ec.print_initial_date();
        ec.calculate();
        ec.print_results();
    }
}
