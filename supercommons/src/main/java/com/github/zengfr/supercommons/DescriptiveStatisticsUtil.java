package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DescriptiveStatisticsUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.DescriptiveStatistics p0,org.apache.commons.math3.stat.descriptive.DescriptiveStatistics p1) throws org.apache.commons.math3.exception.NullArgumentException{
 DescriptiveStatistics.copy(p0,p1);
}
}
