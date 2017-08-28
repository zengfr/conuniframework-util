package com.zengfr.supercommons;
import com.google.common.hash.Funnels;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PrimitiveSinkUtil{ 
public static java.io.OutputStream asOutputStream(com.google.common.hash.PrimitiveSink p0){
return Funnels.asOutputStream(p0);
}
}
