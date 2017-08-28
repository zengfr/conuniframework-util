package com.zengfr.supercommons;
import org.apache.commons.math3.stat.descriptive.rank.PSquarePercentile;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PSquareMarkersUtil{ 
public static PSquareMarkers newMarkers(java.util.List<java.lang.Double> p0,double p1){
return PSquarePercentile.newMarkers(p0,p1);
}
}
