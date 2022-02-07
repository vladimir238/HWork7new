public class PerHourPaymentWorker extends Worker{
    static final int WORKING_HOURS_IN_MONTH = 8 * 21;

    private int hourPayment;

    PerHourPaymentWorker(int id, String name, int hourPayment) {
        super(id, name);
        this.hourPayment = hourPayment;
    }


    @Override
    int getAveragePayment() {
        return hourPayment * WORKING_HOURS_IN_MONTH;
    }

    @Override
    public String toString() {
        return super.toString() + " Почасовая оплата " + getAveragePayment();
    }
}
