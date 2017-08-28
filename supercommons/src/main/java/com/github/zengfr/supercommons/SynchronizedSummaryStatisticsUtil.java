package com.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronizedSummaryStatisticsUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics p0,org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SynchronizedSummaryStatistics.copy(p0,p1);
}
}
