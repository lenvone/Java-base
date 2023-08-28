package com.adam.base.practice.Movie02;

import java.util.Scanner;

/**
 * 影院
 */
public class MovieTheater {

    private String name = "【开发喵影院】";

    // 用户列表
    private User[] userList = new User[10];

    private int userCount = 0;
    // 电影列表
    private Movie[] movieList = new Movie[10];
    private int movieCount = 0;


    // 登录用户
    private User loginUser;

    private Scanner input = new Scanner(System.in);

    {
        Movie movie = new Movie("前任4", 39.9, "田羽生", 20230928, 50);
        movieList[movieCount ++] = movie;
        movie = new Movie("哥斯拉", 29.9, "xxx", 20180911, 50);
        movieList[movieCount ++] = movie;
        movie = new Movie("金刚川", 49.9, "xxxx", 20200621, 50);
        movieList[movieCount ++] = movie;
        movie = new Movie("水门桥", 59.9, "xxxx", 20221001, 50);
        movieList[movieCount ++] = movie;

        // 普通用户
        User user = new User("13212312311", "123", "张三");
        userList[userCount ++] = user;

        // 管理员
        User admin = new User("13212312322", "123", "管理员", true);
        userList[userCount ++] = admin;

    }

    public MovieTheater() {
    }

    public MovieTheater(String name) {
        this.name = name;
    }

    public void open(){
        print("欢迎光临" + name);
        selectMainMenu();
    }


    public void selectMainMenu(){
        print("请选择要执行的操作：");
        print("1. 上映电影列表");
        print("2. 查询电影");
        print("3. 登录");
        print("4. 注册");
        print("5. 显示所有用户");// TODO(临时)
        print("0. 退出");
        print("请输入序号：");
        int select = input.nextInt();

        switch (select){
            case 1 -> showMoives();
            case 2 -> queryMoive();
            case 3 -> login();
            case 4 -> register();
            case 5 -> showAllUsers();
            case 0 -> exit();
        }

        selectMainMenu();
    }

    /**
     * 退出系统
     */
    private void exit() {
        print("欢迎下次光临！");
        System.exit(0);
    }

    /**
     * 注册
     */
    private void register() {
        print("请输入手机号：");
        String phone = input.next();

        int index = queryUserByPhone(phone);

        if (index != -1){
            // 手机号已注册
            print("手机号已注册");
            // TODO()

            return;}String password = null;
        String rePass = null;
        do{
            if (password != null){
                print("两次密码不一致");
            }
            print("请输入密码：");
            password = input.next();
            print("请再次输入密码：");
            rePass = input.next();
        }while (!password.equals(rePass));

        print("请输入用户名： ");
        String username = input.next();

        User user = new User(phone, password, username);
        addUser(user);
        print("注册成功");

        // TODO(临时代码)
        showAllUsers();
    }

    private void addUser(User user){
        userList[userCount ++] = user;
    }

    private void showAllUsers(){
        if (userCount == 0){
            print("暂无用户");
        } else {
            print("用户列表");

            print("序号 \t 角色   \t    手机号    \t  密码    \t 用户名   ");
            for (int i = 0; i < userCount; i++) {
                print(" " + (i + 1) + " " + " \t " + userList[i].info());
            }
        }

    }
    private int queryUserByPhone(String phone) {
        for (int i = 0; i < userCount; i++) {
            if (phone.equals(userList[i].getPhone())){
                return i;
            }
        }

        return -1;
    }

    /**
     * 登录
     */
    private void login() {
        print("请输入手机号：");
        String phone = input.next();
        print("请输入密码：");
        String password = input.next();

        int index = queryUserByPhoneAndPass(phone, password);

        if (index == -1){
            print("用户名或密码错误, 请重试");
        } else {
            print("登录成功");
            // 当前登录用户， 保存登录状态
            loginUser = userList[index];
            if (loginUser.getAdmin()){
                // 管理员
                showAdminMenu();
            } else {
                // 普通用户
                showUserMenu();
            }
        }
    }

    private void showUserMenu() {
        print("请输入序号：");
        print("1. 个人信息");
        print("2. 修改个人信息");
        print("3. 买电影票");
        print("4. 已购票查询");
        print("0. 注销");

        int select = input.nextInt();

        switch (select){
            case 1 -> personal();
            case 2 -> updateInfo();
            case 3 -> buyTicket();
            case 4 -> showTickets();
            case 0 -> logout();
        }

        showUserMenu();
    }

    private void showTickets() {
        loginUser.showTickets();
    }

    private void buyTicket() {
        showMoives();

        Movie movie = null;
        do {
            if (movie != null){
                print("请重新选择");
            }
            print("请选择要买的电影票：");
            int n = input.nextInt();

            movie = movieList[n - 1];

        } while(!(movie.getTicketCount() > 0));


        Integer count = null;
        do {
            if (count != null){
                print("输入错误");
            }
            print("请输入购买数量：");
            count = input.nextInt();
        } while(!(count > 0 && count <= movie.getTicketCount()));

        Ticket ticket = new Ticket(movie, count);
        double money = movie.getPrice() * count;
        print(count + "张" + movie.getName() + "票，共计 " + money + "元，请支付。");

        // 添加票
        loginUser.addTicket(ticket);

        // 变电影票数量
        movie.setTicketCount(movie.getTicketCount() - count);

        print("购票成功");
    }

    private void updateInfo() {
        print("请输入新的用户名");
        String username = input.next();
        loginUser.setUsername(username);

        print("修改成功");
    }

    private void personal() {
        print(loginUser);
    }

    private void logout() {
        loginUser = null;
        print("注销成功");
        selectMainMenu();
    }

    private void showAdminMenu() {
        print("请输入序号：");
        print("1. 添加电影");
        print("2. 删除电影");
        print("3. 修改电影信息");
        print("4. 显示用户信息");
        print("0. 注销");

        int select = input.nextInt();
        switch (select){
            case 1 -> addMovie();
            case 2 -> removeMovie();
            case 3 -> modifyMovie();
            case 4 -> showAllUsers();
            case 0 -> logout();
        }

        showAdminMenu();
    }

    private void removeMovie() {
        showMoives();
        print("请输入要删除的电影序号: ");
        int num = input.nextInt();

        removeMovie(num - 1);

        print("删除成功");
    }

    private void removeMovie(int index) {
        System.arraycopy(movieList, index + 1, movieList, index, movieList.length - index - 1);
        movieList[-- movieCount] = null;
    }


    private void modifyMovie() {
        print("修改电影信息");
    }

    private void addMovie() {
        print("输入电影名称：");
        String name = input.next();
        print("输入导演姓名：");
        String director = input.next();
        print("请输入上映时间(格式: 20230101)：");
        int date = input.nextInt();
        print("请输入票价：");
        double price = input.nextDouble();

        print("请输入数量： ");
        int count = input.nextInt();

        Movie movie = new Movie(name, price, director, date, count);

        addMovie(movie);

        print("添加成功");
    }

    public void addMovie(Movie movie){
        movieList[movieCount ++] = movie;
    }

    private int queryUserByPhoneAndPass(String phone, String password){
//        int index = queryUserByPhone(phone);
//        if (index == -1){
//            return index;
//        } else {
//            return userList[index].getPassword().equals(password)? index: -1;
//        }
        for (int i = 0; i < userCount; i++) {
            User user = userList[i];
            if (user.getPhone().equals(phone) && user.getPassword().equals(password)) {
                return i;
            }
        }
        return  -1;
    }

    /**
     * 查询电影
     */
    private void queryMoive() {
        print("输入电影名称: ");
        String name = input.next();

        int index = searchMoive(name);

        if (index == -1){
            print("暂无此电影");
        } else {
            print(movieList[index]);
        }
    }

    private int searchMoive(String name){
        for (int i = 0; i < movieCount; i++) {
            Movie movie = movieList[i];
            if (name.equals(movie.getName())){
                return i;
            }
        }
        return -1;
    }

    /**
     * 上映电影列表
     */
    private void showMoives() {
        if (movieCount == 0){
            print("暂无电影");
        } else {
            print("上映电影列表");
            // 排序
            sortMovieByDate();

            print("序号 \t 电影名 \t 导演 \t 上映时间 \t 价格  \t   数量");
            for (int i = 0; i < movieCount; i++) {
                print(" " + (i + 1) + " " + " \t " + movieList[i].info());
            }
        }
    }

    private void sortMovieByDate() {
        // 排序
        for (int i = 0; i < movieCount - 1; i++) {
            for (int j = 0; j < movieCount - i - 1; j++) {
                if (movieList[j].getDate() < movieList[j + 1].getDate()){
                    Movie temp = movieList[j];
                    movieList[j] = movieList[j + 1];
                    movieList[j + 1] = temp;
                }
            }
        }
    }


    public void print(Object msg){
        System.out.println(msg);
    }

    public String toString(){
        return name + "现有电影 " + movieCount + " 部， 用户 " + userCount + " 人";
    }
}
