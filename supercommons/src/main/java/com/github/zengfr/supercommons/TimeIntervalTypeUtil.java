package com.zengfr.supercommons;
import com.facebook.util.TimeInterval;
import com.facebook.util.TimeIntervalType;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TimeIntervalTypeUtil{ 
public static com.facebook.util.TimeInterval withTypeAndLength(com.facebook.util.TimeIntervalType p0,int p1){
return TimeInterval.withTypeAndLength(p0,p1);
}
public static com.facebook.util.TimeIntervalType valueOf(java.lang.String p0){
return TimeIntervalType.valueOf(p0);
}
}
