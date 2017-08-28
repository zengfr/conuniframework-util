package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SummaryStatisticsUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.SummaryStatistics p0,org.apache.commons.math3.stat.descriptive.SummaryStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SummaryStatistics.copy(p0,p1);
}
}
