package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NeuronUtil{ 
/**
*public static org.apache.commons.math3.ml.neuralnet.Neuron org.apache.commons.math3.ml.neuralnet.MapUtils.findBest(double[],java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron>,org.apache.commons.math3.ml.distance.DistanceMeasure)
*/ 
public static org.apache.commons.math3.ml.neuralnet.Neuron findBest(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
	return org.apache.commons.math3.ml.neuralnet.MapUtils.findBest(p0,p1,p2);
}
}
