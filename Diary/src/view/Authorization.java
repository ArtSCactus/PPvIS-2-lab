package view;

import util.Authorizer;

public class Authorization {
    private boolean isAuthorized;

    private void isAuthorized() {

    }

    public void setLanguage() {
        Authorizer authorizer = new Authorizer();
        authorizer.setLanguage();
    }

    public void signIn() {
        String name= "";
        String password = "";
        String arg="";
        Authorizer authorizer = new Authorizer();
        authorizer.setAccountForApplication(name, password, arg);
    }

    public void signUp() {
        String name= "";
        String password = "";
        String arg="";
        Authorizer authorizer = new Authorizer();
        authorizer.createAccount(name, password, arg);
        authorizer.setAccountForApplication(name, password, arg);
    }

    public void skipAuthorization() {

    }

    public void refreshAccountData() {
        Authorizer authorizer = new Authorizer();
        authorizer.refreshAccountData();
    }
}
