package com.github.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector3DFormatUtil{ 
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat getInstance(java.util.Locale p0){
return Vector3DFormat.getInstance(p0);
}
public static org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat getInstance(){
return Vector3DFormat.getInstance();
}
}
