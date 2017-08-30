package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatListIteratorUtil{ 
/**
*public static it.unimi.dsi.fastutil.floats.FloatBigListIterator it.unimi.dsi.fastutil.floats.FloatBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatBigListIterators.asBigListIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator asFloatIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatListIterator()
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator getEmptyFloatListIterator(){
	return org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatListIterator();
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.singleton(float)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator singleton(float p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.singleton(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.FloatCollections.singletonFloatListIterator(float)
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator singletonFloatListIterator(float p0){
	return org.apache.commons.collections.primitives.FloatCollections.singletonFloatListIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator)
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator p0){
	return org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(org.apache.commons.collections.primitives.FloatListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.FloatListIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator.wrap(java.util.ListIterator)
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(float[])
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float... p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(float[],int,int)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0,p1,p2);
}
}
