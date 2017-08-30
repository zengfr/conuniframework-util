package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AffineTransformUtil{ 
/**
*public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(java.awt.geom.AffineTransform) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*/ 
public static org.apache.commons.math3.geometry.partitioning.Transform<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> getTransform(java.awt.geom.AffineTransform p0) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(p0);
}
}
