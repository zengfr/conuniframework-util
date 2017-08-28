package com.github.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DistanceMeasureUtil{ 
public static org.apache.commons.math3.ml.neuralnet.Neuron[] sort(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.sort(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.Neuron findBest(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.findBest(p0,p1,p2);
}
public static double[][] computeU(org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D p0,org.apache.commons.math3.ml.distance.DistanceMeasure p1){
return MapUtils.computeU(p0,p1);
}
public static int[][] computeHitHistogram(java.lang.Iterable<double[]> p0,org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeHitHistogram(p0,p1,p2);
}
public static double computeTopographicError(java.lang.Iterable<double[]> p0,org.apache.commons.math3.ml.neuralnet.Network p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeTopographicError(p0,p1,p2);
}
public static double computeQuantizationError(java.lang.Iterable<double[]> p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeQuantizationError(p0,p1,p2);
}
public static org.apache.commons.math3.util.Pair<org.apache.commons.math3.ml.neuralnet.Neuron, org.apache.commons.math3.ml.neuralnet.Neuron> findBestAndSecondBest(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.findBestAndSecondBest(p0,p1,p2);
}
}
