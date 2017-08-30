package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TArrayUtil{ 
/**
*public static <T> org.apache.commons.math3.linear.FieldMatrix<T> org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(T[][]) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(T[]... p0) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(p0);
}
/**
*public static <T> T[][] org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(T[][]) throws org.apache.commons.math3.exception.DimensionMismatchException
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] toBlocksLayout(T[]... p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
	return org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(p0);
}
}
