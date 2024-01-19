# EGChat
A Java CLI chatbot.

Structural Design Pattern:
- Composite
- Adapter:
  - NumberMessage - Clint E.
    - Used to adapt number values into ConsoleMessage based strings.

Creation Design Pattern:
- Factory Method
- Singleton:
  - ScannerSingleton - Clint E.
    - When creating a scanner you're constructing a new object each time. Each scanner functions virtually the same, dependent on the config given upon construction.
    - Rather than construct multiple identical scanners the ScannerSingleton will create a single instance of that scanner and then just return that scanner whenever requested.

Behavioral Design Pattern:
- Observer
- Command:
  - Message - Clint E.
    - Implements the command pattern by creating a central method of creation and use for creating messages, for example, console messages.
    - Any class can easily send a message to the console due to the uniformity provided by this implementation of the command design pattern.

