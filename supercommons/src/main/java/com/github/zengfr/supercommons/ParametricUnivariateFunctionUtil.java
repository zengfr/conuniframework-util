package com.github.zengfr.supercommons;
import org.apache.commons.math3.fitting.SimpleCurveFitter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ParametricUnivariateFunctionUtil{ 
public static org.apache.commons.math3.fitting.SimpleCurveFitter create(org.apache.commons.math3.analysis.ParametricUnivariateFunction p0,double[] p1){
return SimpleCurveFitter.create(p0,p1);
}
}
