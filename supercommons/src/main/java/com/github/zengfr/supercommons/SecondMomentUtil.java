package com.github.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SecondMomentUtil{ 
public static void copy(org.apache.commons.math3.stat.descriptive.moment.SecondMoment p0,org.apache.commons.math3.stat.descriptive.moment.SecondMoment p1) throws org.apache.commons.math3.exception.NullArgumentException{
 SecondMoment.copy(p0,p1);
}
}
