package com.github.zengfr.supercommons;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.math3.fraction.FractionFormat;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.lang.math.Fraction;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FractionUtil{ 
public static org.apache.commons.lang3.math.Fraction getFraction(int p0,int p1,int p2){
return Fraction.getFraction(p0,p1,p2);
}
public static org.apache.commons.lang3.math.Fraction getFraction(java.lang.String p0){
return Fraction.getFraction(p0);
}
public static org.apache.commons.lang3.math.Fraction getFraction(int p0,int p1){
return Fraction.getFraction(p0,p1);
}
public static org.apache.commons.lang3.math.Fraction getFraction(double p0){
return Fraction.getFraction(p0);
}
public static org.apache.commons.lang3.math.Fraction getReducedFraction(int p0,int p1){
return Fraction.getReducedFraction(p0,p1);
}
public static java.lang.String formatFraction(org.apache.commons.math3.fraction.Fraction p0){
return FractionFormat.formatFraction(p0);
}
}
