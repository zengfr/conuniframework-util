package com.github.zengfr.supercommons;
import org.apache.commons.math3.linear.RealMatrixFormat;
import org.apache.commons.math3.linear.RealVectorFormat;
import org.apache.commons.math3.complex.ComplexFormat;
import org.apache.commons.math3.fraction.BigFractionFormat;
import org.apache.commons.math3.fraction.FractionFormat;
import java.text.NumberFormat;
import org.apache.commons.math3.geometry.VectorFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LocaleArrayUtil{ 
public static java.util.Locale[] getAvailableLocales(){
return RealMatrixFormat.getAvailableLocales();
}
}
