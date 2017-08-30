package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector3DUtil{ 
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Vector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D) throws org.apache.commons.math3.exception.MathArithmeticException
*/ 
public static double angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.angle(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>) throws org.apache.commons.math3.exception.MathArithmeticException
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D) throws org.apache.commons.math3.exception.MathArithmeticException
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(p0,p1);
}
/**
*public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D org.apache.commons.math3.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.crossProduct(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static double distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static double distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance1(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceInf(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceSq(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(p0,p1);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static double dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Vector3D.dotProduct(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(p0,p1);
}
/**
*public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane,org.apache.commons.math3.geometry.euclidean.threed.Plane,org.apache.commons.math3.geometry.euclidean.threed.Plane)
*/ 
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane p0,org.apache.commons.math3.geometry.euclidean.threed.Plane p1,org.apache.commons.math3.geometry.euclidean.threed.Plane p2){
	return org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(p0,p1,p2);
}
}
