package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector2DUtil{ 
/**
*public static double org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D,org.apache.commons.math3.geometry.euclidean.twod.Vector2D)
*/ 
public static double distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
	return org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distance(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceSq(org.apache.commons.math3.geometry.euclidean.twod.Vector2D,org.apache.commons.math3.geometry.euclidean.twod.Vector2D)
*/ 
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
	return org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceSq(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.twod.Vector2D.angle(org.apache.commons.math3.geometry.euclidean.twod.Vector2D,org.apache.commons.math3.geometry.euclidean.twod.Vector2D) throws org.apache.commons.math3.exception.MathArithmeticException
*/ 
public static double angle(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.twod.Vector2D.angle(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceInf(org.apache.commons.math3.geometry.euclidean.twod.Vector2D,org.apache.commons.math3.geometry.euclidean.twod.Vector2D)
*/ 
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.twod.Vector2D p0,org.apache.commons.math3.geometry.euclidean.twod.Vector2D p1){
	return org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceInf(p0,p1);
}
}
