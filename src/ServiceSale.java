public class ServiceSale extends AbstractSale {
    // Formula: For the repair services: Total sales = Price per hour * Number of hours = ₱50.0 * 5 = ₱250.0
    @Override
    void calculateTotal(){
        double feePerHour;
        double serviceNumberOfHours;
        double totalSales;

        totalSales = feePerHour * serviceNumberOfHours;
    };
}
