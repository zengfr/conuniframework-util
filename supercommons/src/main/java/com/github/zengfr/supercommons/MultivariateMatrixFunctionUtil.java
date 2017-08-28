package com.zengfr.supercommons;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MultivariateMatrixFunctionUtil{ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1,double[] p2,double[] p3,org.apache.commons.math3.linear.RealMatrix p4,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p5,int p6,int p7){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction model(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1){
return LeastSquaresFactory.model(p0,p1);
}
}
