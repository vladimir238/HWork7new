import java.util.*;



public class WorkPayment {
    public static void main(String[] args) {
        int id = 0;
        PerHourPaymentWorker[] workers = new PerHourPaymentWorker[10];
        FixPaymentWorker[] workers1 = new FixPaymentWorker[10];


        workers[0] = new PerHourPaymentWorker(++id, "Перепелкин С.Ю.", 120);
        workers[1] = (new PerHourPaymentWorker(++id, "Крокодилова Э.С.", 100));
        workers[2] = (new PerHourPaymentWorker(++id, "Жирафов К.Г.", 130));
        workers[3] = (new PerHourPaymentWorker(++id, "Коровин С.С.", 90));


        workers1[0] = new FixPaymentWorker(++id, "Коростылев Н.С.", 25000);
        workers1[1] = new FixPaymentWorker(++id, "Сечин Б.Ф.", 10000);
        workers1[2] = new FixPaymentWorker(++id, "Чеботарев Р.Г.", 4500);
        workers1[3] = new FixPaymentWorker(++id, "Черемисин Ж.В.", 35000);


        for (Worker w : workers) {
            if (w != null) System.out.println(w);
        }
        for (Worker w : workers1) {
            if (w != null) System.out.println(w);
        }
    }
}
