package com.adam.base.task.Movie;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/18
 */
public class MoviesTheater {

    private static String name = "【开发喵影院】";

    private static Scanner sc = new Scanner(System.in);

    private static Movie[] movies = new Movie[20];   //电影
    private  static User[] users = new User[30];     // 用户

    static int movieCount = 0;
    static int userCount = 0;

    // 登录用户
    private static User loginUser;

   static {
        Movie movie = new Movie("AA", 29.9, "11", 20201111);
        movies[movieCount ++] = movie;
        movie = new Movie("AB", 39.9, "12", 20211212);
        movies[movieCount ++] = movie;
        movie = new Movie("AC", 49.9, "13", 20220222);
        movies[movieCount ++] = movie;
        movie = new Movie("AD", 59.9, "14", 20230323);
        movies[movieCount ++] = movie;

        User user = new User("aa", "111111", "111111", 1);
        users[userCount ++] = user;
        user = new User("ab", "222222", "222222", 1);
        users[userCount ++] = user;
        user = new User("ac", "333333", "333333", 2);
        users[userCount ++] = user;
        user = new User("ad", "444444", "444444", 2);
        users[userCount ++] = user;

    }

    public MoviesTheater(Movie[] movies, User[] users){
        this.movies = movies;
        this.users = users;
    }

    public static void start() {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("请选择功能：");
        System.out.println("1. 查询电影信息");
        System.out.println("2. 显示所有电影信息");
        System.out.println("3. 管理员登录");
        System.out.println("4. 用户登录");
        System.out.println("5. 用户注册");
        System.out.println("0. 退出系统");
        System.out.println("请输入:");

        int menu = sc.nextInt();
        selectMenu(menu);
    }

    public static void selectMenu(int menu) {
        switch (menu) {
            case 1 -> searchMoive();  //查询电影信息
            case 2 -> showMovie();  // 显示所有电影信息 (按照降序显示)
            case 3 -> adminLogin();   // 管理员登录
            case 4 -> userLogin();   // 用户登录
            case 5 -> UserRegistration();   // 用户注册
            case 0 -> exit();
        }
        showMenu();
    }

    //  查询电影信息
    public static void searchMoive() {
        System.out.println("请输入你要查询的电影名称：");
        String name = sc.next();

        Movie movie = queryMovie(name);
        if (movie == null){
            System.out.println("暂无此电影");
        }else System.out.println(movie.info());

    }
    public static Movie queryMovie(String name){
        for (int i = 0; i < movieCount; i++) {
            if (name.equals(movies[i].getName())){
                return movies[i];
            }
        }
        return null;
    }

    // 显示所有电影信息 (按照降序显示)
    public static void showMovie() {
        if (movieCount == 0) {
            System.out.println("目前没有电影放映!");
        } else {
            for (int i = 0; i < movieCount-1; i++) {
                for (int  j = 0; j < movieCount-i-1; j++) {
                    if (movies[j].getDate() < movies[j+1].getDate()){
                        Movie movie = movies[j];
                        movies[j] = movies[j+1];
                        movies[j+1] = movie;
                    }
                }
            }
            for (int i = 0; i < movieCount; i++) {
                System.out.println(movies[i]);
            }
        }
    }

    //  管理员登录
    public static void adminLogin() {
        System.out.println("请输入手机号码：");
        String phone = sc.next();
        System.out.println("请输入用户密码：");
        String password = sc.next();

        AdminLogin(phone,password);
        AdminMenu();
    }
    // 用户登录
    public static void userLogin() {
        System.out.print("请输入手机号码：");
        String phone = sc.next();
        System.out.print("请输入用户密码：");
        String password = sc.next();
        System.out.println("请选择用户身份（1. 管理员 2. 普通用户）：");
        int role = sc.nextInt();

//        isAdmin(phone,password);
        UserLogin(phone,password);
        UserMenu();
    }

    //  管理员登录可以看到如下功能列表
    public static void AdminMenu() {
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影");
        System.out.println("3. 修改电影");
        System.out.println("4. 查看所有用户信息");
        System.out.println("0. 退出");

        int adminNum = sc.nextInt();
        adminMenu(adminNum);
    }
    public static void adminMenu(int adminNum){
        AdminMenu();
        System.out.println("请选择功能：");

        switch (adminNum) {
            case 1 -> addMovie();  // 添加电影
            case 2 -> deleteMovie(); // 删除电影 (输入电影名称，删除对应电影)
            case 3 -> renameMovie(); // 修改电影（输入电影名称，展示电影信息，选择要修改的内容（价格/上映时间），输入内容，修改已存储的电影信息）
            case 4 -> showUser(); //  查看所有用户信息
            case 0 -> exit();
        }
    }

    // 添加电影
    public static void addMovie() {

        System.out.println("请输入电影名称：");
        String movieName = sc.next();
        System.out.println("请输入影票售价：");
        Double moviePrice = sc.nextDouble();
        System.out.println("请输入影片导演：");
        String movieDirector = sc.next();
        System.out.println("请输入上映时间：");
        int movieDate = sc.nextInt();

        Movie movie = new Movie(movieName, moviePrice, movieDirector, movieDate);
        movies[movieCount ++] = movie;
    }

    // 删除电影
    public static void deleteMovie() {
        showMovie();
        System.out.println("请输入要删除的电影名称");
        String movieName = sc.next();

        if (movieName==null){
            System.out.println("未找到该电影");
        }
        for (int i = 0; i < movieCount; i++) {
            if (movieName.equals(movies[i].getName())){
                movies[--movieCount] = null;
            }
        }
    }

    // 修改电影
    public static void renameMovie() {

    }

    // 查看所有用户信息
    private static void showUser() {
        if (userCount == 0) {
            System.out.println("目前没有用户信息！");
        } else {
            for (int i = 0; i < userCount; i++) {
                System.out.println(i + 1 + ". " + users[i].toString());
            }
        }
    }

    // 用户注册
    public static void UserRegistration() {
        System.out.println("请输入用户手机号：");
        String phone = sc.next();
        System.out.println("请输入用户昵称：");
        String username = sc.next();
        System.out.println("请输入用户密码：");
        String password = sc.next();

        User user = new User(username,phone,password,1);

//        isAdmin(phone,password);
        addUser(user);
    }
    //  添加用户
        public static boolean addUser(User user){

        if (userCount == users.length){
            User[] users1 = new User[users.length];
            System.arraycopy(users,0,users1,0,users.length);

        }
        return true;
    }

    // 用户登录之后可看到如下功能列表：
    public static void UserMenu() {
        System.out.println("1. 修改用户信息");
        System.out.println("2. 查询用户信息");
        System.out.println("0. 退出");

        System.out.println("请选择功能：");
        int userNum = sc.nextInt();
    }

    public static void userMenu(int userNum){
        UserMenu();
        switch (userNum) {
            case 1 -> renameUser();  // 修改用户信息
            case 2 -> showUser();  // 查询用户信息
            case 3 -> showMovie();  // 显示所有电影
            case 4 -> selectMoive(); // 选择要购买的电影票，存储到 movies 字段
            case 0 -> exit();
        }
    }
    // 修改用户信息
    public static void renameUser() {

    }
    //  选择要购买的电影票，存储到 movies 字段
    public static void selectMoive(){

    }

    // 退出
    private static void exit() {
        System.exit(0);
        System.out.println("欢迎下次光临");
    }

//    public static boolean isAdmin(String phone, String password) {
//        if (loginUser.getRole() == true) {
//            // 管理员
//            userLogin(phone, password);
//        } else if (loginUser.getRole() == false) {
//            // 普通用户
//            userLogin(phone, password);
//        }
//        return false;
//    }
    public static void AdminLogin(String phone, String password) {
        for (int i = 0; i < userCount; i++) {
            loginUser = users[i];
            if ((phone.equals(users[i].getPhone()) &&
                    password.equals(users[i].getPassword())
                    && loginUser.getRole() == 1)) {
                // 管理员登录
                System.out.println("登录成功");
                AdminMenu();
            }else {
                // 非管理员直接退出返回主菜单
                System.out.println("登录失败！请重新登录");
                showMenu();
                return;
            }
        }
    }
    public static void UserLogin(String phone, String password){
        for (int i = 0; i < userCount; i++) {
            loginUser = users[i];
            if (!(phone.equals(users[i].getPhone()) &&
                    password.equals(users[i].getPassword())
                    && loginUser.getRole() == 2)) {
                // 用户登录
                System.out.println("登录成功");
                UserMenu();
            }else {
                // 非用户直接退出返回主菜单
                System.out.println("登录失败！请重新登录");
                showMenu();
                return;
            }
        }

    }    // 查找用户
    public static User searchUser(String userName){
        if (userName==null){
            return null;
        }
        for (int i = 0; i < movieCount; i++) {
            if (userName.equals(users[i].getUsername())){
                return users[i];
            }
        }
        return null;
    }

}

