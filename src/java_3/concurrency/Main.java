package java_3.concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
        Sync syncThread1 = new Sync("sync thread");
        syncThread1.start();
        Sync syncThread2 = new Sync("sync thread");
        syncThread2.start();
        Sync syncThread3 = new Sync("sync thread");
        syncThread3.start();
        Sync syncThread4 = new Sync("sync thread");
        syncThread4.start();
        Sync syncThread5 = new Sync("sync thread");
        syncThread5.start();
        Sync syncThread6 = new Sync("sync thread");
        syncThread6.start();
        Team teamThread = new Team("Code-Killers");
        teamThread.run();
        System.out.println(syncThread1.getNums());  //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up here.
        /*
            -Create 5 sync threads
            -Allow the list of nums to be a shared resource amongst all of the threads.
            -Protect the List from thread interference using a thread blocking technique, such as synchronization or an Atomic data structure.
        */

        /*
            Kick off a Team Thread here.
            Set the name of the thead to be your agile team name.
        */

        //Reasoning threadStart = new Reasoning();
        //threadStart.start();

        Reasoning threadRun = new Reasoning();
        threadRun.run();

    }
}