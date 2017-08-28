package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConcurrentMapUtil{ 
public static <K,V> java.util.concurrent.ConcurrentMap<K, V> newConcurrentMap(){
return Maps.newConcurrentMap();
}
}
