package com.zengfr.supercommons;
import org.apache.commons.math3.complex.ComplexFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComplexFormatUtil{ 
public static org.apache.commons.math3.complex.ComplexFormat getInstance(){
return ComplexFormat.getInstance();
}
public static org.apache.commons.math3.complex.ComplexFormat getInstance(java.util.Locale p0){
return ComplexFormat.getInstance(p0);
}
public static org.apache.commons.math3.complex.ComplexFormat getInstance(java.lang.String p0,java.util.Locale p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException{
return ComplexFormat.getInstance(p0,p1);
}
}
