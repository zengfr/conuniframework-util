package com.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealMatrixUtil{ 
public static org.apache.commons.math3.linear.RealMatrix inverse(org.apache.commons.math3.linear.RealMatrix p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException{
return MatrixUtils.inverse(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix inverse(org.apache.commons.math3.linear.RealMatrix p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException{
return MatrixUtils.inverse(p0);
}
public static org.apache.commons.math3.linear.RealMatrix createRealIdentityMatrix(int p0){
return MatrixUtils.createRealIdentityMatrix(p0);
}
public static org.apache.commons.math3.linear.RealMatrix createRealDiagonalMatrix(double[] p0){
return MatrixUtils.createRealDiagonalMatrix(p0);
}
public static org.apache.commons.math3.linear.RealMatrix createRowRealMatrix(double[] p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createRowRealMatrix(p0);
}
public static org.apache.commons.math3.linear.RealMatrix createColumnRealMatrix(double[] p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createColumnRealMatrix(p0);
}
public static void serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
 MatrixUtils.serializeRealMatrix(p0,p1);
}
public static void solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
 MatrixUtils.solveLowerTriangularSystem(p0,p1);
}
public static void solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
 MatrixUtils.solveUpperTriangularSystem(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(int p0,int p1){
return MatrixUtils.createRealMatrix(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(double[][] p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException{
return MatrixUtils.createRealMatrix(p0);
}
public static void checkSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
 MatrixUtils.checkSymmetric(p0,p1);
}
public static org.apache.commons.math3.linear.RealMatrix blockInverse(org.apache.commons.math3.linear.RealMatrix p0,int p1){
return MatrixUtils.blockInverse(p0,p1);
}
public static boolean isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
return MatrixUtils.isSymmetric(p0,p1);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1,double[] p2,double[] p3,org.apache.commons.math3.linear.RealMatrix p4,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p5,int p6,int p7){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
return LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem weightMatrix(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.linear.RealMatrix p1){
return LeastSquaresFactory.weightMatrix(p0,p1);
}
}
