# EGChat
A Java CLI chatbot.

Structural Design Pattern:
- Composite: João Tomás Santos
  - Component Interface (Component.java)
      The Component interface declares the common interface for all concrete classes. In this TicTacToe project, the Cell class serves as the base component.
  - Leaf Classes (EmptyCell, XCell, OCell)
      Implement the Component interface. They represent individual cells in the TicTacToe game.
  - Composite Class (TicTacToeGame)
      The TicTacToeGame class acts as the composite. It contains a 2D array of Component (cells) and treats individual cells and compositions of cells uniformly.

- Adapter:
  - NumberMessage - Clint E.
    - Used to adapt number values into ConsoleMessage based strings.



Creation Design Pattern:
- Factory Method
  - CellFactory 
    -The client code uses the CellFactory interface to create cells without specifying their concrete classes.
    Concrete factories (EmptyCellFactory, XCellFactory, OCellFactory) extend the factory interface and provide implementations for creating specific cell types.

- Singleton:
  - ScannerSingleton - Clint E.
    - When creating a scanner you're constructing a new object each time. Each scanner functions virtually the same, dependent on the config given upon construction.
    - Rather than construct multiple identical scanners the ScannerSingleton will create a single instance of that scanner and then just return that scanner whenever requested.


    
Behavioral Design Pattern:
- Observer: João Tomás Santos
  - Observers (TicTacToeConsoleUI) register with the observable (TicTacToeGame) using addObserver.
  -  The observable's state changes (e.g., a move is made).
  -  The observable calls notifyObservers, triggering the update method on each observer.
  -  Observers update their state based on the changes in the observable.

- Command:
  - Message - Clint E.
    - Implements the command pattern by creating a central method of creation and use for creating messages, for example, console messages.
    - Any class can easily send a message to the console due to the uniformity provided by this implementation of the command design pattern.

