package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector1DUtil{ 
public static double distance(org.apache.commons.math3.geometry.euclidean.oned.Vector1D p0,org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1){
return Vector1D.distance(p0,p1);
}
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.oned.Vector1D p0,org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1){
return Vector1D.distanceSq(p0,p1);
}
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.oned.Vector1D p0,org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1){
return Vector1D.distanceInf(p0,p1);
}
}
