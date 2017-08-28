package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.longs.LongCollections;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongIterableUtil{ 
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.io.File p0){
return BinIO.asLongIterable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.lang.CharSequence p0){
return BinIO.asLongIterable(p0);
}
public static it.unimi.dsi.fastutil.longs.LongCollection asCollection(it.unimi.dsi.fastutil.longs.LongIterable p0){
return LongCollections.asCollection(p0);
}
}
