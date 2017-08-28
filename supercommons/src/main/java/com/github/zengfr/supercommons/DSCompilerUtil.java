package com.github.zengfr.supercommons;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DSCompilerUtil{ 
public static org.apache.commons.math3.analysis.differentiation.DSCompiler getCompiler(int p0,int p1) throws org.apache.commons.math3.exception.NumberIsTooLargeException{
return DSCompiler.getCompiler(p0,p1);
}
}
