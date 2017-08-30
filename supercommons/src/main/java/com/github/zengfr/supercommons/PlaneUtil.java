package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PlaneUtil{ 
/**
*public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane,org.apache.commons.math3.geometry.euclidean.threed.Plane,org.apache.commons.math3.geometry.euclidean.threed.Plane)
*/ 
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane p0,org.apache.commons.math3.geometry.euclidean.threed.Plane p1,org.apache.commons.math3.geometry.euclidean.threed.Plane p2){
	return org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(p0,p1,p2);
}
}
