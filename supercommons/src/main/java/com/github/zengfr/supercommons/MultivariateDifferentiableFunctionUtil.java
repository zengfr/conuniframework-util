package com.github.zengfr.supercommons;
import org.apache.commons.math3.analysis.FunctionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultivariateDifferentiableFunctionUtil{ 
public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction toMultivariateDifferentiableFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateFunction p0){
return FunctionUtils.toMultivariateDifferentiableFunction(p0);
}
public static org.apache.commons.math3.analysis.DifferentiableMultivariateFunction toDifferentiableMultivariateFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction p0){
return FunctionUtils.toDifferentiableMultivariateFunction(p0);
}
}
