package ImmutableExample;

public class Email {
    public String email = "example@domain.com";
    public Email(String email) {
        this.email=email;
        System.out.println(email);
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                '}';
    }
}
