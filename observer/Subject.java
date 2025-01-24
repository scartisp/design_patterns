public interface Subject  {
    public void registerObserver(Observer obsever);
    public void removeObserver (Observer observer);
    public void notifyObservers();
}
