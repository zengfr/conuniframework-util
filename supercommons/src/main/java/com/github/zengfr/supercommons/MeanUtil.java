package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MeanUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.moment.Mean p0,org.apache.commons.math3.stat.descriptive.moment.Mean p1) throws org.apache.commons.math3.exception.NullArgumentException{
 Mean.copy(p0,p1);
}
}
