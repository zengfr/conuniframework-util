package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FeatureInitializerUtil{ 
/**
*public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.function(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer function(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.function(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.randomize(org.apache.commons.math3.distribution.RealDistribution,org.apache.commons.math3.ml.neuralnet.FeatureInitializer)
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer randomize(org.apache.commons.math3.distribution.RealDistribution p0,org.apache.commons.math3.ml.neuralnet.FeatureInitializer p1){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.randomize(p0,p1);
}
/**
*public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.uniform(org.apache.commons.math3.random.RandomGenerator,double,double)
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(org.apache.commons.math3.random.RandomGenerator p0,double p1,double p2){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.uniform(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.uniform(double,double)
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(double p0,double p1){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.uniform(p0,p1);
}
}
