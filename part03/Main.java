package main;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 【B站】人人都是程序员
 * @author 【掘金】人人都是程序员
 * @author 【CSDN】人人都是程序员
 * @author 【今日头条】人人都是程序员
 * @author 【官方网站】www.gorhaf.com
 * @author 【微信公众号】gorhaf
 * 欢迎大家扫描下方二维码关注我们
 * █▀▀▀▀▀▀▀██▀██████▀▀▀▀██▀▀▀▀▀▀▀█
 * █ █▀▀▀█ █▄ ▀ ▄▄█▄█▄█▀██ █▀▀▀█ █
 * █ █   █ █▄▄▀▄▀█▄▄ ██▀ █ █   █ █
 * █ ▀▀▀▀▀ █ █ █▀▄▀▄ █ █ █ ▀▀▀▀▀ █
 * █▀▀▀▀▀█▀▀▀▀▀█ █▀▄▀▀█ ▄▀█▀█▀█▀██
 * █▄▄▄ ██▀█  █▀▀ ▀  ▄ ▄▀▄   ███▄█
 * ██  ▀▀█▀ ▄ ▄ █▀▄▄▄▀▄▀▄ ▄██▀▀▄██
 * █ █▄▄  ▀ █ ▄█▄▄▄▀▄▀█▄ ▄ ▄ █ █▄█
 * █  ▄██▄▀██▄ █ ▀▄▀ ▀▀ ▄▄▄▀██▀▄██
 * █ █▀▀█▀▀█▀ █▀▀█▄▀▀█▀▄ ▀▄    █▄█
 * █ █▀▀██▀▀█▀  █▀▀  ██▄▀▀▀▀▀█▀ ▀█
 * █▀▀▀▀▀▀▀█ ▄██▄▄▀▀▀▄▄▀ █▀█   ▄▄█
 * █ █▀▀▀█ █▀ ▄█ █▀ ▄▀▄▄ ▀▀▀  ▀▀ █
 * █ █   █ █ ▄▀▀▀█▄ ▄▀▄▀ █▀▀▀ ▀ ▄█
 * █ ▀▀▀▀▀ █ ▀█ ▀█▄  █▄█▄▄█  ▄▀▄██
 * ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
 */
public class Main {

    public static void main(String[] args) {
        // 数字集合
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        // 删除数字 3
        System.out.println(numbers.remove(3));
        // 删除数字 6
        System.out.println(numbers.remove(6));
        // 遍历集合
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}