package lab13.lab13.src.main.java.ua.edu.ucu.apps.Task1;

public class Main {
    public static void main(String[] args) {
        BazaDanyh db = new BazaDanyh();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
