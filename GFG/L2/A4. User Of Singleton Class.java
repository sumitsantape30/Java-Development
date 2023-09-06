A Singleton class is a design pattern in software engineering that restricts the instantiation of a class to a single instance and 
  provides a global point of access to that instance. In other words, it ensures that there is only one instance of the class created 
and that it can be accessed from anywhere within the application. The Singleton pattern is used for various reasons:

Global Point of Access: A Singleton provides a single point of access to its instance, making it easy to access that instance from any 
  part of the program. This is particularly useful when you need to coordinate actions across the application, such as managing a 
  configuration or a centralized resource.

Resource Management: Singletons can be used to manage resources that are shared across the application, such as database connections, 
  thread pools, or caching mechanisms. By having a single instance, you can ensure proper resource utilization and avoid resource 
  contention issues.

Lazy Initialization: Singletons can be lazily initialized, which means that the instance is created only when it's first needed. 
  This can be helpful for improving application startup time and conserving memory when the Singleton is not immediately required.

Data Sharing: Singletons can be used for sharing data or state across different components or modules of an application. For example, 
  in a game, a Singleton might manage the player's score, and any part of the game can access or update it.

Thread Safety: When implemented correctly, Singleton patterns can provide a level of thread safety. In a multi-threaded environment, 
  having a single instance can help avoid race conditions and synchronization issues.

Configuration Management: Singletons are often used to manage application configuration settings. They can load and store configuration
  values, making it easy to change settings globally without scattering configuration logic throughout the codebase.

Logging and Error Handling: Singletons can be used to centralize logging and error handling in an application. A single logging 
  instance can record events and errors from various parts of the program.

Example:

humare pas java application hai usme 4 classes hai aur usko mySQl ke sath connect krna hai, 4 classes ko sql ke sath krne keliye 4 connections banane padenge
instead we can create DBConnection.java aur uske thorugh connection denge isse humare resources save hue.
