package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConfidenceIntervalUtil{ 
/**
*public static org.apache.commons.math3.stat.interval.ConfidenceInterval org.apache.commons.math3.stat.interval.IntervalUtils.getClopperPearsonInterval(int,int,double)
*/ 
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getClopperPearsonInterval(int p0,int p1,double p2){
	return org.apache.commons.math3.stat.interval.IntervalUtils.getClopperPearsonInterval(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.stat.interval.ConfidenceInterval org.apache.commons.math3.stat.interval.IntervalUtils.getNormalApproximationInterval(int,int,double)
*/ 
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getNormalApproximationInterval(int p0,int p1,double p2){
	return org.apache.commons.math3.stat.interval.IntervalUtils.getNormalApproximationInterval(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.stat.interval.ConfidenceInterval org.apache.commons.math3.stat.interval.IntervalUtils.getWilsonScoreInterval(int,int,double)
*/ 
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getWilsonScoreInterval(int p0,int p1,double p2){
	return org.apache.commons.math3.stat.interval.IntervalUtils.getWilsonScoreInterval(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.stat.interval.ConfidenceInterval org.apache.commons.math3.stat.interval.IntervalUtils.getAgrestiCoullInterval(int,int,double)
*/ 
public static org.apache.commons.math3.stat.interval.ConfidenceInterval getAgrestiCoullInterval(int p0,int p1,double p2){
	return org.apache.commons.math3.stat.interval.IntervalUtils.getAgrestiCoullInterval(p0,p1,p2);
}
}
