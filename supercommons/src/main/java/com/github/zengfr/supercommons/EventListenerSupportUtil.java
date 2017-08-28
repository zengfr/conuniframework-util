package com.github.zengfr.supercommons;
import org.apache.commons.lang3.event.EventListenerSupport;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EventListenerSupportUtil{ 
public static <T> org.apache.commons.lang3.event.EventListenerSupport<T> create(java.lang.Class<T> p0){
return EventListenerSupport.create(p0);
}
}
