package com.zengfr.supercommons;
import org.apache.commons.math3.analysis.FunctionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DifferentiableUnivariateFunctionArrayUtil{ 
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... p0){
return FunctionUtils.add(p0);
}
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction compose(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... p0){
return FunctionUtils.compose(p0);
}
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... p0){
return FunctionUtils.multiply(p0);
}
}
