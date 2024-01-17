// In src/tictactoe/Observable.java
package tictactoe;

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
