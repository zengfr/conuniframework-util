package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class ClassUtil{ 
/**
*{@link org.apache.commons.collections.bag.TypedBag#decorate(org.apache.commons.collections.Bag,java.lang.Class)}
*@see org.apache.commons.collections.bag.TypedBag#decorate(org.apache.commons.collections.Bag,java.lang.Class)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.bag.TypedBag.decorate(org.apache.commons.collections.Bag,java.lang.Class)
*decorate(org.apache.commons.collections.Bag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,java.lang.Class p1){
	return org.apache.commons.collections.bag.TypedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.bag.TypedSortedBag#decorate(org.apache.commons.collections.SortedBag,java.lang.Class)}
*@see org.apache.commons.collections.bag.TypedSortedBag#decorate(org.apache.commons.collections.SortedBag,java.lang.Class)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.bag.TypedSortedBag.decorate(org.apache.commons.collections.SortedBag,java.lang.Class)
*decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
	return org.apache.commons.collections.bag.TypedSortedBag.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.map.TypedSortedMap#decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.map.TypedSortedMap#decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)
*<code>public static java.util.SortedMap org.apache.commons.collections.map.TypedSortedMap.decorate(java.util.SortedMap,java.lang.Class,java.lang.Class)
*decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.map.TypedSortedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.TypedMap#decorate(java.util.Map,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.map.TypedMap#decorate(java.util.Map,java.lang.Class,java.lang.Class)
*<code>public static java.util.Map org.apache.commons.collections.map.TypedMap.decorate(java.util.Map,java.lang.Class,java.lang.Class)
*decorate(java.util.Map p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map decorate(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.map.TypedMap.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,java.lang.Class)}
*@see org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,java.lang.Class)
*<code>public static org.apache.commons.collections.map.MultiValueMap org.apache.commons.collections.map.MultiValueMap.decorate(java.util.Map,java.lang.Class)
*decorate(java.util.Map p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,java.lang.Class p1){
	return org.apache.commons.collections.map.MultiValueMap.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.list.TypedList#decorate(java.util.List,java.lang.Class)}
*@see org.apache.commons.collections.list.TypedList#decorate(java.util.List,java.lang.Class)
*<code>public static java.util.List org.apache.commons.collections.list.TypedList.decorate(java.util.List,java.lang.Class)
*decorate(java.util.List p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List decorate(java.util.List p0,java.lang.Class p1){
	return org.apache.commons.collections.list.TypedList.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.collection.TypedCollection#decorate(java.util.Collection,java.lang.Class)}
*@see org.apache.commons.collections.collection.TypedCollection#decorate(java.util.Collection,java.lang.Class)
*<code>public static java.util.Collection org.apache.commons.collections.collection.TypedCollection.decorate(java.util.Collection,java.lang.Class)
*decorate(java.util.Collection p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection decorate(java.util.Collection p0,java.lang.Class p1){
	return org.apache.commons.collections.collection.TypedCollection.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TypedSortedSet#decorate(java.util.SortedSet,java.lang.Class)}
*@see org.apache.commons.collections.set.TypedSortedSet#decorate(java.util.SortedSet,java.lang.Class)
*<code>public static java.util.SortedSet org.apache.commons.collections.set.TypedSortedSet.decorate(java.util.SortedSet,java.lang.Class)
*decorate(java.util.SortedSet p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet decorate(java.util.SortedSet p0,java.lang.Class p1){
	return org.apache.commons.collections.set.TypedSortedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.set.TypedSet#decorate(java.util.Set,java.lang.Class)}
*@see org.apache.commons.collections.set.TypedSet#decorate(java.util.Set,java.lang.Class)
*<code>public static java.util.Set org.apache.commons.collections.set.TypedSet.decorate(java.util.Set,java.lang.Class)
*decorate(java.util.Set p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set decorate(java.util.Set p0,java.lang.Class p1){
	return org.apache.commons.collections.set.TypedSet.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.TypedBuffer#decorate(org.apache.commons.collections.Buffer,java.lang.Class)}
*@see org.apache.commons.collections.buffer.TypedBuffer#decorate(org.apache.commons.collections.Buffer,java.lang.Class)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.TypedBuffer.decorate(org.apache.commons.collections.Buffer,java.lang.Class)
*decorate(org.apache.commons.collections.Buffer p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
	return org.apache.commons.collections.buffer.TypedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.crypto.jna.OpenSslJna#getCipherClass()}
*@see org.apache.commons.crypto.jna.OpenSslJna#getCipherClass()
*<code>public static java.lang.Class<? extends org.apache.commons.crypto.cipher.CryptoCipher> org.apache.commons.crypto.jna.OpenSslJna.getCipherClass()
*getCipherClass()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<? extends org.apache.commons.crypto.cipher.CryptoCipher> getCipherClass(){
	return org.apache.commons.crypto.jna.OpenSslJna.getCipherClass();
}
/**
*{@link org.apache.commons.crypto.utils.ReflectionUtils#getClassByName(java.lang.String)}
*@see org.apache.commons.crypto.utils.ReflectionUtils#getClassByName(java.lang.String)
*<code>public static java.lang.Class<?> org.apache.commons.crypto.utils.ReflectionUtils.getClassByName(java.lang.String) throws java.lang.ClassNotFoundException
*getClassByName(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getClassByName(java.lang.String p0) throws java.lang.ClassNotFoundException{
	return org.apache.commons.crypto.utils.ReflectionUtils.getClassByName(p0);
}
/**
*{@link org.apache.commons.collections.functors.InstanceofPredicate#getInstance(java.lang.Class)}
*@see org.apache.commons.collections.functors.InstanceofPredicate#getInstance(java.lang.Class)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.functors.InstanceofPredicate.getInstance(java.lang.Class)
*getInstance(java.lang.Class p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate getInstance(java.lang.Class p0){
	return org.apache.commons.collections.functors.InstanceofPredicate.getInstance(p0);
}
/**
*{@link org.apache.commons.collections.functors.InstantiateFactory#getInstance(java.lang.Class,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.functors.InstantiateFactory#getInstance(java.lang.Class,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.functors.InstantiateFactory.getInstance(java.lang.Class,java.lang.Class[],java.lang.Object[])
*getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InstantiateFactory.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getPrimitiveType(java.lang.Class<?>)}
*@see org.apache.commons.beanutils.MethodUtils#getPrimitiveType(java.lang.Class<?>)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.MethodUtils.getPrimitiveType(java.lang.Class<?>)
*getPrimitiveType(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getPrimitiveType(java.lang.Class<?> p0){
	return org.apache.commons.beanutils.MethodUtils.getPrimitiveType(p0);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#getPrimitiveWrapper(java.lang.Class<?>)}
*@see org.apache.commons.beanutils.MethodUtils#getPrimitiveWrapper(java.lang.Class<?>)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.MethodUtils.getPrimitiveWrapper(java.lang.Class<?>)
*getPrimitiveWrapper(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getPrimitiveWrapper(java.lang.Class<?> p0){
	return org.apache.commons.beanutils.MethodUtils.getPrimitiveWrapper(p0);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getPropertyEditorClass(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#getPropertyEditorClass(java.lang.Object,java.lang.String)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.PropertyUtils.getPropertyEditorClass(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getPropertyEditorClass(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getPropertyEditorClass(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.PropertyUtils.getPropertyEditorClass(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#getPropertyType(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#getPropertyType(java.lang.Object,java.lang.String)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.PropertyUtils.getPropertyType(java.lang.Object,java.lang.String) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException
*getPropertyType(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getPropertyType(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
	return org.apache.commons.beanutils.PropertyUtils.getPropertyType(p0,p1);
}
/**
*{@link org.apache.commons.crypto.jna.OpenSslJna#getRandomClass()}
*@see org.apache.commons.crypto.jna.OpenSslJna#getRandomClass()
*<code>public static java.lang.Class<? extends org.apache.commons.crypto.random.CryptoRandom> org.apache.commons.crypto.jna.OpenSslJna.getRandomClass()
*getRandomClass()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<? extends org.apache.commons.crypto.random.CryptoRandom> getRandomClass(){
	return org.apache.commons.crypto.jna.OpenSslJna.getRandomClass();
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#getRawType(java.lang.reflect.Type,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#getRawType(java.lang.reflect.Type,java.lang.reflect.Type)
*<code>public static java.lang.Class<?> org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.Type,java.lang.reflect.Type)
*getRawType(java.lang.reflect.Type p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getRawType(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.getRawType(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#getSetterType(java.lang.reflect.Method)}
*@see org.codehaus.plexus.util.ReflectionUtils#getSetterType(java.lang.reflect.Method)
*<code>public static java.lang.Class<?> org.codehaus.plexus.util.ReflectionUtils.getSetterType(java.lang.reflect.Method)
*getSetterType(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> getSetterType(java.lang.reflect.Method p0){
	return org.codehaus.plexus.util.ReflectionUtils.getSetterType(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class,int)}
*@see org.codehaus.plexus.util.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class,int)
*<code>public static int org.codehaus.plexus.util.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class,int)
*indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1,int p2){
	return org.codehaus.plexus.util.ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class)}
*@see org.codehaus.plexus.util.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class)
*<code>public static int org.codehaus.plexus.util.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class)
*indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1){
	return org.codehaus.plexus.util.ExceptionUtils.indexOfThrowable(p0,p1);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#instanceofPredicate(java.lang.Class)}
*@see org.apache.commons.collections.PredicateUtils#instanceofPredicate(java.lang.Class)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.instanceofPredicate(java.lang.Class)
*instanceofPredicate(java.lang.Class p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate instanceofPredicate(java.lang.Class p0){
	return org.apache.commons.collections.PredicateUtils.instanceofPredicate(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class)}
*@see org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class)
*instantiateFactory(java.lang.Class p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0);
}
/**
*{@link org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.FactoryUtils#instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Factory org.apache.commons.collections.FactoryUtils.instantiateFactory(java.lang.Class,java.lang.Class[],java.lang.Object[])
*instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.FactoryUtils.instantiateFactory(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map,java.lang.Class)}
*@see org.apache.commons.collections.MapUtils#multiValueMap(java.util.Map,java.lang.Class)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.multiValueMap(java.util.Map,java.lang.Class)
*multiValueMap(java.util.Map p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map multiValueMap(java.util.Map p0,java.lang.Class p1){
	return org.apache.commons.collections.MapUtils.multiValueMap(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#primitiveToWrapper(java.lang.Class<T>)}
*@see org.apache.commons.beanutils.ConvertUtils#primitiveToWrapper(java.lang.Class<T>)
*<code>public static <T> java.lang.Class<T> org.apache.commons.beanutils.ConvertUtils.primitiveToWrapper(java.lang.Class<T>)
*primitiveToWrapper(java.lang.Class<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.lang.Class<T> primitiveToWrapper(java.lang.Class<T> p0){
	return org.apache.commons.beanutils.ConvertUtils.primitiveToWrapper(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#primitiveToWrapper(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#primitiveToWrapper(java.lang.Class<?>)
*<code>public static java.lang.Class<?> org.apache.commons.lang3.ClassUtils.primitiveToWrapper(java.lang.Class<?>)
*primitiveToWrapper(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> primitiveToWrapper(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.primitiveToWrapper(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#toArray(java.util.Iterator,java.lang.Class)}
*@see org.apache.commons.collections.IteratorUtils#toArray(java.util.Iterator,java.lang.Class)
*<code>public static java.lang.Object[] org.apache.commons.collections.IteratorUtils.toArray(java.util.Iterator,java.lang.Class)
*toArray(java.util.Iterator p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object[] toArray(java.util.Iterator p0,java.lang.Class p1){
	return org.apache.commons.collections.IteratorUtils.toArray(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#toNonPrimitiveClass(java.lang.Class<?>)}
*@see org.apache.commons.beanutils.MethodUtils#toNonPrimitiveClass(java.lang.Class<?>)
*<code>public static java.lang.Class<?> org.apache.commons.beanutils.MethodUtils.toNonPrimitiveClass(java.lang.Class<?>)
*toNonPrimitiveClass(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> toNonPrimitiveClass(java.lang.Class<?> p0){
	return org.apache.commons.beanutils.MethodUtils.toNonPrimitiveClass(p0);
}
/**
*{@link org.apache.commons.collections.BagUtils#typedBag(org.apache.commons.collections.Bag,java.lang.Class)}
*@see org.apache.commons.collections.BagUtils#typedBag(org.apache.commons.collections.Bag,java.lang.Class)
*<code>public static org.apache.commons.collections.Bag org.apache.commons.collections.BagUtils.typedBag(org.apache.commons.collections.Bag,java.lang.Class)
*typedBag(org.apache.commons.collections.Bag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Bag typedBag(org.apache.commons.collections.Bag p0,java.lang.Class p1){
	return org.apache.commons.collections.BagUtils.typedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#typedBuffer(org.apache.commons.collections.Buffer,java.lang.Class)}
*@see org.apache.commons.collections.BufferUtils#typedBuffer(org.apache.commons.collections.Buffer,java.lang.Class)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.typedBuffer(org.apache.commons.collections.Buffer,java.lang.Class)
*typedBuffer(org.apache.commons.collections.Buffer p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer typedBuffer(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
	return org.apache.commons.collections.BufferUtils.typedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#typedCollection(java.util.Collection,java.lang.Class)}
*@see org.apache.commons.collections.CollectionUtils#typedCollection(java.util.Collection,java.lang.Class)
*<code>public static java.util.Collection org.apache.commons.collections.CollectionUtils.typedCollection(java.util.Collection,java.lang.Class)
*typedCollection(java.util.Collection p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection typedCollection(java.util.Collection p0,java.lang.Class p1){
	return org.apache.commons.collections.CollectionUtils.typedCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#typedList(java.util.List,java.lang.Class)}
*@see org.apache.commons.collections.ListUtils#typedList(java.util.List,java.lang.Class)
*<code>public static java.util.List org.apache.commons.collections.ListUtils.typedList(java.util.List,java.lang.Class)
*typedList(java.util.List p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List typedList(java.util.List p0,java.lang.Class p1){
	return org.apache.commons.collections.ListUtils.typedList(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#typedMap(java.util.Map,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.MapUtils#typedMap(java.util.Map,java.lang.Class,java.lang.Class)
*<code>public static java.util.Map org.apache.commons.collections.MapUtils.typedMap(java.util.Map,java.lang.Class,java.lang.Class)
*typedMap(java.util.Map p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Map typedMap(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.MapUtils.typedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.SetUtils#typedSet(java.util.Set,java.lang.Class)}
*@see org.apache.commons.collections.SetUtils#typedSet(java.util.Set,java.lang.Class)
*<code>public static java.util.Set org.apache.commons.collections.SetUtils.typedSet(java.util.Set,java.lang.Class)
*typedSet(java.util.Set p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Set typedSet(java.util.Set p0,java.lang.Class p1){
	return org.apache.commons.collections.SetUtils.typedSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.BagUtils#typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)}
*@see org.apache.commons.collections.BagUtils#typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)
*<code>public static org.apache.commons.collections.SortedBag org.apache.commons.collections.BagUtils.typedSortedBag(org.apache.commons.collections.SortedBag,java.lang.Class)
*typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.SortedBag typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
	return org.apache.commons.collections.BagUtils.typedSortedBag(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)}
*@see org.apache.commons.collections.MapUtils#typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)
*<code>public static java.util.SortedMap org.apache.commons.collections.MapUtils.typedSortedMap(java.util.SortedMap,java.lang.Class,java.lang.Class)
*typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedMap typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
	return org.apache.commons.collections.MapUtils.typedSortedMap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.SetUtils#typedSortedSet(java.util.SortedSet,java.lang.Class)}
*@see org.apache.commons.collections.SetUtils#typedSortedSet(java.util.SortedSet,java.lang.Class)
*<code>public static java.util.SortedSet org.apache.commons.collections.SetUtils.typedSortedSet(java.util.SortedSet,java.lang.Class)
*typedSortedSet(java.util.SortedSet p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.SortedSet typedSortedSet(java.util.SortedSet p0,java.lang.Class p1){
	return org.apache.commons.collections.SetUtils.typedSortedSet(p0,p1);
}
/**
*{@link com.google.common.primitives.Primitives#unwrap(java.lang.Class<T>)}
*@see com.google.common.primitives.Primitives#unwrap(java.lang.Class<T>)
*<code>public static <T> java.lang.Class<T> com.google.common.primitives.Primitives.unwrap(java.lang.Class<T>)
*unwrap(java.lang.Class<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.lang.Class<T> unwrap(java.lang.Class<T> p0){
	return com.google.common.primitives.Primitives.unwrap(p0);
}
/**
*{@link com.google.common.primitives.Primitives#wrap(java.lang.Class<T>)}
*@see com.google.common.primitives.Primitives#wrap(java.lang.Class<T>)
*<code>public static <T> java.lang.Class<T> com.google.common.primitives.Primitives.wrap(java.lang.Class<T>)
*wrap(java.lang.Class<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.lang.Class<T> wrap(java.lang.Class<T> p0){
	return com.google.common.primitives.Primitives.wrap(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#wrapperToPrimitive(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#wrapperToPrimitive(java.lang.Class<?>)
*<code>public static java.lang.Class<?> org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(java.lang.Class<?>)
*wrapperToPrimitive(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?> wrapperToPrimitive(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(p0);
}
}
