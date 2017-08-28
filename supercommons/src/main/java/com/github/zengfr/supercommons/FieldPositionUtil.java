package com.github.zengfr.supercommons;
import org.apache.commons.math3.util.CompositeFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FieldPositionUtil{ 
public static java.lang.StringBuffer formatDouble(double p0,java.text.NumberFormat p1,java.lang.StringBuffer p2,java.text.FieldPosition p3){
return CompositeFormat.formatDouble(p0,p1,p2,p3);
}
}
