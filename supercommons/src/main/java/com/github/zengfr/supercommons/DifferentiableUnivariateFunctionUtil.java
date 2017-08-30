package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DifferentiableUnivariateFunctionUtil{ 
/**
*public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)
*/ 
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction add(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... p0){
	return org.apache.commons.math3.analysis.FunctionUtils.add(p0);
}
/**
*public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.compose(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)
*/ 
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction compose(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... p0){
	return org.apache.commons.math3.analysis.FunctionUtils.compose(p0);
}
/**
*public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction...)
*/ 
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction multiply(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... p0){
	return org.apache.commons.math3.analysis.FunctionUtils.multiply(p0);
}
/**
*public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction)
*/ 
public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction toDifferentiableUnivariateFunction(org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction p0){
	return org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableUnivariateFunction(p0);
}
/**
*public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction)
*/ 
public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction toUnivariateDifferential(org.apache.commons.math3.analysis.DifferentiableUnivariateFunction p0){
	return org.apache.commons.math3.analysis.FunctionUtils.toUnivariateDifferential(p0);
}
}
