package com.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PlaneUtil{ 
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3D intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane p0,org.apache.commons.math3.geometry.euclidean.threed.Plane p1,org.apache.commons.math3.geometry.euclidean.threed.Plane p2){
return Plane.intersection(p0,p1,p2);
}
}
