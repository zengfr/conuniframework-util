package com.zengfr.supercommons;
import org.apache.commons.math3.util.MathUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LocalizableUtil{ 
public static void checkNotNull(java.lang.Object p0,org.apache.commons.math3.exception.util.Localizable p1,java.lang.Object... p2) throws org.apache.commons.math3.exception.NullArgumentException{
 MathUtils.checkNotNull(p0,p1,p2);
}
}
