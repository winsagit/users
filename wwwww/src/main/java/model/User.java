package model;


/**
 * Created by student on 27.10.2017.
 */
public class User  {
    private Long id;
    private String login;
    private String pass;

    public User() {
    }

    public User(Long id, String login, String pass) {
        this.id = id;
        this.login = login;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

