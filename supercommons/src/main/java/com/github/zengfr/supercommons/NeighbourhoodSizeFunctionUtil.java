package com.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NeighbourhoodSizeFunctionUtil{ 
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction exponentialDecay(double p0,double p1,long p2){
return NeighbourhoodSizeFunctionFactory.exponentialDecay(p0,p1,p2);
}
public static org.apache.commons.math3.ml.neuralnet.sofm.NeighbourhoodSizeFunction quasiSigmoidDecay(double p0,double p1,long p2){
return NeighbourhoodSizeFunctionFactory.quasiSigmoidDecay(p0,p1,p2);
}
}
