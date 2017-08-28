package com.github.zengfr.supercommons;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConvergenceCheckerUtil{ 
public static org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> evaluationChecker(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> p0){
return LeastSquaresFactory.evaluationChecker(p0);
}
}
