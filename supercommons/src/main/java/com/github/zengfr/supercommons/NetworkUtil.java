package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NetworkUtil{ 
public static double computeTopographicError(java.lang.Iterable<double[]> p0,org.apache.commons.math3.ml.neuralnet.Network p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.computeTopographicError(p0,p1,p2);
}
}
