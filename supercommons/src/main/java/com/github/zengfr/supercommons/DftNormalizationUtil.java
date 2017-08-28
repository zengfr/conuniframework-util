package com.github.zengfr.supercommons;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.DftNormalization;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DftNormalizationUtil{ 
public static void transformInPlace(double[][] p0,org.apache.commons.math3.transform.DftNormalization p1,org.apache.commons.math3.transform.TransformType p2){
 FastFourierTransformer.transformInPlace(p0,p1,p2);
}
public static org.apache.commons.math3.transform.DftNormalization valueOf(java.lang.String p0){
return DftNormalization.valueOf(p0);
}
}
