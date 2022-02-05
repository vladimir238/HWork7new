import java.util.*;



public class WorkPayment {
    public static void main(String[] args) {
        int id = 0;

        Set<Worker> workers = new TreeSet<>(new Comparator<Worker>() {
            public int compare(Worker a, Worker b) {
                double diff = a.getAveragePayment() - b.getAveragePayment();
                if (diff > 0.0)
                    return -1;
                else if (diff < 0.0)
                    return 1;
                else {
                    int n = a.getName().compareTo(b.getName());
                    return (n == 0) ? 1 : n;
                }
            }
        });

        workers.add(new FixPaymentWorker(++id, "Петрович", 800));
        workers.add(new FixPaymentWorker(++id, "Семён", 2000));
        workers.add(new PerHourPaymentWorker(++id, "Снежана", 150));
        workers.add(new PerHourPaymentWorker(++id, "Элеонора", 100));
        workers.add(new FixPaymentWorker(++id, "Йохтан Палыч", 25000));

        for (Worker w : workers)
            System.out.println(w);
    }
}
