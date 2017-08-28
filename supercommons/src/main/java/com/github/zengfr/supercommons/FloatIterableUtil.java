package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.FloatCollections;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatIterableUtil{ 
public static it.unimi.dsi.fastutil.floats.FloatCollection asCollection(it.unimi.dsi.fastutil.floats.FloatIterable p0){
return FloatCollections.asCollection(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.io.File p0){
return BinIO.asFloatIterable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.lang.CharSequence p0){
return BinIO.asFloatIterable(p0);
}
}
