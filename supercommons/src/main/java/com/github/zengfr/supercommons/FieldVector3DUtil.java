package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldVector3DUtil{ 
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(p0,p1);
}
}
