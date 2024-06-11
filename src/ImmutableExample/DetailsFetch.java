package ImmutableExample;

public class DetailsFetch {

    private final String userName;
    private final int userID;
    private final Email email;
    private final int accountNumber;

    public DetailsFetch(String userName, int userID, String email, int accountNumber) {
        this.userName = userName;
        this.userID = userID;
        this.email = new Email(email);
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public Email getEmail() {
        return email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "DetailsFetch{" +
                "userName='" + userName + '\'' +
                ", userID=" + userID +
                ", email=" + email +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
