package com.zengfr.supercommons;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealVectorUtil{ 
public static org.apache.commons.math3.linear.RealVector unmodifiableRealVector(org.apache.commons.math3.linear.RealVector p0){
return RealVector.unmodifiableRealVector(p0);
}
public static void solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
 MatrixUtils.solveLowerTriangularSystem(p0,p1);
}
public static void solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
 MatrixUtils.solveUpperTriangularSystem(p0,p1);
}
public static void serializeRealVector(org.apache.commons.math3.linear.RealVector p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
 MatrixUtils.serializeRealVector(p0,p1);
}
public static org.apache.commons.math3.linear.RealVector createRealVector(double[] p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createRealVector(p0);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p3,int p4,int p5){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem weightDiagonal(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.linear.RealVector p1){
return LeastSquaresFactory.weightDiagonal(p0,p1);
}
}
