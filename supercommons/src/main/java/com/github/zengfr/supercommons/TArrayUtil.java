package com.github.zengfr.supercommons;
import org.apache.commons.math3.linear.BlockFieldMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TArrayUtil{ 
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] toBlocksLayout(T[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
return BlockFieldMatrix.toBlocksLayout(p0);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldMatrix<T> createFieldMatrix(T[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException{
return MatrixUtils.createFieldMatrix(p0);
}
}
