package com.github.zengfr.supercommons;
import org.apache.commons.math3.fraction.BigFractionFormat;
import org.apache.commons.math3.fraction.BigFraction;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BigFractionUtil{ 
public static java.lang.String formatBigFraction(org.apache.commons.math3.fraction.BigFraction p0){
return BigFractionFormat.formatBigFraction(p0);
}
public static org.apache.commons.math3.fraction.BigFraction getReducedFraction(int p0,int p1){
return BigFraction.getReducedFraction(p0,p1);
}
}
