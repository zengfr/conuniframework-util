package com.github.zengfr.supercommons;
import org.apache.commons.math3.analysis.differentiation.SparseGradient;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SparseGradientUtil{ 
public static org.apache.commons.math3.analysis.differentiation.SparseGradient createConstant(double p0){
return SparseGradient.createConstant(p0);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient atan2(org.apache.commons.math3.analysis.differentiation.SparseGradient p0,org.apache.commons.math3.analysis.differentiation.SparseGradient p1){
return SparseGradient.atan2(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient pow(double p0,org.apache.commons.math3.analysis.differentiation.SparseGradient p1){
return SparseGradient.pow(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient hypot(org.apache.commons.math3.analysis.differentiation.SparseGradient p0,org.apache.commons.math3.analysis.differentiation.SparseGradient p1){
return SparseGradient.hypot(p0,p1);
}
public static org.apache.commons.math3.analysis.differentiation.SparseGradient createVariable(int p0,double p1){
return SparseGradient.createVariable(p0,p1);
}
}
