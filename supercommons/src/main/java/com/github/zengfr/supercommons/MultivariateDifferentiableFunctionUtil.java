package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultivariateDifferentiableFunctionUtil{ 
/**
*public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateFunction)
*/ 
public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction toMultivariateDifferentiableFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateFunction p0){
	return org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableFunction(p0);
}
/**
*public static org.apache.commons.math3.analysis.DifferentiableMultivariateFunction org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction)
*/ 
public static org.apache.commons.math3.analysis.DifferentiableMultivariateFunction toDifferentiableMultivariateFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction p0){
	return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateFunction(p0);
}
}
