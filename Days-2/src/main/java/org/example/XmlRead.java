package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.util.*;

public class XmlRead {

    public Set<Currency> xml() {
        Set<Currency> set = new LinkedHashSet<>();
        List<Currency> currencies = new ArrayList<>();
        try {
            String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
            String stData = Jsoup.connect(url).timeout(30000).ignoreContentType(true).get().toString();
            Document doc = Jsoup.parse(stData, Parser.xmlParser());
            Elements elements = doc.getElementsByTag("Currency");
            for(Element item : elements) {
                String CurrencyName = item.getElementsByTag("CurrencyName").text();
                String ForexBuying = item.getElementsByTag("ForexBuying").text();
                String ForexSelling = item.getElementsByTag("ForexSelling").text();
                String BanknoteBuying = item.getElementsByTag("BanknoteBuying").text();
                String BanknoteSelling = item.getElementsByTag("BanknoteSelling").text();
                Currency currency = new Currency(CurrencyName, ForexBuying, ForexSelling, BanknoteBuying, BanknoteSelling);
                //currencies.add(currency);
                set.add(currency);
            }
        }catch (Exception ex) {
            System.err.println("xml error : " + ex);
        }
        return set;
    }

}
