package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NeighbourhoodSizeFunctionUtil{ 
/**
*public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory.exponentialDecay(double,double,long)
*/ 
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction exponentialDecay(double p0,double p1,long p2){
	return org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory.exponentialDecay(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory.quasiSigmoidDecay(double,double,long)
*/ 
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction quasiSigmoidDecay(double p0,double p1,long p2){
	return org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory.quasiSigmoidDecay(p0,p1,p2);
}
}
