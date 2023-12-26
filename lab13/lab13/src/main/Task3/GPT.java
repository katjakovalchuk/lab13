package lab13.lab13.src.main.Task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GPT {
    public static Company extractCompanyInfo() {
        Company company = new Company();
        String companyName = "PDL";
        String companyDescription = "OOP IS THE BEST";
        String companyLogo = "https://OOP//IS//THE//BEST";

        company.setName(companyName);
        company.setDescription(companyDescription);
        company.setLogo(companyLogo);

        return company;
    }

}