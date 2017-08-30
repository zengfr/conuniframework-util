package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IncrementorUtil{ 
/**
*public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.countEvaluations(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem,org.apache.commons.math3.util.Incrementor)
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem countEvaluations(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.util.Incrementor p1){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.countEvaluations(p0,p1);
}
/**
*public static org.apache.commons.math3.util.Incrementor org.apache.commons.math3.util.Incrementor.wrap(org.apache.commons.math3.util.IntegerSequence$Incrementor)
*/ 
public static org.apache.commons.math3.util.Incrementor Incrementor p0){
	return org.apache.commons.math3.util.Incrementor.wrap(p0);
}
/**
*public static org.apache.commons.math3.util.IntegerSequence$Incrementor org.apache.commons.math3.util.IntegerSequence$Incrementor.create()
*/ 
public static Incrementor create(){
	return org.apache.commons.math3.util.IntegerSequence.Incrementor.create();
}
}
