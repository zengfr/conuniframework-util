package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectOutputStreamUtil{ 
/**
*public static void org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix,java.io.ObjectOutputStream) throws java.io.IOException
*/ 
public static void serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
	 org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(p0,p1);
}
/**
*public static void org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(org.apache.commons.math3.linear.RealVector,java.io.ObjectOutputStream) throws java.io.IOException
*/ 
public static void serializeRealVector(org.apache.commons.math3.linear.RealVector p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
	 org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(p0,p1);
}
}
