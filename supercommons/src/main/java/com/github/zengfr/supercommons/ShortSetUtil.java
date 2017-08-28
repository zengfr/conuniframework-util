package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortSets;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortSetUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortSet singleton(java.lang.Short p0){
return ShortSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSet singleton(short p0){
return ShortSets.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSet unmodifiable(it.unimi.dsi.fastutil.shorts.ShortSet p0){
return ShortSets.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSet p0){
return ShortSets.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSet p0,java.lang.Object p1){
return ShortSets.synchronize(p0,p1);
}
}
