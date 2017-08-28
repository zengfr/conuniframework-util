package com.zengfr.supercommons;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.math3.ml.neuralnet.MapUtils;
import org.apache.commons.math3.util.Pair;
import com.facebook.collections.ComparablePair;
import com.facebook.collections.Pair;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PairUtil{ 
public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> of(L p0,R p1){
return Pair.of(p0,p1);
}
public static org.apache.commons.math3.util.Pair<org.apache.commons.math3.ml.neuralnet.Neuron, org.apache.commons.math3.ml.neuralnet.Neuron> findBestAndSecondBest(double[] p0,java.lang.Iterable<org.apache.commons.math3.ml.neuralnet.Neuron> p1,org.apache.commons.math3.ml.distance.DistanceMeasure p2){
return MapUtils.findBestAndSecondBest(p0,p1,p2);
}
public static <K,V> org.apache.commons.math3.util.Pair<K, V> create(K p0,V p1){
return Pair.create(p0,p1);
}
public static <T1 extends java.lang.Comparable<? super T1> ,T2 extends java.lang.Comparable<? super T2> > com.facebook.collections.Pair<T1, T2> of(T1 p0,T2 p1){
return ComparablePair.of(p0,p1);
}
}
