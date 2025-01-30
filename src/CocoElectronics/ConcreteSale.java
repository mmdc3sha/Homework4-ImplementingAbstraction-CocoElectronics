package CocoElectronics;
public class ConcreteSale extends AbstractSale {
    public ConcreteSale(String phoneName, double phonePrice, int quantitySold, String serviceName, double feePerHour, int serviceHours) {
        super(phoneName, phonePrice, quantitySold, serviceName, feePerHour, serviceHours);
    }

    @Override
    void calculateTotal() {
        double totalSale = (phonePrice * quantitySold) + (feePerHour * serviceHours);
    }

    @Override
    public String getPhoneName() {
        return phoneName;
    }

    @Override
    public double getPhonePrice() {
        return phonePrice;
    }

    @Override
    public double getFeePerHour() {
        return feePerHour;
    }

    @Override
    public double getServiceHours() {
        return serviceHours;
    }

    @Override
    public int getQuantitySold() {
        return quantitySold;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public void setFeePerHour(double feePerHour) {
        this.feePerHour = feePerHour;
    }

    @Override
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    @Override
    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public void setServiceHours(double serviceHours) {
        this.serviceHours = serviceHours;
    }

    @Override
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;

    }
}