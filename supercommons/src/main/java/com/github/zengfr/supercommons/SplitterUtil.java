package com.zengfr.supercommons;
import com.google.common.base.Splitter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SplitterUtil{ 
public static com.google.common.base.Splitter on(java.util.regex.Pattern p0){
return Splitter.on(p0);
}
public static com.google.common.base.Splitter on(char p0){
return Splitter.on(p0);
}
public static com.google.common.base.Splitter on(java.lang.String p0){
return Splitter.on(p0);
}
public static com.google.common.base.Splitter on(com.google.common.base.CharMatcher p0){
return Splitter.on(p0);
}
public static com.google.common.base.Splitter onPattern(java.lang.String p0){
return Splitter.onPattern(p0);
}
public static com.google.common.base.Splitter fixedLength(int p0){
return Splitter.fixedLength(p0);
}
}
