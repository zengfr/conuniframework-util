package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultivariateJacobianFunctionUtil{ 
/**
*public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<Evaluation> p4,int p5,int p6){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.optim.ConvergenceChecker<Evaluation> p3,int p4,int p5){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5);
}
/**
*public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
/**
*public static org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.model(org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.analysis.MultivariateMatrixFunction)
*/ 
public static org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction model(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.model(p0,p1);
}
}
