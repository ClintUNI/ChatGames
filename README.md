# EGChat
A Java CLI chatbot and with a TicTacToe game!!! Welcome to our programs.

Autors:
Clint Eschenhorst
João Tomás Santos

Cooperation: 
  For 2 weeks, up until the hand-in date, we met up at the library in order to work and discuss this assignment. 
  In the beginning, Joao suggested that we could make a TikTacToe console game. We had our idea, we just needed to execute it.
  We spent the first few days sketching out diagrams for how we might implement this game, as well as further investigating design patterns.
  I, CLint, took inspiration from this and went on a spree by creating a framework for interacting with a user through the console. Joao's ideas for execution 
  of his game allowed me to gain insight into how I should design my framework.

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

- Proxy:
  - MessageService - Clint E.
    - This service acts as a proxy-like cache, when creating new ConsoleMessages with this proxy it will first check a dictionary to see if that exact message already exists. If it does, it will return it else it will create and store a new one.


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

