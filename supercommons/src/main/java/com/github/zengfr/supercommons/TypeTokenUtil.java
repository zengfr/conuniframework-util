package com.github.zengfr.supercommons;
import com.google.common.reflect.TypeToken;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TypeTokenUtil{ 
public static com.google.common.reflect.TypeToken<?> of(java.lang.reflect.Type p0){
return TypeToken.of(p0);
}
public static <T> com.google.common.reflect.TypeToken<T> of(java.lang.Class<T> p0){
return TypeToken.of(p0);
}
}
