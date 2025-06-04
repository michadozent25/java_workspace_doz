public interface Subject {

    void  addObserver(MyObserver  observer);
    void removeObserver(MyObserver observer);
    void notifyObservers();
}
