package com.zengfr.supercommons;
import org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MixtureMultivariateNormalDistributionUtil{ 
public static org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution estimate(double[][] p0,int p1) throws org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
return MultivariateNormalMixtureExpectationMaximization.estimate(p0,p1);
}
}
