package com.zengfr.supercommons;
import org.apache.commons.math3.analysis.FunctionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BivariateFunctionUtil{ 
public static org.apache.commons.math3.analysis.UnivariateFunction combine(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,org.apache.commons.math3.analysis.UnivariateFunction p2){
return FunctionUtils.combine(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.collector(p0,p1);
}
public static org.apache.commons.math3.analysis.MultivariateFunction collector(org.apache.commons.math3.analysis.BivariateFunction p0,org.apache.commons.math3.analysis.UnivariateFunction p1,double p2){
return FunctionUtils.collector(p0,p1,p2);
}
public static org.apache.commons.math3.analysis.UnivariateFunction fix2ndArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.fix2ndArgument(p0,p1);
}
public static org.apache.commons.math3.analysis.UnivariateFunction fix1stArgument(org.apache.commons.math3.analysis.BivariateFunction p0,double p1){
return FunctionUtils.fix1stArgument(p0,p1);
}
}
