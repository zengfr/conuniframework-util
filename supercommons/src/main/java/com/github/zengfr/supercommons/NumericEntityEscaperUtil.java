package com.github.zengfr.supercommons;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.text.translate.NumericEntityEscaper;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NumericEntityEscaperUtil{ 
public static org.apache.commons.lang3.text.translate.NumericEntityEscaper above(int p0){
return NumericEntityEscaper.above(p0);
}
public static org.apache.commons.lang3.text.translate.NumericEntityEscaper below(int p0){
return NumericEntityEscaper.below(p0);
}
public static org.apache.commons.lang3.text.translate.NumericEntityEscaper between(int p0,int p1){
return NumericEntityEscaper.between(p0,p1);
}
public static org.apache.commons.lang3.text.translate.NumericEntityEscaper outsideOf(int p0,int p1){
return NumericEntityEscaper.outsideOf(p0,p1);
}
}
