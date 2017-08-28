package com.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SkewnessUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Skewness p0,org.apache.commons.math3.stat.descriptive.moment.Skewness p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Skewness.copy(p0,p1);
}
}
