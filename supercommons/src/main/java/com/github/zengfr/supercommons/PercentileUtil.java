package com.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PercentileUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.rank.Percentile p0,org.apache.commons.math3.stat.descriptive.rank.Percentile p1) throws org.apache.commons.math3.exception.MathUnsupportedOperationException{
 Percentile.copy(p0,p1);
}
}
