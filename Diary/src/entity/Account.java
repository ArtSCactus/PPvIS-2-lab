package entity;

import java.util.Objects;

public class Account {
    private String id;
    private String name;
    private String mailbox;
    private String password;
    private Note note;

    public Account(String id, String name, String mailbox, String password) {
        this.id = id;
        this.name = name;
        this.mailbox = mailbox;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getId(), account.getId()) &&
                Objects.equals(getName(), account.getName()) &&
                Objects.equals(getMailbox(), account.getMailbox()) &&
                Objects.equals(getPassword(), account.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMailbox(), getPassword());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mailbox='" + mailbox + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
