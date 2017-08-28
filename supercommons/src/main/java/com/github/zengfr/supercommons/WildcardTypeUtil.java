package com.zengfr.supercommons;
import org.apache.commons.lang3.reflect.TypeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WildcardTypeUtil{ 
public static java.lang.reflect.Type[] getImplicitLowerBounds(java.lang.reflect.WildcardType p0){
return TypeUtils.getImplicitLowerBounds(p0);
}
public static java.lang.reflect.Type[] getImplicitUpperBounds(java.lang.reflect.WildcardType p0){
return TypeUtils.getImplicitUpperBounds(p0);
}
}
