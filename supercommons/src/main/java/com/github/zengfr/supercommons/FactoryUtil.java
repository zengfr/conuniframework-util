package com.zengfr.supercommons;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.map.DefaultedMap;
import org.apache.commons.collections.map.LazySortedMap;
import org.apache.commons.collections.map.LazyMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.collections.list.LazyList;
import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.functors.PrototypeFactory;
import org.apache.commons.collections.functors.ConstantFactory;
import org.apache.commons.collections.functors.ExceptionFactory;
import org.apache.commons.collections.functors.FactoryTransformer;
import org.apache.commons.collections.functors.InstantiateFactory;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.collections4.functors.PrototypeFactory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.apache.commons.collections4.functors.InstantiateFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FactoryUtil{ 
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Factory p0){
return TransformerUtils.asTransformer(p0);
}
public static java.util.SortedMap lazySortedMap(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
return MapUtils.lazySortedMap(p0,p1);
}
public static java.util.Map lazyMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
return MapUtils.lazyMap(p0,p1);
}
public static java.util.Map multiValueMap(java.util.Map p0,org.apache.commons.collections.Factory p1){
return MapUtils.multiValueMap(p0,p1);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Factory p1){
return DefaultedMap.decorate(p0,p1);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Factory p1){
return LazySortedMap.decorate(p0,p1);
}
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Factory p1){
return LazyList.decorate(p0,p1);
}
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0){
return FactoryUtils.instantiateFactory(p0);
}
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object[] p2){
return FactoryUtils.instantiateFactory(p0,p1,p2);
}
public static org.apache.commons.collections.Factory constantFactory(java.lang.Object p0){
return FactoryUtils.constantFactory(p0);
}
public static org.apache.commons.collections.Factory exceptionFactory(){
return FactoryUtils.exceptionFactory();
}
public static org.apache.commons.collections.Factory prototypeFactory(java.lang.Object p0){
return FactoryUtils.prototypeFactory(p0);
}
public static org.apache.commons.collections.Factory nullFactory(){
return FactoryUtils.nullFactory();
}
public static org.apache.commons.collections.Factory getInstance(java.lang.Object p0){
return PrototypeFactory.getInstance(p0);
}
public static org.apache.commons.collections.Factory getInstance(){
return ExceptionFactory.getInstance();
}
public static org.apache.commons.collections.Transformer getInstance(org.apache.commons.collections.Factory p0){
return FactoryTransformer.getInstance(p0);
}
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object[] p2){
return InstantiateFactory.getInstance(p0,p1,p2);
}
public static java.util.List lazyList(java.util.List p0,org.apache.commons.collections.Factory p1){
return ListUtils.lazyList(p0,p1);
}
public static <T> org.apache.commons.collections4.Factory<T> instantiateFactory(java.lang.Class<T> p0){
return FactoryUtils.instantiateFactory(p0);
}
public static <T> org.apache.commons.collections4.Factory<T> instantiateFactory(java.lang.Class<T> p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return FactoryUtils.instantiateFactory(p0,p1,p2);
}
public static <T> org.apache.commons.collections4.Factory<T> constantFactory(T p0){
return FactoryUtils.constantFactory(p0);
}
public static <T> org.apache.commons.collections4.Factory<T> prototypeFactory(T p0){
return FactoryUtils.prototypeFactory(p0);
}
}
