package com.github.zengfr.supercommons;
import org.apache.commons.math3.linear.BlockFieldMatrix;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldElementArrayUtil{ 
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] toBlocksLayout(T[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
return BlockFieldMatrix.toBlocksLayout(p0);
}
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] createBlocksLayout(org.apache.commons.math3.Field<T> p0,int p1,int p2){
return BlockFieldMatrix.createBlocksLayout(p0,p1,p2);
}
}
