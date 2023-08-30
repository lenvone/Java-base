package com.adam.base.Task.Task0802;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/2
 */
public class Task080205 {
    public static void main(String[] args) {
        /*
        根据用户输入的月份和日期，输出该日期所在的星座。
        水瓶座（1月20日到2月18日）双鱼座（2月19日到3月20日）白羊座（3月21日到4月19日）
        金牛座（4月20日到5月20日）双子座（5月21日到6月20日）巨蟹座（6月21日到7月22日）
        狮子座（7月23日到8月22日）处女座（8月23日到9月22日）天秤座（9月23日到10月22日）
        天蝎座（10月23日到11月21日）射手座（11月22日到12月21日）魔羯座（12月22日到1月19日）
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int season = sc.nextInt();

        System.out.println("请输入日期");
        int day = sc.nextInt();
        String hor = switch (season){
            case 1 ->{
                if (day < 20){yield "魔羯座";}
                else{yield "水瓶座";}
            }
            case 2 ->{
                if (day < 19){yield "水瓶座";}
                else{yield "双鱼座";}
            }
            case 3 ->{
                if (day < 21){yield "双鱼座";}
                else{yield "白羊座";}
            }
            case 4 ->{
                if (day < 20){yield "白羊座";}
                else{yield "金牛座";}
            }
            case 5 ->{
                if (day < 21){yield "金牛座";}
                else{yield "双子座";}
            }
            case 6 ->{
                if (day < 21){yield "双子座";}
                else{yield "巨蟹座";}
            }
            case 7 ->{
                if (day < 23){yield "巨蟹座";}
                else{yield "狮子座";}
            }
            case 8 ->{
                if (day < 23){yield "狮子座";}
                else{yield "处女座";}
            }
            case 9 ->{
                if (day < 23){yield "处女座";}
                else{yield "天秤座";}
            }
            case 10 ->{
                if (day < 23){yield "天秤座";}
                else{yield "天蝎座";}
            }
            case 11 ->{
                if (day < 22){yield "天蝎座";}
                else{yield "射手座";}
            }
            case 12 ->{
                if (day < 22){yield "射手座";}
                else{yield "魔羯座";}
            }
            default -> {yield  "输入错误";}
        };
        System.out.println("星座是:" + hor);
    }
}
