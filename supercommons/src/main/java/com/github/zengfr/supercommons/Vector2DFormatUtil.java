package com.github.zengfr.supercommons;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Vector2DFormatUtil{ 
public static org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat getInstance(java.util.Locale p0){
return Vector2DFormat.getInstance(p0);
}
public static org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat getInstance(){
return Vector2DFormat.getInstance();
}
}
