package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SimpleCurveFitterUtil{ 
/**
*public static org.apache.commons.math3.fitting.SimpleCurveFitter org.apache.commons.math3.fitting.SimpleCurveFitter.create(org.apache.commons.math3.analysis.ParametricUnivariateFunction,double[])
*/ 
public static org.apache.commons.math3.fitting.SimpleCurveFitter create(org.apache.commons.math3.analysis.ParametricUnivariateFunction p0,double... p1){
	return org.apache.commons.math3.fitting.SimpleCurveFitter.create(p0,p1);
}
}
