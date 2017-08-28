package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector2DUtil{ 
public static double distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
return Vector2D.distance(p0,p1);
}
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
return Vector2D.distanceSq(p0,p1);
}
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
return Vector2D.distanceInf(p0,p1);
}
public static double angle(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return Vector2D.angle(p0,p1);
}
}
