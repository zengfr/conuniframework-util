package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RotationUtil{ 
/**
*public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.spherical.twod.Sphere2D, org.apache.commons.math3.geometry.spherical.oned.Sphere1D> org.apache.commons.math3.geometry.spherical.twod.Circle.getTransform(org.apache.commons.math3.geometry.euclidean.threed.Rotation)
*/ 
public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.spherical.twod.Sphere2D, org.apache.commons.math3.geometry.spherical.oned.Sphere1D> getTransform(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0){
	return org.apache.commons.math3.geometry.spherical.twod.Circle.getTransform(p0);
}
/**
*public static double org.apache.commons.math3.geometry.euclidean.threed.Rotation.distance(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.Rotation)
*/ 
public static double distance(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.Rotation p1){
	return org.apache.commons.math3.geometry.euclidean.threed.Rotation.distance(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T>)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
	return org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(p0,p1);
}
}
