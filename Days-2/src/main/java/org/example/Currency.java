package org.example;

public class Currency {

    private String CurrencyName;
    private String ForexBuying;
    private String ForexSelling;
    private String BanknoteBuying;
    private String BanknoteSelling;

    public Currency(String currencyName, String forexBuying, String forexSelling, String banknoteBuying, String banknoteSelling) {
        CurrencyName = currencyName;
        ForexBuying = forexBuying;
        ForexSelling = forexSelling;
        BanknoteBuying = banknoteBuying;
        BanknoteSelling = banknoteSelling;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        CurrencyName = currencyName;
    }

    public String getForexBuying() {
        return ForexBuying;
    }

    public void setForexBuying(String forexBuying) {
        ForexBuying = forexBuying;
    }

    public String getForexSelling() {
        return ForexSelling;
    }

    public void setForexSelling(String forexSelling) {
        ForexSelling = forexSelling;
    }

    public String getBanknoteBuying() {
        return BanknoteBuying;
    }

    public void setBanknoteBuying(String banknoteBuying) {
        BanknoteBuying = banknoteBuying;
    }

    public String getBanknoteSelling() {
        return BanknoteSelling;
    }

    public void setBanknoteSelling(String banknoteSelling) {
        BanknoteSelling = banknoteSelling;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "CurrencyName='" + CurrencyName + '\'' +
                ", ForexBuying='" + ForexBuying + '\'' +
                ", ForexSelling='" + ForexSelling + '\'' +
                ", BanknoteBuying='" + BanknoteBuying + '\'' +
                ", BanknoteSelling='" + BanknoteSelling + '\'' +
                '}';
    }
}
