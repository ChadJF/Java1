package java_3.concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. Reasoning should be created by inheriting from the Thread class.

    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
        System.out.println("A process is a program in execution, and a thread is part of that running process.");
        System.out.println("Invoking the start method will invoke both the run and the start methods, while invoking the run method will only run the run method.");

    }

    @Override
    public void run(){
        distinguish();
        super.run();
    }

    @Override
    public void start(){
        distinguish();
        super.start();
    }
}

