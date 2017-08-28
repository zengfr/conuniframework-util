package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NeuronSquareMesh2DUtil{ 
public static double[][] computeU(org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D p0,org.apache.commons.math3.ml.distance.DistanceMeasure p1){
return MapUtils.computeU(p0,p1);
}
public static int[][] computeHitHistogram(java.lang.Iterable<double[]> p0,org.apache.commons.math3.ml.neuralnet.twod.NeuronSquareMesh2D p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeHitHistogram(p0,p1,p2);
}
}
