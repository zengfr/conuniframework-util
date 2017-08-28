package com.github.zengfr.supercommons;
import org.apache.commons.lang3.text.translate.JavaUnicodeEscaper;
import org.apache.commons.text.translate.JavaUnicodeEscaper;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class JavaUnicodeEscaperUtil{ 
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper above(int p0){
return JavaUnicodeEscaper.above(p0);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper below(int p0){
return JavaUnicodeEscaper.below(p0);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper between(int p0,int p1){
return JavaUnicodeEscaper.between(p0,p1);
}
public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper outsideOf(int p0,int p1){
return JavaUnicodeEscaper.outsideOf(p0,p1);
}
}
