package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.spherical.oned.S1Point;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class S1PointUtil{ 
public static double distance(org.apache.commons.math3.geometry.spherical.oned.S1Point p0,org.apache.commons.math3.geometry.spherical.oned.S1Point p1){
return S1Point.distance(p0,p1);
}
}
