package com.github.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector3DUtil{ 
public static double distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distance(p0,p1);
}
public static double angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return Vector3D.angle(p0,p1);
}
public static double dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.dotProduct(p0,p1);
}
public static double distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distanceInf(p0,p1);
}
public static double distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distance1(p0,p1);
}
public static double distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.distanceSq(p0,p1);
}
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return Vector3D.crossProduct(p0,p1);
}
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane p0,org.apache.commons.math3.geometry.euclidean.threed.Plane p1,org.apache.commons.math3.geometry.euclidean.threed.Plane p2){
return Plane.intersection(p0,p1,p2);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distance(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distance(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FieldVector3D.angle(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FieldVector3D.angle(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.dotProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.dotProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distanceInf(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distanceInf(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distance1(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distance1(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distanceSq(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distanceSq(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.crossProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.crossProduct(p0,p1);
}
}
