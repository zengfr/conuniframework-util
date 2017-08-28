package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.moment.Kurtosis;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class KurtosisUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Kurtosis p0,org.apache.commons.math3.stat.descriptive.moment.Kurtosis p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Kurtosis.copy(p0,p1);
}
}
