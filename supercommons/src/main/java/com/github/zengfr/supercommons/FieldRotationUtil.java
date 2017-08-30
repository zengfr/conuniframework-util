package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldRotationUtil{ 
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
}
