package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MixtureMultivariateNormalDistributionUtil{ 
/**
*public static org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.estimate(double[][],int) throws org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException
*/ 
public static org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution estimate(double[][] p0,int p1) throws org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException{
	return org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.estimate(p0,p1);
}
}
