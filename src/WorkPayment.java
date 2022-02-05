import java.util.*;



public class WorkPayment {
    public static void main(String[] args) {
        int id = 0;
        PerHourPaymentWorker[] workers=new PerHourPaymentWorker[10];
        FixPaymentWorker[] workers1=new FixPaymentWorker[10];

//          Set<Worker> workers = new TreeSet<>(new Comparator<Worker>() {
//            public int compare(Worker a, Worker b) {
//                double diff = a.getAveragePayment() - b.getAveragePayment();
//                if (diff > 0)
//                    return -1;
//                else if (diff < 0)
//                    return 1;
//                else {
//                    int n = a.getName().compareTo(b.getName());
//                    return (n == 0) ? 1 : n;
//                }
//            }
//        });

//        workers[0].add(new FixPaymentWorker(++id, "Петрович", 800));
//        workers.add(new FixPaymentWorker(++id, "Семён", 2000));
       workers[0]=new PerHourPaymentWorker(++id, "Снежана", 150);
       workers[1]=(new PerHourPaymentWorker(++id, "Элеонора", 100));
       workers1[0]=new FixPaymentWorker(++id, "Йохтан Палыч", 25000);
        workers1[1]=new FixPaymentWorker(++id,"Чебурашкин",100);

        for (Worker w : workers)
            System.out.println(w);
        for (Worker w : workers1)
            System.out.println(w);
    }
}
