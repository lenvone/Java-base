package com.adam.base.practice.Movie02;

/**
 * 用户类
 */
public class User {

    private String phone;

    private String password;

    private String username;

    private Boolean admin;

    // 电影票
    private Ticket[] tickets;

    private int ticketCount;

    {
        tickets = new Ticket[10];
    }

    public User() {
    }

    public User(String phone, String password, String username) {
        this(phone, password, username, false);
    }

    public User(String phone, String password, String username, Boolean admin) {
        this.phone = phone;
        this.password = password;
        this.username = username;
        this.admin = admin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }


    public void addTicket(Ticket ticket){
        // 考虑扩容
        this.tickets[ticketCount ++] = ticket;
    }

    public void showTickets(){
        System.out.println("序号 \t  电影名称    \t 上映时间   \t 数量");
        for (int i = 0; i < ticketCount; i++) {
            System.out.println(i + 1 + " \t " + tickets[i].info());
        }
    }


    public String info() {
        String role = admin? "管理员" : " 用户 ";
        return role + " \t " + phone  +
                " \t " + "******" +
                " \t " + username;
    }

    @Override
    public String toString() {
        return "手机号 '" + phone + '\'' +
                ", 密码 ******  " +
                ", 用户名 '" + username + '\'';
    }
}
