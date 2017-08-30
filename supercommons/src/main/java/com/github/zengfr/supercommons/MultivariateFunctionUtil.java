package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultivariateFunctionUtil{ 
/**
*public static org.apache.commons.math3.analysis.MultivariateFunction org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction,org.apache.commons.math3.analysis.UnivariateFunction,double)
*/ 
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,double p2){
	return org.apache.commons.math3.analysis.FunctionUtils.collector(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.analysis.MultivariateFunction org.apache.commons.math3.analysis.FunctionUtils.collector(org.apache.commons.math3.analysis.BivariateFunction,double)
*/ 
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
	return org.apache.commons.math3.analysis.FunctionUtils.collector(p0,p1);
}
}
