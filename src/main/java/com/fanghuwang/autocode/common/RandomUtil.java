package com.fanghuwang.autocode.common;

import java.util.Date;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 15:23
 **/
public class RandomUtil {
    /**
     * [min,max] 之间的一个随机数
     *
     * @param min
     * @param max
     * @return
     */
    private static int intRandom(int min, int max) {
        // math.random 返回 [0,1) 左闭右开区间 所以 +1
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static String numberRandom(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int random = intRandom(0, 9);
            sb.append(random);
        }
        return sb.toString();
    }

    /**
     * 获得指定长度的一个随机数组成的字符串（含0开头的）
     *
     * @param length
     * @return
     * @throws IllegalArgumentException
     */
    public static String letterRandom(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + intRandom(0, 9)));
        }
        return sb.toString();
    }

    /**
     * 获得指定长度的一个随机数组成的字符串（小写字母 + 数字）
     *
     * @param length
     * @return
     */
    public static String mixRandom(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int random = intRandom(0, 35);
            if (random >= 26) {
                sb.append(35 - random);
            } else {
                sb.append((char) ('a' + random));
            }
        }
        return sb.toString();
    }

    /**
     * 随机获取ID 前缀+时间戳+随机数
     * @param prefix
     * @param timeStampLength
     * @param randomLength
     * @return
     */
    public static String timeStampRandom(String prefix, int timeStampLength, int randomLength) {
        if (timeStampLength > 13 || timeStampLength <= 0) {
            throw new IllegalArgumentException();
        }
        Date date = new Date();
        long time = date.getTime();
        String timeStr = Long.toString(time);
        timeStr = timeStr.substring(0, timeStampLength);
        return prefix + timeStr + numberRandom(randomLength);
    }
}
