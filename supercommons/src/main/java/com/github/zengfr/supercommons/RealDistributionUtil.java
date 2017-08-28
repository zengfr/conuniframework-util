package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory;
import org.apache.commons.math3.stat.inference.TestUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealDistributionUtil{ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer randomize(org.apache.commons.math3.distribution.RealDistribution p0,org.apache.commons.math3.ml.neuralnet.FeatureInitializer p1){
return FeatureInitializerFactory.randomize(p0,p1);
}
public static double kolmogorovSmirnovStatistic(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovStatistic(p0,p1);
}
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static boolean kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
return TestUtils.kolmogorovSmirnovTest(p0,p1);
}
}
