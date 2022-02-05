import java.text.NumberFormat;
import java.util.Locale;


public class PerHourPaymentWorker extends Worker{
    static final double WORKING_HOURS_IN_MONTH = 8.0 * 20.8;

    private int hourPayment;

    PerHourPaymentWorker(int id, String name, int hourPayment) {
        super(id, name);
        this.hourPayment = hourPayment;
    }

    @Override
    double getAveragePayment() {
        return hourPayment * WORKING_HOURS_IN_MONTH;
    }

    @Override
    public String toString() {
        return super.toString() + " Почасовая оплата " + getAveragePayment();
    }
}
