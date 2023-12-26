package lab13.lab13.src.main.Task3;

public class Main {

    public static Company getCompanyInfo() {
        Company company = new Company();
        PDLReader pdlReader = new PDLReader();
        Company pdlCompanyInfo = pdlReader.extractCompanyInfo();

        GPT gpt = new GPT();
        Company gptCompanyInfo = gpt.extractCompanyInfo();

        Brandfetch brandfetch = new Brandfetch();
        Company brandfetchCompanyInfo = brandfetch.extractCompanyInfo();

        return company;
    }

    public static void main(String[] args) {
        Company companyInfo = getCompanyInfo();

        System.out.println(companyInfo.getName());
        System.out.println(companyInfo.getDescription());
        System.out.println(companyInfo.getLogo());
    }
}
