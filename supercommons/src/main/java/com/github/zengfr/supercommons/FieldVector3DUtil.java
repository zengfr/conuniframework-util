package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.threed.FieldRotation;
import org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldVector3DUtil{ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldRotation.applyTo(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldRotation.applyInverseTo(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.crossProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.crossProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.crossProduct(p0,p1);
}
}
