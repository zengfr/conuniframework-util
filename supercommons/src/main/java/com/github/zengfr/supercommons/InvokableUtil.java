package com.github.zengfr.supercommons;
import com.google.common.reflect.Invokable;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InvokableUtil{ 
public static <T> com.google.common.reflect.Invokable<T, T> from(java.lang.reflect.Constructor<T> p0){
return Invokable.from(p0);
}
public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method p0){
return Invokable.from(p0);
}
}
