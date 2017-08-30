package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClosureArrayUtil{ 
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.chainedClosure(org.apache.commons.collections.Closure[])
*/ 
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure... p0){
	return org.apache.commons.collections.ClosureUtils.chainedClosure(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.ChainedClosure.getInstance(org.apache.commons.collections.Closure[])
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure... p0){
	return org.apache.commons.collections.functors.ChainedClosure.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.switchClosure(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[])
*/ 
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure... p1){
	return org.apache.commons.collections.ClosureUtils.switchClosure(p0,p1);
}
}
