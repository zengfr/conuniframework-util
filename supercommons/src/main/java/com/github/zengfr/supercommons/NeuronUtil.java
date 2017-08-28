package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NeuronUtil{ 
public static org.apache.commons.math3.ml.neuralnet.Neuron findBest(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.findBest(p0,p1,p2);
}
}
