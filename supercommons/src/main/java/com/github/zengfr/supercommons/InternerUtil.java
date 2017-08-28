package com.github.zengfr.supercommons;
import com.google.common.collect.Interners;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class InternerUtil{ 
public static <E> com.google.common.collect.Interner<E> newWeakInterner(){
return Interners.newWeakInterner();
}
public static <E> com.google.common.collect.Interner<E> newStrongInterner(){
return Interners.newStrongInterner();
}
}
