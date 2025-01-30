package CocoElectronics;

abstract class CocoSalesCalculator {
    protected String phoneName;
    protected double phonePrice;
    protected int quantitySold;
    protected String serviceName;
    protected double feePerHour;
    protected double serviceHours;

    public CocoSalesCalculator(String phoneName, double phonePrice, int quantitySold, String serviceName, double feePerHour, double serviceHours) {
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
        this.quantitySold = quantitySold;
        this.serviceName = serviceName;
        this.feePerHour = feePerHour;
        this.serviceHours = serviceHours;
    }
}
