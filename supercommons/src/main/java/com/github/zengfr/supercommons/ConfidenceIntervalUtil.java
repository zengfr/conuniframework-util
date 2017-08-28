package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.interval.IntervalUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConfidenceIntervalUtil{ 
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getWilsonScoreInterval(int p0,int p1,double p2){
return IntervalUtils.getWilsonScoreInterval(p0,p1,p2);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getNormalApproximationInterval(int p0,int p1,double p2){
return IntervalUtils.getNormalApproximationInterval(p0,p1,p2);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getAgrestiCoullInterval(int p0,int p1,double p2){
return IntervalUtils.getAgrestiCoullInterval(p0,p1,p2);
}
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getClopperPearsonInterval(int p0,int p1,double p2){
return IntervalUtils.getClopperPearsonInterval(p0,p1,p2);
}
}
