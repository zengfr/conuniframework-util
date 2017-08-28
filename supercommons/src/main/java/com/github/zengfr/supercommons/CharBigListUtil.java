package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.CharBigLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharBigListUtil{ 
public static it.unimi.dsi.fastutil.chars.CharBigList shuffle(it.unimi.dsi.fastutil.chars.CharBigList p0,java.util.Random p1){
return CharBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharBigList singleton(char p0){
return CharBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigList singleton(java.lang.Object p0){
return CharBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigList unmodifiable(it.unimi.dsi.fastutil.chars.CharBigList p0){
return CharBigLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigList synchronize(it.unimi.dsi.fastutil.chars.CharBigList p0){
return CharBigLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigList synchronize(it.unimi.dsi.fastutil.chars.CharBigList p0,java.lang.Object p1){
return CharBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharBigList asBigList(it.unimi.dsi.fastutil.chars.CharList p0){
return CharBigLists.asBigList(p0);
}
}
