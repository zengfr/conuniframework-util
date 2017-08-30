package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BeanIntrospectorUtil{ 
/**
*public static void org.apache.commons.beanutils.PropertyUtils.addBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector)
*/ 
public static void addBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
	 org.apache.commons.beanutils.PropertyUtils.addBeanIntrospector(p0);
}
/**
*public static boolean org.apache.commons.beanutils.PropertyUtils.removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector)
*/ 
public static boolean removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
	return org.apache.commons.beanutils.PropertyUtils.removeBeanIntrospector(p0);
}
}
