package com.github.zengfr.supercommons;
import com.google.common.cache.RemovalNotification;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RemovalNotificationUtil{ 
public static <K,V> com.google.common.cache.RemovalNotification<K, V> create(K p0,V p1,com.google.common.cache.RemovalCause p2){
return RemovalNotification.create(p0,p1,p2);
}
}
