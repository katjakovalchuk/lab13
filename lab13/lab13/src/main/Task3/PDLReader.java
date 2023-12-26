package lab13.lab13.src.main.Task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PDLReader {
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
