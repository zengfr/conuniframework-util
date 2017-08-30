package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DifferentiableMultivariateVectorFunctionUtil{ 
/**
*public static org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)
*/ 
public static org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction p0){
	return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(p0);
}
/**
*public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)
*/ 
public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction toMultivariateDifferentiableVectorFunction(org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction p0){
	return org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(p0);
}
}
