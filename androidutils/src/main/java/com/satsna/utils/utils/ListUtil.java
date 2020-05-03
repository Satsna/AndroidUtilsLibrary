package com.satsna.utils.utils;

import java.util.List;

public class ListUtil {

    /**
     * 判断list集合是否为空
     * @param list
     * @return
     */
    public static boolean isEmpty(List list){
        if(list==null||list.size()==0){
            return true;
        }
        return false;
    }
}
