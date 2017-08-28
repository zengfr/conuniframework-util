package com.github.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Array2DRowRealMatrixUtil{ 
public static org.apache.commons.math3.linear.Array2DRowRealMatrix bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.BigFraction> p0){
return MatrixUtils.bigFractionMatrixToRealMatrix(p0);
}
public static org.apache.commons.math3.linear.Array2DRowRealMatrix fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix<org.apache.commons.math3.fraction.Fraction> p0){
return MatrixUtils.fractionMatrixToRealMatrix(p0);
}
}
