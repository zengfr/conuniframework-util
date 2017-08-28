package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.spherical.twod.S2Point;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class S2PointUtil{ 
public static double distance(org.apache.commons.math3.geometry.spherical.twod.S2Point p0,org.apache.commons.math3.geometry.spherical.twod.S2Point p1){
return S2Point.distance(p0,p1);
}
}
