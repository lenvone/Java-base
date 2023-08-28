package com.adam.base.task.Movie01;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/18
 */
public class User {
    private String username;
    private String phone;
    private String password;
    private int role = 0;   // 1管理员  // 2普通用户

    public User(String username, String phone, String password, int role){
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.role = role;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString(){
        return "用户名称："+username+"\t用户电话："+phone+"\t用户密码："+password+"\t：";
    }


}