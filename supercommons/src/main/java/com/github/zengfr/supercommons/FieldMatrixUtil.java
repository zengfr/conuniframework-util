package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldMatrixUtil{ 
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(T[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createColumnFieldMatrix(T... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(p0);
}
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(T[])
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldDiagonalMatrix(T... p0){
	return org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(p0);
}
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math3.Field<T>,int)
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldIdentityMatrix(org.apache.commons.math3.Field<T> p0,int p1){
	return org.apache.commons.math3.linear.MatrixUtils.createFieldIdentityMatrix(p0,p1);
}
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(T[][]) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(T[]... p0) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(p0);
}
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math3.Field<T>,int,int)
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(org.apache.commons.math3.Field<T> p0,int p1,int p2){
	return org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(p0,p1,p2);
}
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(T[]) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createRowFieldMatrix(T... p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(p0);
}
}
