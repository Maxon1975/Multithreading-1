public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки...");
        Thread thread1 = new MyThread(mainGroup, "Stream 1");
        Thread thread2 = new MyThread(mainGroup, "Stream 2");
        Thread thread3 = new MyThread(mainGroup, "Stream 3");
        Thread thread4 = new MyThread(mainGroup, "Stream 4");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки...");
        mainGroup.interrupt();
    }
}
