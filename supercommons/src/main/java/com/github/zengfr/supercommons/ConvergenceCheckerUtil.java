package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ConvergenceCheckerUtil{ 
/**
*public static org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation> org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.evaluationChecker(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair>)
*/ 
public static org.apache.commons.math3.optim.ConvergenceChecker<Evaluation> evaluationChecker(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> p0){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.evaluationChecker(p0);
}
}
