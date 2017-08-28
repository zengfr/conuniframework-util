package com.zengfr.supercommons;
import org.apache.commons.math3.linear.RealVectorFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RealVectorFormatUtil{ 
public static org.apache.commons.math3.linear.RealVectorFormat getInstance(java.util.Locale p0){
return RealVectorFormat.getInstance(p0);
}
public static org.apache.commons.math3.linear.RealVectorFormat getInstance(){
return RealVectorFormat.getInstance();
}
}
