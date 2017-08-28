package com.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.moment.FirstMoment;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FirstMomentUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.moment.FirstMoment p0,org.apache.commons.math3.stat.descriptive.moment.FirstMoment p1) throws org.apache.commons.math3.exception.NullArgumentException{
 FirstMoment.copy(p0,p1);
}
}
