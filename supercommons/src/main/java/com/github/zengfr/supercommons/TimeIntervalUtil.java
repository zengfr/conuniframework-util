package com.zengfr.supercommons;
import com.facebook.util.TimeInterval;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TimeIntervalUtil{ 
public static com.facebook.util.TimeInterval withTypeAndLength(com.facebook.util.TimeIntervalType p0,int p1){
return TimeInterval.withTypeAndLength(p0,p1);
}
public static com.facebook.util.TimeInterval withMillis(long p0){
return TimeInterval.withMillis(p0);
}
}
