package com.github.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldMatrixUtil{ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldIdentityMatrix(org.apache.commons.math3.Field<T> p0,int p1){
return MatrixUtils.createFieldIdentityMatrix(p0,p1);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createColumnFieldMatrix(T[] p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createColumnFieldMatrix(p0);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(org.apache.commons.math3.Field<T> p0,int p1,int p2){
return MatrixUtils.createFieldMatrix(p0,p1,p2);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(T[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createFieldMatrix(p0);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createRowFieldMatrix(T[] p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createRowFieldMatrix(p0);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldDiagonalMatrix(T[] p0){
return MatrixUtils.createFieldDiagonalMatrix(p0);
}
}
