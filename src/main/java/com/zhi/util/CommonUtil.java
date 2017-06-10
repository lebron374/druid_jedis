package com.zhi.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lebron374 on 2017/6/7.
 */
public class CommonUtil {
    public static <T> List<T> copyBeanList(List<?> sourceObject, Class<T> targetClass) {
        List<T> destObject = new ArrayList<T>();
        try {
            for (Object s : sourceObject) {
                T t = targetClass.newInstance();
                BeanUtils.copyProperties(s, t);
                destObject.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return destObject;
    }
}
