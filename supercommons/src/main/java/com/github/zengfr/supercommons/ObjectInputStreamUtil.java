package com.zengfr.supercommons;
import org.apache.commons.math3.linear.MatrixUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectInputStreamUtil{ 
public static void deserializeRealVector(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealVector(p0,p1,p2);
}
public static void deserializeRealMatrix(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealMatrix(p0,p1,p2);
}
}
