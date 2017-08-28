package com.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectOutputStreamUtil{ 
public static void serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
 MatrixUtils.serializeRealMatrix(p0,p1);
}
public static void serializeRealVector(org.apache.commons.math3.linear.RealVector p0,java.io.ObjectOutputStream p1) throws java.io.IOException{
 MatrixUtils.serializeRealVector(p0,p1);
}
}
