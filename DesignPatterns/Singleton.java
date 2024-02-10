package DesignPatterns;

/**
 * https://www.youtube.com/watch?v=hUE_j6q0LTQ&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=6
 * 
 * The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance and provides a 
 * global point of access to that instance. It is one of the simplest design patterns and is often used to provide a 
 * single point of control to resources, configuration settings, or any instance that needs to be shared across the application.
 * 
 * Key features of the Singleton pattern include:
1. Single Instance: The pattern ensures that a class has only one instance. It provides a mechanism to access that instance from 
any point in the application.
2. Global Access: The singleton instance is globally accessible. Any part of the application can access the singleton 
instance without having to create it.

1. The constructor is private, preventing external classes from instantiating the Singleton class.
2. The getInstance() method provides a way to access the singleton instance. If the instance doesn't 
exist, it is created (lazy initialization).

The Singleton pattern is needed for various reasons:

1. Resource Sharing: It ensures that there is a single point of control for a shared resource, such as a database connection, 
configuration settings, or a pool of objects.

2. Global Configuration: Singleton is often used for managing global configuration settings that need to be accessed throughout 
the application.

3. Lazy Loading: It supports lazy loading, meaning the instance is created only when it is first requested, which can be useful for performance optimization.

4. Preventing Multiple Instances: In scenarios where creating multiple instances of a class could lead to issues, the Singleton pattern ensures there is only one instance.

However, it's essential to be cautious when using the Singleton pattern, as misuse can lead to global state issues and make testing more challenging.
 */

public class Singleton {
    // Private static instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to get the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization - create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and fields can be added as needed
}
