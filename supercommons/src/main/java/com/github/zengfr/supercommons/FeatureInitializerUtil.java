package com.github.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FeatureInitializerUtil{ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer function(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2){
return FeatureInitializerFactory.function(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer randomize(org.apache.commons.math3.distribution.RealDistribution p0,org.apache.commons.math3.ml.neuralnet.FeatureInitializer p1){
return FeatureInitializerFactory.randomize(p0,p1);
}
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(org.apache.commons.math3.random.RandomGenerator p0,double p1,double p2){
return FeatureInitializerFactory.uniform(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(double p0,double p1){
return FeatureInitializerFactory.uniform(p0,p1);
}
}
