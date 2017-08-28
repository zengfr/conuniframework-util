package com.github.zengfr.supercommons;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TickerUtil{ 
public static com.google.common.base.Stopwatch createStarted(com.google.common.base.Ticker p0){
return Stopwatch.createStarted(p0);
}
public static com.google.common.base.Stopwatch createUnstarted(com.google.common.base.Ticker p0){
return Stopwatch.createUnstarted(p0);
}
public static com.google.common.base.Ticker systemTicker(){
return Ticker.systemTicker();
}
}
