public class FixPaymentWorker extends Worker{
    private int monthPayment;

    FixPaymentWorker(int id, String name, int monthPayment) {
        super(id, name);
        this.monthPayment = monthPayment;
    }

    @Override
    int getAveragePayment() {
        return monthPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " Оклад в рублях " + getAveragePayment();
    }
}


