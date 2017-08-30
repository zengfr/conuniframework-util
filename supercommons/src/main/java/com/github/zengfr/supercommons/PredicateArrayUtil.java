package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicateArrayUtil{ 
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.allPredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate allPredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.allPredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.anyPredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate anyPredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.anyPredicate(p0);
}
/**
*public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.SwitchClosure.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Closure[],org.apache.commons.collections.Closure)
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
	return org.apache.commons.collections.functors.SwitchClosure.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.NonePredicate.getInstance(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.functors.NonePredicate.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.SwitchTransformer.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.functors.SwitchTransformer.getInstance(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.nonePredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate nonePredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.nonePredicate(p0);
}
/**
*public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.onePredicate(org.apache.commons.collections.Predicate[])
*/ 
public static org.apache.commons.collections.Predicate onePredicate(org.apache.commons.collections.Predicate... p0){
	return org.apache.commons.collections.PredicateUtils.onePredicate(p0);
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
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[])
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer... p1){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1);
}
}
