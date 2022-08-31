package entity;

import java.util.Date;

public class User {
    private int id;
    private String userName;
    private String nationalCode;
    private Date birthday;
    private String password;

    public User(int id, String userName, String nationalCode, Date birthday, String password) {
        this.id = id;
        this.userName = userName;
        this.nationalCode = nationalCode;
        this.birthday = birthday;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
