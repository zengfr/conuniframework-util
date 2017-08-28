package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.PropertyUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FastHashMapUtil{ 
public static org.apache.commons.collections.FastHashMap getMappedPropertyDescriptors(java.lang.Class<?> p0){
return PropertyUtils.getMappedPropertyDescriptors(p0);
}
public static org.apache.commons.collections.FastHashMap getMappedPropertyDescriptors(java.lang.Object p0){
return PropertyUtils.getMappedPropertyDescriptors(p0);
}
}
