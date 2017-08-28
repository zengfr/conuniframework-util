package com.github.zengfr.supercommons;
import org.apache.commons.collections4.TransformerUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.functors.ConstantTransformer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class OUtil{ 
public static <I,O> org.apache.commons.collections4.Transformer<I, O> constantTransformer(O p0){
return TransformerUtils.constantTransformer(p0);
}
public static <O> int cardinality(O p0,java.lang.Iterable<? super O> p1){
return CollectionUtils.cardinality(p0,p1);
}
}
