package com.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AnyMatrixUtil{ 
public static void checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1,int p2,int p3,int p4) throws org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkSubMatrixIndex(p0,p1,p2,p3,p4);
}
public static void checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int[] p1,int[] p2) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkSubMatrixIndex(p0,p1,p2);
}
public static void checkMultiplicationCompatible(org.apache.commons.math3.linear.AnyMatrix p0,org.apache.commons.math3.linear.AnyMatrix p1) throws org.apache.commons.math3.exception.DimensionMismatchException{
 MatrixUtils.checkMultiplicationCompatible(p0,p1);
}
public static void checkAdditionCompatible(org.apache.commons.math3.linear.AnyMatrix p0,org.apache.commons.math3.linear.AnyMatrix p1) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException{
 MatrixUtils.checkAdditionCompatible(p0,p1);
}
public static void checkSubtractionCompatible(org.apache.commons.math3.linear.AnyMatrix p0,org.apache.commons.math3.linear.AnyMatrix p1) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException{
 MatrixUtils.checkSubtractionCompatible(p0,p1);
}
public static void checkMatrixIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1,int p2) throws org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkMatrixIndex(p0,p1,p2);
}
public static void checkRowIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1) throws org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkRowIndex(p0,p1);
}
public static void checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix p0,int p1) throws org.apache.commons.math3.exception.OutOfRangeException{
 MatrixUtils.checkColumnIndex(p0,p1);
}
}
