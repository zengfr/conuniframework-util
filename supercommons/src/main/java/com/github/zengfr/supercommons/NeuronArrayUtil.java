package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NeuronArrayUtil{ 
/**
*public static org.apache.commons.math3.ml.neuralnet.Neuron[] org.apache.commons.math3.ml.neuralnet.MapUtils.sort(double[],java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron>,org.apache.commons.math3.ml.distance.DistanceMeasure)
*/ 
public static org.apache.commons.math3.ml.neuralnet.Neuron[] sort(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
	return org.apache.commons.math3.ml.neuralnet.MapUtils.sort(p0,p1,p2);
}
}
