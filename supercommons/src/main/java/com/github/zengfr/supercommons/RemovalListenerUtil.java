package com.github.zengfr.supercommons;
import com.google.common.cache.RemovalListeners;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RemovalListenerUtil{ 
public static <K,V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> p0,java.util.concurrent.Executor p1){
return RemovalListeners.asynchronous(p0,p1);
}
}
