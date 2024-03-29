package pojo;

public class User {

    private Integer userId;
    private String userAccount;
    private String password;
    private String userName;
    private String role;    // 角色

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getUserId() {

        return userId;

    }

    public void setUserId(Integer userId) {

        this.userId = userId;

    }

    public String getUserAccount() {

        return userAccount;

    }

    public void setUserAccount(String userAccount) {

        this.userAccount = userAccount;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public String getUserName() {

        return userName;

    }

    public void setUserName(String userName) {

        this.userName = userName;

    }

}

