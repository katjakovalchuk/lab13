package lab13.lab13.src.main.Task3;

@Setter
@Getter
public class Company {
    private String name;
    private String description;
    private String logo;

    public Company(String name, String description, String logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }

    public Company() {
    }
}
