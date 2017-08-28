package com.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StatisticalSummaryValuesUtil{ 
public static org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues aggregate(java.util.Collection<? extends org.apache.commons.math3.stat.descriptive.StatisticalSummary> p0){
return AggregateSummaryStatistics.aggregate(p0);
}
}
