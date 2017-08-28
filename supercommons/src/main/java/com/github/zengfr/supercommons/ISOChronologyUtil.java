package com.github.zengfr.supercommons;
import com.facebook.util.TimeUtil;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ISOChronologyUtil{ 
public static org.joda.time.chrono.ISOChronology getChronology(java.lang.String p0){
return TimeUtil.getChronology(p0);
}
}
