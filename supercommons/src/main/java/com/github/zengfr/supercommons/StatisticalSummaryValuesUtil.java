package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StatisticalSummaryValuesUtil{ 
/**
*public static org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.aggregate(java.util.Collection<? extends org.apache.commons.math3.stat.descriptive.StatisticalSummary>)
*/ 
public static org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues aggregate(java.util.Collection<? extends org.apache.commons.math3.stat.descriptive.StatisticalSummary> p0){
	return org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.aggregate(p0);
}
}
