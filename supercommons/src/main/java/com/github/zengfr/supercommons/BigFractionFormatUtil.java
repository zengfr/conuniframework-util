package com.github.zengfr.supercommons;
import org.apache.commons.math3.fraction.BigFractionFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BigFractionFormatUtil{ 
public static org.apache.commons.math3.fraction.BigFractionFormat getImproperInstance(){
return BigFractionFormat.getImproperInstance();
}
public static org.apache.commons.math3.fraction.BigFractionFormat getImproperInstance(java.util.Locale p0){
return BigFractionFormat.getImproperInstance(p0);
}
public static org.apache.commons.math3.fraction.BigFractionFormat getProperInstance(java.util.Locale p0){
return BigFractionFormat.getProperInstance(p0);
}
public static org.apache.commons.math3.fraction.BigFractionFormat getProperInstance(){
return BigFractionFormat.getProperInstance();
}
}
