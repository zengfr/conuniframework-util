package com.zengfr.supercommons;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.IntegerSequence.Incrementor;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IncrementorUtil{ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem countEvaluations(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.util.Incrementor p1){
return LeastSquaresFactory.countEvaluations(p0,p1);
}
public static org.apache.commons.math3.util.Incrementor wrap(org.apache.commons.math3.util.IntegerSequence.Incrementor p0){
return Incrementor.wrap(p0);
}
public static org.apache.commons.math3.util.IntegerSequence.Incrementor create(){
return Incrementor.create();
}
}
