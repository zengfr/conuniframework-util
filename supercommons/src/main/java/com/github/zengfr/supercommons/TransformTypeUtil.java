package com.zengfr.supercommons;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformTypeUtil{ 
public static void transformInPlace(double[][] p0,org.apache.commons.math3.transform.DftNormalization p1,org.apache.commons.math3.transform.TransformType p2){
 FastFourierTransformer.transformInPlace(p0,p1,p2);
}
public static org.apache.commons.math3.transform.TransformType valueOf(java.lang.String p0){
return TransformType.valueOf(p0);
}
}
