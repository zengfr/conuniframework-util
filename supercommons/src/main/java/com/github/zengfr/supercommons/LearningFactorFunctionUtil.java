package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LearningFactorFunctionUtil{ 
/**
*public static org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunction org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory.exponentialDecay(double,double,long)
*/ 
public static org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunction exponentialDecay(double p0,double p1,long p2){
	return org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory.exponentialDecay(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunction org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory.quasiSigmoidDecay(double,double,long)
*/ 
public static org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunction quasiSigmoidDecay(double p0,double p1,long p2){
	return org.apache.commons.math3.ml.neuralnet.sofm.LearningFactorFunctionFactory.quasiSigmoidDecay(p0,p1,p2);
}
}
