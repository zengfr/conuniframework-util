package com.github.zengfr.supercommons;
import org.apache.commons.math3.geometry.spherical.twod.Circle;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformUtil{ 
public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.spherical.twod.Sphere2D, org.apache.commons.math3.geometry.spherical.oned.Sphere1D> getTransform(org.apache.commons.math3.geometry.euclidean.threed.Rotation p0){
return Circle.getTransform(p0);
}
public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> getTransform(java.awt.geom.AffineTransform p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return Line.getTransform(p0);
}
public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> getTransform(double p0,double p1,double p2,double p3,double p4,double p5) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
return Line.getTransform(p0,p1,p2,p3,p4,p5);
}
}
