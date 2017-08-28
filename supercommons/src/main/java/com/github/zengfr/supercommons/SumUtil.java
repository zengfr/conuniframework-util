package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SumUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.summary.Sum p0,org.apache.commons.math3.stat.descriptive.summary.Sum p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Sum.copy(p0,p1);
}
}
