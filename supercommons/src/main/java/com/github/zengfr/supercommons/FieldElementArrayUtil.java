package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldElementArrayUtil{ 
/**
*public static <T> T[][] org.apache.commons.math3.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math3.Field<T>,int,int)
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] createBlocksLayout(org.apache.commons.math3.Field<T> p0,int p1,int p2){
	return org.apache.commons.math3.linear.BlockFieldMatrix.createBlocksLayout(p0,p1,p2);
}
/**
*public static <T> T[][] org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(T[][]) throws org.apache.commons.math3.exception.DimensionMismatchException
*/ 
public static <T extends org.apache.commons.math3.FieldElement<T> > T[][] toBlocksLayout(T[][] p0) throws org.apache.commons.math3.exception.DimensionMismatchException{
	return org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(p0);
}
}
