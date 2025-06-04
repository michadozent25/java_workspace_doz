import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();
        View1 v1 = new View1();
        View2 v2 = new View2();
        station.addObserver(v1);
        station.addObserver(v2);
        station.addObserver(temp->{  //3. View
            System.out.println(Main.class.getName()+"Temperatur: "+temp);
        });



        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            station.setTemperature(r.nextFloat(-10,40));
        }
    }
}