package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.PropertyUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertyDescriptorArrayUtil{ 
public static java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0){
return PropertyUtils.getPropertyDescriptors(p0);
}
public static java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Class<?> p0){
return PropertyUtils.getPropertyDescriptors(p0);
}
}
