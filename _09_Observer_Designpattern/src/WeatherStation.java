import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private List<MyObserver> observers = new ArrayList<>();



    @Override
    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(MyObserver o:observers){
            o.update(temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
