package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.PropertyUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BeanIntrospectorUtil{ 
public static boolean removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
return PropertyUtils.removeBeanIntrospector(p0);
}
public static void addBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
 PropertyUtils.addBeanIntrospector(p0);
}
}
