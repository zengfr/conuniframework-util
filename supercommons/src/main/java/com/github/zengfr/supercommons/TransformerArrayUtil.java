package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformerArrayUtil{ 
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.chainedTransformer(org.apache.commons.collections.Transformer[])
*/ 
public static org.apache.commons.collections.Transformer chainedTransformer(org.apache.commons.collections.Transformer[] p0){
	return org.apache.commons.collections.TransformerUtils.chainedTransformer(p0);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[])
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.switchTransformer(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.TransformerUtils.switchTransformer(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.ChainedTransformer.getInstance(org.apache.commons.collections.Transformer[])
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Transformer[] p0){
	return org.apache.commons.collections.functors.ChainedTransformer.getInstance(p0);
}
/**
*public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.SwitchTransformer.getInstance(org.apache.commons.collections.Predicate[],org.apache.commons.collections.Transformer[],org.apache.commons.collections.Transformer)
*/ 
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
	return org.apache.commons.collections.functors.SwitchTransformer.getInstance(p0,p1,p2);
}
}
