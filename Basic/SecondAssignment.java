public class SecondAssignment{
    public static void main(String [] args){
    //Assignment 2nd : 9//12/24

        /*
        Q.1  What is Java?

            Java is a high-level, object-oriented programming language designed to be platform-independent, secure, and efficient. It was developed by Sun Microsystems (now owned by Oracle) and is widely used for building applications that can run on different platforms (Windows, Mac, Linux, etc.) without modification.

            Java programs are compiled into an intermediate form called bytecode, which can be executed on any system that has a Java Virtual Machine (JVM). This is part of the write once, run anywhere (WORA) philosophy of Java.

        Q.2  Top Features of Java

            Platform Independence:
            Java code is compiled into bytecode that runs on the JVM. This allows Java programs to be executed on any device with a compatible JVM, making Java highly platform-independent.
            
            Object-Oriented:
            Everything in Java is treated as an object, which simplifies the design, development, and maintenance of software. Java supports core OOP concepts like inheritance, polymorphism, encapsulation, and abstraction.

            Simplicity:
            Java was designed to be easy to use and accessible to programmers with a background in C/C++. It eliminates many of the complexities of C (like pointer arithmetic) and has built-in memory management via garbage collection.

            Security:
            Java offers robust security features like bytecode verification and the sandbox model, which helps protect against harmful code execution. It also supports SSL, cryptography, and authentication mechanisms.

            Multithreading:
            Java has built-in support for multithreading, allowing developers to write programs that can perform multiple tasks concurrently. This is especially useful for applications like games, real-time systems, and servers.

            Garbage Collection:
            Java automatically handles memory management, reclaiming unused objects through garbage collection, 

            While Java is an interpreted language, it includes a Just-In-Time (JIT) compiler which converts bytecode into native machine code at runtime, improving performance.
            Distributed Computing:

            Java supports building distributed applications with features like RMI (Remote Method Invocation) and CORBA, making it easy to create applications that run on multiple machines.


        Q.3  JDK, JRE, and JVM

            JDK (Java Development Kit):
            JDK is a software development kit that includes everything needed to develop Java applications, including the JRE, compilers, and debuggers. It allows you to write, compile, and run Java programs.

            JRE (Java Runtime Environment):
            JRE provides the libraries, Java Virtual Machine (JVM), and other components needed to run Java applications. It is used for running Java programs but does not contain development tools like compilers.

            JVM (Java Virtual Machine):
            JVM is the engine that provides an environment for executing Java bytecode. It abstracts the underlying operating system and hardware, allowing Java programs to run on any platform. It handles tasks such as memory management, garbage collection, and converting bytecode into machine code.

        Q.4  JVM Internal Functionality


            The JVM performs several key tasks when running a Java program:

            Class Loading:
            The JVM loads .class files (which contain the compiled bytecode) into memory when a Java program is executed. The class loader searches for classes from the classpath, starting from the Bootstrap ClassLoader and moving to the Extension ClassLoader and System ClassLoader.
            
            Bytecode Verification:
            The JVM verifies bytecode for integrity to ensure that no invalid or malicious instructions are present before it is executed. This is a key security feature of Java.

            Memory Management:
            The JVM manages memory using heap memory (for dynamic memory allocation), stack memory (for method execution), and the method area (for storing class definitions and static variables). It also runs garbage collection to reclaim memory from objects that are no longer in use.

            Execution Engine:
            The JVM has an execution engine that interprets or compiles bytecode into machine code. This engine can use a Just-In-Time (JIT) compiler to optimize performance.

            Garbage Collection:
            The JVM automatically reclaims memory occupied by objects that are no longer in use. This process is managed by garbage collection.

            Thread Management:
            The JVM provides support for multithreading and manages threads through synchronization and scheduling.

        Q.5 What is Bytecode?

            Bytecode is the intermediate code generated by the Java compiler from your Java source code (with a .java extension). Unlike machine code, which is specific to a particular hardware architecture, bytecode is a platform-independent, low-level representation of the code.

            When you compile a Java program, it is converted into bytecode (contained in .class files), which the JVM interprets or compiles into machine code during execution. This allows Java programs to run on any machine that has a JVM, ensuring portability.

        */

    //  Q.6 all data type :one print 

    //Primitive Data Types
    //byte, short, int, long, float, double, boolean, char

    boolean a = true; //boolean

    System.out.println(a);

    char ch = 'v'; //Char
    System.out.println(ch);

    byte b = 3;  //byte
    System.out.println(b);

    short num = 34; //short
    System.out.println(num);

    int number = 432; //int
    System.out.println(number);

    long num2 = 2434L; //long
    System.out.println(num2);

    float f = 34.23f;  //float
    System.out.println(f);

    double dd = 34.23; //double
    System.out.println(dd);












    }
}