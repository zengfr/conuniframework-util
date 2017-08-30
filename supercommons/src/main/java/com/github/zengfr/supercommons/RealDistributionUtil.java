package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealDistributionUtil{ 
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovStatistic(org.apache.commons.math3.distribution.RealDistribution,double[]) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static double kolmogorovSmirnovStatistic(org.apache.commons.math3.distribution.RealDistribution p0,double... p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovStatistic(p0,p1);
}
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[]) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double... p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1);
}
/**
*public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],boolean) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],double) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static boolean kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.randomize(org.apache.commons.math3.distribution.RealDistribution,org.apache.commons.math3.ml.neuralnet.FeatureInitializer)
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer randomize(org.apache.commons.math3.distribution.RealDistribution p0,org.apache.commons.math3.ml.neuralnet.FeatureInitializer p1){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.randomize(p0,p1);
}
}
