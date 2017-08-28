package com.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldVectorUtil{ 
public static <T extends org.apache.commons.math3.FieldElement<T> > org.apache.commons.math3.linear.FieldVector<T> createFieldVector(T[] p0) throws org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.ZeroException{
return MatrixUtils.createFieldVector(p0);
}
}
