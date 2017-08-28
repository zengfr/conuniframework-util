package com.github.zengfr.supercommons;
import org.apache.commons.lang3.CharSet;
import it.unimi.dsi.fastutil.chars.CharSets;
import org.apache.commons.lang.CharSet;
import org.apache.commons.lang.CharSetUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSetUtil{ 
public static org.apache.commons.lang3.CharSet getInstance(java.lang.String... p0){
return CharSet.getInstance(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSet singleton(java.lang.Character p0){
return CharSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSet singleton(char p0){
return CharSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSet unmodifiable(it.unimi.dsi.fastutil.chars.CharSet p0){
return CharSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSet synchronize(it.unimi.dsi.fastutil.chars.CharSet p0){
return CharSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.CharSet synchronize(it.unimi.dsi.fastutil.chars.CharSet p0,java.lang.Object p1){
return CharSets.synchronize(p0,p1);
}
public static org.apache.commons.lang.CharSet getInstance(java.lang.String p0){
return CharSet.getInstance(p0);
}
public static org.apache.commons.lang.CharSet getInstance(java.lang.String[] p0){
return CharSet.getInstance(p0);
}
public static org.apache.commons.lang.CharSet evaluateSet(java.lang.String[] p0){
return CharSetUtils.evaluateSet(p0);
}
}
