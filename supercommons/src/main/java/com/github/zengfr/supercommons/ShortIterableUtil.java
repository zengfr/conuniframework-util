package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import it.unimi.dsi.fastutil.shorts.ShortCollections;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortIterableUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.io.File p0){
return BinIO.asShortIterable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.lang.CharSequence p0){
return BinIO.asShortIterable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortCollection asCollection(it.unimi.dsi.fastutil.shorts.ShortIterable p0){
return ShortCollections.asCollection(p0);
}
}
