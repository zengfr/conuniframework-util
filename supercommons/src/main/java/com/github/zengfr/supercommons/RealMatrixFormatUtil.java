package com.zengfr.supercommons;
import org.apache.commons.math3.linear.RealMatrixFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealMatrixFormatUtil{ 
public static org.apache.commons.math3.linear.RealMatrixFormat getInstance(java.util.Locale p0){
return RealMatrixFormat.getInstance(p0);
}
public static org.apache.commons.math3.linear.RealMatrixFormat getInstance(){
return RealMatrixFormat.getInstance();
}
}
