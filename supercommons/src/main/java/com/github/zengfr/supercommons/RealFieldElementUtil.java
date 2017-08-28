package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.threed.FieldRotation;
import org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D;
import org.apache.commons.math3.util.MathUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealFieldElementUtil{ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldRotation<T> p1){
return FieldRotation.distance(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distance(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distance(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distance(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distanceSq(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distanceSq(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distanceSq(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.dotProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.dotProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.dotProduct(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distanceInf(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distanceInf(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distanceInf(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distance1(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1){
return FieldVector3D.distance1(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1){
return FieldVector3D.distance1(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FieldVector3D.angle(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FieldVector3D.angle(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D<T> p0,org.apache.commons.math3.geometry.euclidean.threed.Vector3D p1) throws org.apache.commons.math3.exception.MathArithmeticException{
return FieldVector3D.angle(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T min(T p0,T p1){
return MathUtils.min(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T max(T p0,T p1){
return MathUtils.max(p0,p1);
}
}
