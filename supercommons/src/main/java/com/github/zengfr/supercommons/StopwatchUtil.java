package com.github.zengfr.supercommons;
import com.google.common.base.Stopwatch;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StopwatchUtil{ 
public static com.google.common.base.Stopwatch createStarted(com.google.common.base.Ticker p0){
return Stopwatch.createStarted(p0);
}
public static com.google.common.base.Stopwatch createStarted(){
return Stopwatch.createStarted();
}
public static com.google.common.base.Stopwatch createUnstarted(){
return Stopwatch.createUnstarted();
}
public static com.google.common.base.Stopwatch createUnstarted(com.google.common.base.Ticker p0){
return Stopwatch.createUnstarted(p0);
}
}
