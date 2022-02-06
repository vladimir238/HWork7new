public class WorkPayment {
    public static void main(String[] args) {

        PerHourPaymentWorker[] workers = new PerHourPaymentWorker[10];
        FixPaymentWorker[] workers1 = new FixPaymentWorker[10];


        workers[0] = new PerHourPaymentWorker(345, "Перепелкин С.Ю.", 120);
        workers[1] = (new PerHourPaymentWorker(544, "Крокодилова Э.С.", 100));
        workers[2] = (new PerHourPaymentWorker(125, "Жирафов К.Г.", 130));
        workers[3] = (new PerHourPaymentWorker(447, "Коровин С.С.", 90));


        workers1[0] = new FixPaymentWorker(456, "Коростылев Н.С.", 25000);
        workers1[1] = new FixPaymentWorker(759, "Сечин Б.Ф.", 10000);
        workers1[2] = new FixPaymentWorker(124, "Чеботарев Р.Г.", 4500);
        workers1[3] = new FixPaymentWorker(378, "Черемисин Ж.В.", 35000);
        int drt = workers[0].getId();
        System.out.println("Номер  " + drt);
        System.out.println("Почасовая оплата ");
        for (Worker w : workers) {
            if (w != null) System.out.println(w);
        }
        System.out.println("Оклад  ");
        for (Worker w : workers1) {
            if (w != null) System.out.println(w);
        }
    }
}
