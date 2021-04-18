package external;

import java.util.Random;

public class Payee {
    private String payeeName;
    private String idap;
    private final String payerSuffix = ".com";

    public Payee(String payeeName){
        this.payeeName = payeeName;
    }

    public void setIdap(String idap) {
        this.idap = idap;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getIdap() {
        return idap;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public String getPayerSuffix() {
        return payerSuffix;
    }

    public void clacIdap(){
        Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        this.idap = "auto_" + num;
    }
}
