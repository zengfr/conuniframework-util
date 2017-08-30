package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MutableClassToInstanceMapUtil{ 
/**
*public static <B> com.google.common.collect.MutableClassToInstanceMap<B> com.google.common.collect.MutableClassToInstanceMap.create()
*/ 
public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create(){
	return com.google.common.collect.MutableClassToInstanceMap.create();
}
/**
*public static <B> com.google.common.collect.MutableClassToInstanceMap<B> com.google.common.collect.MutableClassToInstanceMap.create(java.util.Map<java.lang.Class<? extends B>, B>)
*/ 
public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create(java.util.Map<java.lang.Class<? extends B>, B> p0){
	return com.google.common.collect.MutableClassToInstanceMap.create(p0);
}
}
