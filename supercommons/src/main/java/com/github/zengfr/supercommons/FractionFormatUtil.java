package com.zengfr.supercommons;
import org.apache.commons.math3.fraction.FractionFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FractionFormatUtil{ 
public static org.apache.commons.math3.fraction.FractionFormat getImproperInstance(){
return FractionFormat.getImproperInstance();
}
public static org.apache.commons.math3.fraction.FractionFormat getImproperInstance(java.util.Locale p0){
return FractionFormat.getImproperInstance(p0);
}
public static org.apache.commons.math3.fraction.FractionFormat getProperInstance(){
return FractionFormat.getProperInstance();
}
public static org.apache.commons.math3.fraction.FractionFormat getProperInstance(java.util.Locale p0){
return FractionFormat.getProperInstance(p0);
}
}
