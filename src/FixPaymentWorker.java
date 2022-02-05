
import java.text.NumberFormat;
import java.util.Locale;


public class FixPaymentWorker extends Worker{
    private int monthPayment;

    FixPaymentWorker(int id, String name, int monthPayment) {
        super(id, name);
        this.monthPayment = monthPayment;
    }

    @Override
    double getAveragePayment() {
        return monthPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " Оклад в рублях " + getAveragePayment();
    }
}


