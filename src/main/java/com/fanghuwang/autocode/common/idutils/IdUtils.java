package com.fanghuwang.autocode.common.idutils;

import com.fanghuwang.autocode.common.RandomUtil;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 15:07
 **/
public class IdUtils {

    public static String getId(Prefix prefix){
        return prefix.getCode()+ RandomUtil.mixRandom(12);
    }

}
