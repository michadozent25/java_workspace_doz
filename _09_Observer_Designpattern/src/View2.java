public class View2 implements MyObserver{
    @Override
    public void update(float temperature) {
        System.out.println(getClass().getName()+"Temperatur: "+temperature);
    }
}
