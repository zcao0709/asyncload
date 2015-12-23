package com.agapple.asyncload;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.springframework.util.ReflectionUtils;

/**
 * 提供常见的测试方法
 * 
 * @author jianghang 2011-1-30 上午11:15:54
 */
public class TestUtils {

    /**
     * 获取对应属性的值
     * 
     * @param obj
     * @param fieldName
     * @return
     */
    public static Object getField(Object obj, String fieldName) {
        Field field = ReflectionUtils.findField(obj.getClass(), fieldName);
        ReflectionUtils.makeAccessible(field);
        return ReflectionUtils.getField(field, obj);
    }

    /**
     * 设置对应参数的值
     * 
     * @param target
     * @param methodName
     * @param args
     * @return
     * @throws Exception
     */
    public static void setField(Object target, String fieldName, Object args) throws Exception {
        // 查找对应的方法
        Field field = ReflectionUtils.findField(target.getClass(), fieldName);
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, target, args);
    }

    /**
     * 调用方法，可以是一些私有方法
     * 
     * @param target
     * @param methodName
     * @param args
     * @return
     * @throws Exception
     */
    public static Object invokeMethod(Object target, String methodName, Object... args) throws Exception {
        Method method = null;
        // 查找对应的方法
        if (args == null || args.length == 0) {
            method = ReflectionUtils.findMethod(target.getClass(), methodName);
        } else {
            Class[] argsClass = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                argsClass[i] = args[i].getClass();
            }
            method = ReflectionUtils.findMethod(target.getClass(), methodName, argsClass);
        }
        ReflectionUtils.makeAccessible(method);

        if (args == null || args.length == 0) {
            return ReflectionUtils.invokeMethod(method, target);
        } else {
            return ReflectionUtils.invokeMethod(method, target, args);
        }
    }
}
