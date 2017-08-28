package com.zengfr.supercommons;
import org.apache.commons.math3.complex.ComplexUtils;
import org.apache.commons.math3.complex.Complex;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComplexUtil{ 
public static org.apache.commons.math3.complex.Complex polar2Complex(double p0,double p1) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return ComplexUtils.polar2Complex(p0,p1);
}
public static org.apache.commons.math3.complex.Complex valueOf(double p0){
return Complex.valueOf(p0);
}
public static org.apache.commons.math3.complex.Complex valueOf(double p0,double p1){
return Complex.valueOf(p0,p1);
}
public static boolean equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2){
return Complex.equalsWithRelativeTolerance(p0,p1,p2);
}
}
