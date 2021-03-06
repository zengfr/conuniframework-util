package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class RealMatrixUtil{ 
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#blockInverse(org.apache.commons.math3.linear.RealMatrix,int)}
*@see org.apache.commons.math3.linear.MatrixUtils#blockInverse(org.apache.commons.math3.linear.RealMatrix,int)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.blockInverse(org.apache.commons.math3.linear.RealMatrix,int)
*blockInverse(org.apache.commons.math3.linear.RealMatrix p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix blockInverse(org.apache.commons.math3.linear.RealMatrix p0,int p1){
	return org.apache.commons.math3.linear.MatrixUtils.blockInverse(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#checkSymmetric(org.apache.commons.math3.linear.RealMatrix,double)}
*@see org.apache.commons.math3.linear.MatrixUtils#checkSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*<code>public static void org.apache.commons.math3.linear.MatrixUtils.checkSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*checkSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
	 org.apache.commons.math3.linear.MatrixUtils.checkSymmetric(p0,p1);
}
/**
*{@link org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.analysis.MultivariateMatrixFunction,double[],double[],org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)}
*@see org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.analysis.MultivariateMatrixFunction,double[],double[],org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)
*<code>public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.analysis.MultivariateMatrixFunction,double[],double[],org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)
*create(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1,double[] p2,double[] p3,org.apache.commons.math3.linear.RealMatrix p4,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation> p5,int p6,int p7)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.analysis.MultivariateVectorFunction p0,org.apache.commons.math3.analysis.MultivariateMatrixFunction p1,double[] p2,double[] p3,org.apache.commons.math3.linear.RealMatrix p4,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p5,int p6,int p7){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*{@link org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)}
*@see org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)
*<code>public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int)
*create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation> p4,int p5,int p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)}
*@see org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)
*<code>public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)
*create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createColumnRealMatrix(double...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createColumnRealMatrix(double...)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(double[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*createColumnRealMatrix(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix createColumnRealMatrix(double... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createRealDiagonalMatrix(double...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createRealDiagonalMatrix(double...)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(double[])
*createRealDiagonalMatrix(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix createRealDiagonalMatrix(double... p0){
	return org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createRealIdentityMatrix(int)}
*@see org.apache.commons.math3.linear.MatrixUtils#createRealIdentityMatrix(int)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix(int)
*createRealIdentityMatrix(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix createRealIdentityMatrix(int p0){
	return org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createRealMatrix(int,int)}
*@see org.apache.commons.math3.linear.MatrixUtils#createRealMatrix(int,int)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(int,int)
*createRealMatrix(int p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(int p0,int p1){
	return org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createRealMatrix(double[]...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createRealMatrix(double[]...)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(double[][]) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException
*createRealMatrix(double[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix createRealMatrix(double[]... p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException{
	return org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#createRowRealMatrix(double...)}
*@see org.apache.commons.math3.linear.MatrixUtils#createRowRealMatrix(double...)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.createRowRealMatrix(double[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*createRowRealMatrix(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix createRowRealMatrix(double... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createRowRealMatrix(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#inverse(org.apache.commons.math3.linear.RealMatrix,double)}
*@see org.apache.commons.math3.linear.MatrixUtils#inverse(org.apache.commons.math3.linear.RealMatrix,double)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.inverse(org.apache.commons.math3.linear.RealMatrix,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException
*inverse(org.apache.commons.math3.linear.RealMatrix p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix inverse(org.apache.commons.math3.linear.RealMatrix p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException{
	return org.apache.commons.math3.linear.MatrixUtils.inverse(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#inverse(org.apache.commons.math3.linear.RealMatrix)}
*@see org.apache.commons.math3.linear.MatrixUtils#inverse(org.apache.commons.math3.linear.RealMatrix)
*<code>public static org.apache.commons.math3.linear.RealMatrix org.apache.commons.math3.linear.MatrixUtils.inverse(org.apache.commons.math3.linear.RealMatrix) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException
*inverse(org.apache.commons.math3.linear.RealMatrix p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.linear.RealMatrix inverse(org.apache.commons.math3.linear.RealMatrix p0) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.linear.SingularMatrixException,org.apache.commons.math3.linear.NonSquareMatrixException{
	return org.apache.commons.math3.linear.MatrixUtils.inverse(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)}
*@see org.apache.commons.math3.linear.MatrixUtils#isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*<code>public static boolean org.apache.commons.math3.linear.MatrixUtils.isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
	return org.apache.commons.math3.linear.MatrixUtils.isSymmetric(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix,java.io.ObjectOutputStream)}
*@see org.apache.commons.math3.linear.MatrixUtils#serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix,java.io.ObjectOutputStream)
*<code>public static void org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix,java.io.ObjectOutputStream) throws java.io.IOException
*serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix p0,java.io.ObjectOutputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
	 org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector)}
*@see org.apache.commons.math3.linear.MatrixUtils#solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector)
*<code>public static void org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException
*solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
	 org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(p0,p1);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector)}
*@see org.apache.commons.math3.linear.MatrixUtils#solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector)
*<code>public static void org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealVector) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException
*solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix p0,org.apache.commons.math3.linear.RealVector p1) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.MathArithmeticException,org.apache.commons.math3.linear.NonSquareMatrixException{
	 org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(p0,p1);
}
/**
*{@link org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#weightMatrix(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem,org.apache.commons.math3.linear.RealMatrix)}
*@see org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#weightMatrix(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem,org.apache.commons.math3.linear.RealMatrix)
*<code>public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.weightMatrix(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem,org.apache.commons.math3.linear.RealMatrix)
*weightMatrix(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.linear.RealMatrix p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem weightMatrix(org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem p0,org.apache.commons.math3.linear.RealMatrix p1){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.weightMatrix(p0,p1);
}
}
