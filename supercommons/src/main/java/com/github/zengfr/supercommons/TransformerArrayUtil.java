package com.github.zengfr.supercommons;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.SwitchTransformer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformerArrayUtil{ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1){
return TransformerUtils.switchTransformer(p0,p1);
}
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer chainedTransformer(org.apache.commons.collections.Transformer[] p0){
return TransformerUtils.chainedTransformer(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Transformer[] p0){
return ChainedTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
return SwitchTransformer.getInstance(p0,p1,p2);
}
}
