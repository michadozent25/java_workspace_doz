public class View1 implements MyObserver{
    @Override
    public void update(float temperature) {
        System.out.println(getClass().getName()+"Temperatur: "+temperature);
    }
}
