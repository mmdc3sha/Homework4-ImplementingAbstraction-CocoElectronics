package CocoElectronics;

abstract class AbstractSale extends CocoSalesCalculator {
    public AbstractSale(String phoneName, double phonePrice, int quantitySold, String serviceName, double feePerHour, double serviceHours) {
        super(phoneName, phonePrice, quantitySold, serviceName, feePerHour, serviceHours);
    }

    // Abstract methods to be implemented in a concrete subclass
    abstract void calculateTotal();

    abstract String getPhoneName();
    abstract double getPhonePrice();
    abstract double getFeePerHour();
    abstract double getServiceHours();
    abstract int getQuantitySold();
    abstract String getServiceName();

    abstract void setFeePerHour(double feePerHour);
    abstract void setPhoneName(String phoneName);
    abstract void setPhonePrice(double phonePrice);
    abstract void setQuantitySold(int quantitySold);
    abstract void setServiceHours(double serviceHours);
    abstract void setServiceName(String serviceName);
}
