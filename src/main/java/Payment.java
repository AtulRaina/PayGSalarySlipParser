public class Payment {

    String payPeriod;
    String endPeriod;

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod.replace("-", "").trim();
    }

    String totalEarning;
    String netPay;
    String tax;
    String superanuation;

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(String totalEarning) {
        this.totalEarning = totalEarning.replace("$", "").replace(",", "");
    }

    public String getNetPay() {
        return netPay;
    }

    public void setNetPay(String netPay) {
        this.netPay = netPay.replace("$", "").replace(",", "");
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax.replace("$", "").replace(",", "");
    }

    public String getSuperanuation() {
        return superanuation;
    }

    public void setSuperanuation(String superanuation) {
        this.superanuation = superanuation.replace("$", "").replace(",", "");
    }

    public String PrintDetails() {
        return (this.payPeriod + "," + this.endPeriod + "," + this.totalEarning + "," + this.netPay + "," + this.tax + "," + this.superanuation + "\n");
    }
}
