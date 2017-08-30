package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformTypeUtil{ 
/**
*public static void org.apache.commons.math3.transform.FastFourierTransformer.transformInPlace(double[][],org.apache.commons.math3.transform.DftNormalization,org.apache.commons.math3.transform.TransformType)
*/ 
public static void transformInPlace(double[][] p0,org.apache.commons.math3.transform.DftNormalization p1,org.apache.commons.math3.transform.TransformType p2){
	 org.apache.commons.math3.transform.FastFourierTransformer.transformInPlace(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.transform.TransformType org.apache.commons.math3.transform.TransformType.valueOf(java.lang.String)
*/ 
public static org.apache.commons.math3.transform.TransformType valueOf(java.lang.String p0){
	return org.apache.commons.math3.transform.TransformType.valueOf(p0);
}
}
