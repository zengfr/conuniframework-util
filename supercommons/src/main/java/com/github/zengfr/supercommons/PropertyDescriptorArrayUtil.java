package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertyDescriptorArrayUtil{ 
/**
*public static java.beans.PropertyDescriptor[] org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(java.lang.Object)
*/ 
public static java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0){
	return org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(p0);
}
/**
*public static java.beans.PropertyDescriptor[] org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(java.lang.Class<?>)
*/ 
public static java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Class<?> p0){
	return org.apache.commons.beanutils.PropertyUtils.getPropertyDescriptors(p0);
}
}
