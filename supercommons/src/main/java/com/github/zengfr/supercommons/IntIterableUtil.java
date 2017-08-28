package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntCollections;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntIterableUtil{ 
public static it.unimi.dsi.fastutil.ints.IntCollection asCollection(it.unimi.dsi.fastutil.ints.IntIterable p0){
return IntCollections.asCollection(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.io.File p0){
return BinIO.asIntIterable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.lang.CharSequence p0){
return BinIO.asIntIterable(p0);
}
}
