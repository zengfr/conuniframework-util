package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AdamsNordsieckFieldTransformerUtil{ 
/**
*public static <T> org.apache.commons.math3.ode.nonstiff.AdamsNordsieckFieldTransformer<T> org.apache.commons.math3.ode.nonstiff.AdamsNordsieckFieldTransformer.getInstance(org.apache.commons.math3.Field<T>,int)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > org.apache.commons.math3.ode.nonstiff.AdamsNordsieckFieldTransformer<T> getInstance(org.apache.commons.math3.Field<T> p0,int p1){
	return org.apache.commons.math3.ode.nonstiff.AdamsNordsieckFieldTransformer.getInstance(p0,p1);
}
}
