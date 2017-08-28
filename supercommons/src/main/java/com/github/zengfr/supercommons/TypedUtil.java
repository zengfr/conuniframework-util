package com.zengfr.supercommons;
import org.apache.commons.lang3.reflect.TypeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TypedUtil{ 
public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.reflect.Type p0){
return TypeUtils.wrap(p0);
}
public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.Class<T> p0){
return TypeUtils.wrap(p0);
}
}
