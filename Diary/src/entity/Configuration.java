package entity;

import java.util.Objects;

public class Configuration {
    private Language language;
    private Account account;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Configuration)) return false;
        Configuration that = (Configuration) o;
        return getLanguage() == that.getLanguage() &&
                Objects.equals(getAccount(), that.getAccount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLanguage(), getAccount());
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "language=" + language +
                ", account=" + account +
                '}';
    }
}
