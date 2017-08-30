package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Array2DRowRealMatrixUtil{ 
/**
*public static org.apache.commons.math3.linear.Array2DRowRealMatrix org.apache.commons.math3.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.Fraction>)
*/ 
public static org.apache.commons.math3.linear.Array2DRowRealMatrix fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.Fraction> p0){
	return org.apache.commons.math3.linear.MatrixUtils.fractionMatrixToRealMatrix(p0);
}
/**
*public static org.apache.commons.math3.linear.Array2DRowRealMatrix org.apache.commons.math3.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.BigFraction>)
*/ 
public static org.apache.commons.math3.linear.Array2DRowRealMatrix bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.BigFraction> p0){
	return org.apache.commons.math3.linear.MatrixUtils.bigFractionMatrixToRealMatrix(p0);
}
}
