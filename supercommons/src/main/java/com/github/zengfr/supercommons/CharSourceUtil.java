package com.github.zengfr.supercommons;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import com.google.common.io.Resources;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSourceUtil{ 
public static com.google.common.io.CharSource concat(.. p0){
return CharSource.concat(p0);
}
public static com.google.common.io.CharSource concat(java.util.Iterator<? extends com.google.common.io.CharSource> p0){
return CharSource.concat(p0);
}
public static com.google.common.io.CharSource concat(java.lang.Iterable<? extends com.google.common.io.CharSource> p0){
return CharSource.concat(p0);
}
public static com.google.common.io.CharSource wrap(java.lang.CharSequence p0){
return CharSource.wrap(p0);
}
public static com.google.common.io.CharSource empty(){
return CharSource.empty();
}
public static com.google.common.io.CharSource asCharSource(java.io.File p0,java.nio.charset.Charset p1){
return Files.asCharSource(p0,p1);
}
public static com.google.common.io.CharSource asCharSource(java.net.URL p0,java.nio.charset.Charset p1){
return Resources.asCharSource(p0,p1);
}
}
