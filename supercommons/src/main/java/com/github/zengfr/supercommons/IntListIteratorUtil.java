package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntListIteratorUtil{ 
/**
*public static it.unimi.dsi.fastutil.ints.IntBigListIterator it.unimi.dsi.fastutil.ints.IntBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntBigListIterator asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntBigListIterators.asBigListIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator asIntIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.fromTo(int,int)
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator fromTo(int p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.fromTo(p0,p1);
}
/**
*public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.IntCollections.getEmptyIntListIterator()
*/ 
public static org.apache.commons.collections.primitives.IntListIterator getEmptyIntListIterator(){
	return org.apache.commons.collections.primitives.IntCollections.getEmptyIntListIterator();
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.singleton(int)
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator singleton(int p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.singleton(p0);
}
/**
*public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.IntCollections.singletonIntListIterator(int)
*/ 
public static org.apache.commons.collections.primitives.IntListIterator singletonIntListIterator(int p0){
	return org.apache.commons.collections.primitives.IntCollections.singletonIntListIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.IntCollections.unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator)
*/ 
public static org.apache.commons.collections.primitives.IntListIterator unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator p0){
	return org.apache.commons.collections.primitives.IntCollections.unmodifiableIntListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(org.apache.commons.collections.primitives.IntListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.IntListIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator.wrap(java.util.ListIterator)
*/ 
public static org.apache.commons.collections.primitives.IntListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(int[],int,int)
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(int[])
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int... p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0);
}
}
