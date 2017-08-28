package com.zengfr.supercommons;
import org.apache.commons.math3.analysis.FunctionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UnivariateDifferentiableFunctionArrayUtil{ 
public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction add(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction... p0){
return FunctionUtils.add(p0);
}
public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction compose(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction... p0){
return FunctionUtils.compose(p0);
}
public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction multiply(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction... p0){
return FunctionUtils.multiply(p0);
}
}
