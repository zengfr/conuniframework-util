package com.github.zengfr.supercommons;
import org.apache.commons.math3.linear.JacobiPreconditioner;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealLinearOperatorUtil{ 
public static org.apache.commons.math3.linear.JacobiPreconditioner create(org.apache.commons.math3.linear.RealLinearOperator p0) throws org.apache.commons.math3.linear.NonSquareOperatorException{
return JacobiPreconditioner.create(p0);
}
}
