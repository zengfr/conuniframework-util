package com.zengfr.supercommons;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.functors.SwitchClosure;
import org.apache.commons.collections.functors.NonePredicate;
import org.apache.commons.collections.functors.OnePredicate;
import org.apache.commons.collections.functors.AnyPredicate;
import org.apache.commons.collections.functors.SwitchTransformer;
import org.apache.commons.collections.functors.AllPredicate;
import org.apache.commons.collections.PredicateUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicateArrayUtil{ 
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1){
return TransformerUtils.switchTransformer(p0,p1);
}
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1){
return ClosureUtils.switchClosure(p0,p1);
}
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
return ClosureUtils.switchClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
return SwitchClosure.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate[] p0){
return NonePredicate.getInstance(p0);
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Transformer[] p1,org.apache.commons.collections.Transformer p2){
return SwitchTransformer.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate nonePredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.nonePredicate(p0);
}
public static org.apache.commons.collections.Predicate onePredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.onePredicate(p0);
}
public static org.apache.commons.collections.Predicate allPredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.allPredicate(p0);
}
public static org.apache.commons.collections.Predicate anyPredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.anyPredicate(p0);
}
}
