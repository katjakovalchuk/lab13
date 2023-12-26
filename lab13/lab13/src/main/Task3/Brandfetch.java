package lab13.lab13.src.main.Task3;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Brandfetch {
    public static Company extractCompanyInfo() {
        Company company = new Company();

        String companyName = "Brandfetch";
        String companyDescription = "OOP the best subject!!!";
        String companyLogo = "https://OOP//IS//THE//BEST";

        company.setName(companyName);
        company.setDescription(companyDescription);
        company.setLogo(companyLogo);

        return company;
    }
}