package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealVectorUtil{ 
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
*public static org.apache.commons.math3.linear.RealVector org.apache.commons.math3.linear.MatrixUtils.createRealVector(double[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static org.apache.commons.math3.linear.RealVector createRealVector(double... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createRealVector(p0);
}
/**
*public static void org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(org.apache.commons.math3.linear.RealVector,java.io.ObjectOutputStream) throws java.io.IOException
*/ 
public static void serializeRealVector(org.apache.commons.math3.linear.RealVector p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
	 org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(p0,p1);
}
/**
*public static void org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException
*/ 
public static void solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
	 org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(p0,p1);
}
/**
*public static void org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException
*/ 
public static void solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
	 org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(p0,p1);
}
/**
*public static org.apache.commons.math3.linear.RealVector org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)
*/ 
public static org.apache.commons.math3.linear.RealVector unmodifiableRealVector(org.apache.commons.math3.linear.RealVector p0){
	return org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(p0);
}
/**
*public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.weightDiagonal(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem,org.apache.commons.math3.linear.RealVector)
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem weightDiagonal(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.linear.RealVector p1){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.weightDiagonal(p0,p1);
}
}
