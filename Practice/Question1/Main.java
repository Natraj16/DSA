package Practice.Question1;

public class Main {
    public static void main(String[] args) {
        SmartThermostat t=new SmartThermostat();

        double mycurrentTemp=t.getTemp();
        System.out.println(mycurrentTemp);

        t.setTemp(10);
        t.decreaseTemp();



    }
}
