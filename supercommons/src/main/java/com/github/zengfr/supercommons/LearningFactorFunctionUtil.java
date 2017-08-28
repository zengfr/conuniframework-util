package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LearningFactorFunctionUtil{ 
public static org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunction exponentialDecay(double p0,double p1,long p2){
return LearningFactorFunctionFactory.exponentialDecay(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunction quasiSigmoidDecay(double p0,double p1,long p2){
return LearningFactorFunctionFactory.quasiSigmoidDecay(p0,p1,p2);
}
}
