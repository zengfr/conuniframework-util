package com.zengfr.supercommons;
import org.apache.commons.math3.complex.ComplexUtils;
import org.apache.commons.math3.transform.TransformUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComplexArrayUtil{ 
public static org.apache.commons.math3.complex.Complex[] convertToComplex(double[] p0){
return ComplexUtils.convertToComplex(p0);
}
public static org.apache.commons.math3.complex.Complex[] scaleArray(org.apache.commons.math3.complex.Complex[] p0,double p1){
return TransformUtils.scaleArray(p0,p1);
}
public static org.apache.commons.math3.complex.Complex[] createComplexArray(double[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
return TransformUtils.createComplexArray(p0);
}
public static double[][] createRealImaginaryArray(org.apache.commons.math3.complex.Complex[] p0){
return TransformUtils.createRealImaginaryArray(p0);
}
}
