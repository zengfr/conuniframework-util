package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanCollections;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanIterableUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanCollection asCollection(it.unimi.dsi.fastutil.booleans.BooleanIterable p0){
return BooleanCollections.asCollection(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.lang.CharSequence p0){
return BinIO.asBooleanIterable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.io.File p0){
return BinIO.asBooleanIterable(p0);
}
}
