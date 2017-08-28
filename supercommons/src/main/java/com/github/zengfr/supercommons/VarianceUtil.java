package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class VarianceUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Variance p0,org.apache.commons.math3.stat.descriptive.moment.Variance p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Variance.copy(p0,p1);
}
}
