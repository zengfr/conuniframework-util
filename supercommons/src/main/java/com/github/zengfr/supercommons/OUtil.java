package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OUtil{ 
/**
*public static <I,O> org.apache.commons.collections4.Transformer<I, O> org.apache.commons.collections4.TransformerUtils.constantTransformer(O)
*/ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> constantTransformer(O p0){
	return org.apache.commons.collections4.TransformerUtils.constantTransformer(p0);
}
/**
*public static <O> int org.apache.commons.collections4.CollectionUtils.cardinality(O,java.lang.Iterable<? super O>)
*/ 
public static <O> int cardinality(O p0,java.lang.Iterable<? super O> p1){
	return org.apache.commons.collections4.CollectionUtils.cardinality(p0,p1);
}
}
