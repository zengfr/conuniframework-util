package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TUtil{ 
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.CONST(T)
*/ 
public static <T> T CONST(T p0){
	return org.apache.commons.lang3.ObjectUtils.CONST(p0);
}
/**
*public static <T> T[] org.apache.commons.lang3.ArrayUtils.add(T[],int,T)
*/ 
public static <T> T[] add(T[] p0,int p1,T p2){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1,p2);
}
/**
*public static <T> T[] org.apache.commons.lang3.ArrayUtils.add(T[],T)
*/ 
public static <T> T[] add(T[] p0,T p1){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1);
}
/**
*public static <T> boolean org.apache.commons.collections4.CollectionUtils.addIgnoreNull(java.util.Collection<T>,T)
*/ 
public static <T> boolean addIgnoreNull(java.util.Collection<T> p0,T p1){
	return org.apache.commons.collections4.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.between(T,T)
*/ 
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> between(T p0,T p1){
	return org.apache.commons.lang3.Range.between(p0,p1);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.between(T,T,java.util.Comparator<T>)
*/ 
public static <T> org.apache.commons.lang3.Range<T> between(T p0,T p1,java.util.Comparator<T> p2){
	return org.apache.commons.lang3.Range.between(p0,p1,p2);
}
/**
*public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.String,java.lang.Object...)
*/ 
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1,p2);
}
/**
*public static <T> T com.google.common.base.Preconditions.checkNotNull(T,java.lang.Object)
*/ 
public static <T> T checkNotNull(T p0,java.lang.Object p1){
	return com.google.common.base.Preconditions.checkNotNull(p0,p1);
}
/**
*public static <T> T com.google.common.base.Preconditions.checkNotNull(T)
*/ 
public static <T> T checkNotNull(T p0){
	return com.google.common.base.Preconditions.checkNotNull(p0);
}
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.clone(T)
*/ 
public static <T> T clone(T p0){
	return org.apache.commons.lang3.ObjectUtils.clone(p0);
}
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.cloneIfPossible(T)
*/ 
public static <T> T cloneIfPossible(T p0){
	return org.apache.commons.lang3.ObjectUtils.cloneIfPossible(p0);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T,java.util.Comparator<T>,org.apache.commons.collections4.functors.ComparatorPredicate$Criterion)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1,Criterion p2){
	return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(p0,p1,p2);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(T,java.util.Comparator<T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1){
	return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(p0,p1);
}
/**
*public static <T> int org.apache.commons.lang3.ObjectUtils.compare(T,T,boolean)
*/ 
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1,boolean p2){
	return org.apache.commons.lang3.ObjectUtils.compare(p0,p1,p2);
}
/**
*public static <T> int org.apache.commons.lang3.ObjectUtils.compare(T,T)
*/ 
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1){
	return org.apache.commons.lang3.ObjectUtils.compare(p0,p1);
}
/**
*public static <T> T[] com.google.common.collect.ObjectArrays.concat(T[],T)
*/ 
public static <T> T[] concat(T[] p0,T p1){
	return com.google.common.collect.ObjectArrays.concat(p0,p1);
}
/**
*public static <T> T[] com.google.common.collect.ObjectArrays.concat(T,T[])
*/ 
public static <T> T[] concat(T p0,T... p1){
	return com.google.common.collect.ObjectArrays.concat(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.constantFactory(T)
*/ 
public static <T> org.apache.commons.collections4.Factory<T> constantFactory(T p0){
	return org.apache.commons.collections4.FactoryUtils.constantFactory(p0);
}
/**
*public static <T> java.util.concurrent.Future<T> org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(T)
*/ 
public static <T> java.util.concurrent.Future<T> constantFuture(T p0){
	return org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(p0);
}
/**
*public static <T> T org.apache.commons.lang3.StringUtils.defaultIfBlank(T,T)
*/ 
public static <T extends java.lang.CharSequence > T defaultIfBlank(T p0,T p1){
	return org.apache.commons.lang3.StringUtils.defaultIfBlank(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.StringUtils.defaultIfEmpty(T,T)
*/ 
public static <T extends java.lang.CharSequence > T defaultIfEmpty(T p0,T p1){
	return org.apache.commons.lang3.StringUtils.defaultIfEmpty(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.ObjectUtils.defaultIfNull(T,T)
*/ 
public static <T> T defaultIfNull(T p0,T p1){
	return org.apache.commons.lang3.ObjectUtils.defaultIfNull(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T,org.apache.commons.collections4.Equator<T>)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0,org.apache.commons.collections4.Equator<T> p1){
	return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0){
	return org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(p0);
}
/**
*public static <T> com.google.common.base.Predicate<T> com.google.common.base.Predicates.equalTo(T)
*/ 
public static <T> com.google.common.base.Predicate<T> equalTo(T p0){
	return com.google.common.base.Predicates.equalTo(p0);
}
/**
*public static <T> void org.apache.commons.lang3.Validate.exclusiveBetween(T,T,java.lang.Comparable<T>)
*/ 
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2){
	 org.apache.commons.lang3.Validate.exclusiveBetween(p0,p1,p2);
}
/**
*public static <T> void org.apache.commons.lang3.Validate.exclusiveBetween(T,T,java.lang.Comparable<T>,java.lang.String,java.lang.Object...)
*/ 
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
	 org.apache.commons.lang3.Validate.exclusiveBetween(p0,p1,p2,p3,p4);
}
/**
*public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.explicit(T,T...)
*/ 
public static <T> com.google.common.collect.Ordering<T> explicit(T p0,T... p1){
	return com.google.common.collect.Ordering.explicit(p0,p1);
}
/**
*public static <T> T com.google.common.collect.Iterables.find(java.lang.Iterable<? extends T>,com.google.common.base.Predicate<? super T>,T)
*/ 
public static <T> T find(java.lang.Iterable<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
	return com.google.common.collect.Iterables.find(p0,p1,p2);
}
/**
*public static <T> T com.google.common.collect.Iterators.find(java.util.Iterator<? extends T>,com.google.common.base.Predicate<? super T>,T)
*/ 
public static <T> T find(java.util.Iterator<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
	return com.google.common.collect.Iterators.find(p0,p1,p2);
}
/**
*public static <T> T com.google.common.base.MoreObjects.firstNonNull(T,T)
*/ 
public static <T> T firstNonNull(T p0,T p1){
	return com.google.common.base.MoreObjects.firstNonNull(p0,p1);
}
/**
*public static <E,T> int org.apache.commons.collections4.IterableUtils.frequency(java.lang.Iterable<E>,T)
*/ 
public static <E,T> int frequency(java.lang.Iterable<E> p0,T p1){
	return org.apache.commons.collections4.IterableUtils.frequency(p0,p1);
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.fromNullable(T)
*/ 
public static <T> com.google.common.base.Optional<T> fromNullable(T p0){
	return com.google.common.base.Optional.fromNullable(p0);
}
/**
*public static <T> T com.google.common.collect.Iterables.getFirst(java.lang.Iterable<? extends T>,T)
*/ 
public static <T> T getFirst(java.lang.Iterable<? extends T> p0,T p1){
	return com.google.common.collect.Iterables.getFirst(p0,p1);
}
/**
*public static <T> T com.google.common.collect.Iterables.getLast(java.lang.Iterable<? extends T>,T)
*/ 
public static <T> T getLast(java.lang.Iterable<? extends T> p0,T p1){
	return com.google.common.collect.Iterables.getLast(p0,p1);
}
/**
*public static <T> T com.google.common.collect.Iterators.getLast(java.util.Iterator<? extends T>,T)
*/ 
public static <T> T getLast(java.util.Iterator<? extends T> p0,T p1){
	return com.google.common.collect.Iterators.getLast(p0,p1);
}
/**
*public static <T> T com.google.common.collect.Iterators.getNext(java.util.Iterator<? extends T>,T)
*/ 
public static <T> T getNext(java.util.Iterator<? extends T> p0,T p1){
	return com.google.common.collect.Iterators.getNext(p0,p1);
}
/**
*public static <T> T com.google.common.collect.Iterables.getOnlyElement(java.lang.Iterable<? extends T>,T)
*/ 
public static <T> T getOnlyElement(java.lang.Iterable<? extends T> p0,T p1){
	return com.google.common.collect.Iterables.getOnlyElement(p0,p1);
}
/**
*public static <T> T com.google.common.collect.Iterators.getOnlyElement(java.util.Iterator<? extends T>,T)
*/ 
public static <T> T getOnlyElement(java.util.Iterator<? extends T> p0,T p1){
	return com.google.common.collect.Iterators.getOnlyElement(p0,p1);
}
/**
*public static <T> org.apache.commons.collections4.Predicate<T> org.apache.commons.collections4.functors.IdentityPredicate.identityPredicate(T)
*/ 
public static <T> org.apache.commons.collections4.Predicate<T> identityPredicate(T p0){
	return org.apache.commons.collections4.functors.IdentityPredicate.identityPredicate(p0);
}
/**
*public static <T> void org.apache.commons.lang3.Validate.inclusiveBetween(T,T,java.lang.Comparable<T>)
*/ 
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2){
	 org.apache.commons.lang3.Validate.inclusiveBetween(p0,p1,p2);
}
/**
*public static <T> void org.apache.commons.lang3.Validate.inclusiveBetween(T,T,java.lang.Comparable<T>,java.lang.String,java.lang.Object...)
*/ 
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
	 org.apache.commons.lang3.Validate.inclusiveBetween(p0,p1,p2,p3,p4);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.is(T)
*/ 
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> is(T p0){
	return org.apache.commons.lang3.Range.is(p0);
}
/**
*public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.is(T,java.util.Comparator<T>)
*/ 
public static <T> org.apache.commons.lang3.Range<T> is(T p0,java.util.Comparator<T> p1){
	return org.apache.commons.lang3.Range.is(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.util.MathUtils.max(T,T)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T max(T p0,T p1){
	return org.apache.commons.math3.util.MathUtils.max(p0,p1);
}
/**
*public static <T> T org.apache.commons.math3.util.MathUtils.min(T,T)
*/ 
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T min(T p0,T p1){
	return org.apache.commons.math3.util.MathUtils.min(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.noNullElements(T)
*/ 
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0){
	return org.apache.commons.lang3.Validate.noNullElements(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.noNullElements(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.noNullElements(p0,p1,p2);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notBlank(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.CharSequence > T notBlank(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notBlank(p0,p1,p2);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notBlank(T)
*/ 
public static <T extends java.lang.CharSequence > T notBlank(T p0){
	return org.apache.commons.lang3.Validate.notBlank(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notEmpty(T,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.lang.CharSequence > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notEmpty(p0,p1,p2);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notEmpty(T)
*/ 
public static <T extends java.lang.CharSequence > T notEmpty(T p0){
	return org.apache.commons.lang3.Validate.notEmpty(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notNull(T)
*/ 
public static <T> T notNull(T p0){
	return org.apache.commons.lang3.Validate.notNull(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.notNull(T,java.lang.String,java.lang.Object...)
*/ 
public static <T> T notNull(T p0,java.lang.String p1,java.lang.Object... p2){
	return org.apache.commons.lang3.Validate.notNull(p0,p1,p2);
}
/**
*public static <T> com.google.common.base.Optional<T> com.google.common.base.Optional.of(T)
*/ 
public static <T> com.google.common.base.Optional<T> of(T p0){
	return com.google.common.base.Optional.of(p0);
}
/**
*public static <B,T> com.google.common.collect.ImmutableClassToInstanceMap<B> com.google.common.collect.ImmutableClassToInstanceMap.of(java.lang.Class<T>,T)
*/ 
public static <B,T> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> p0,T p1){
	return com.google.common.collect.ImmutableClassToInstanceMap.of(p0,p1);
}
/**
*public static <T> com.google.common.base.Supplier<T> com.google.common.base.Suppliers.ofInstance(T)
*/ 
public static <T> com.google.common.base.Supplier<T> ofInstance(T p0){
	return com.google.common.base.Suppliers.ofInstance(p0);
}
/**
*public static <T> org.apache.commons.collections4.Factory<T> org.apache.commons.collections4.FactoryUtils.prototypeFactory(T)
*/ 
public static <T> org.apache.commons.collections4.Factory<T> prototypeFactory(T p0){
	return org.apache.commons.collections4.FactoryUtils.prototypeFactory(p0);
}
/**
*public static <T> int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,T,boolean,java.lang.Class<? super T>,java.lang.String...)
*/ 
public static <T> int reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
/**
*public static <T> java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(T,org.apache.commons.lang3.builder.ToStringStyle,boolean,java.lang.Class<? super T>)
*/ 
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
/**
*public static <T> java.util.concurrent.Callable<T> com.google.common.util.concurrent.Callables.returning(T)
*/ 
public static <T> java.util.concurrent.Callable<T> returning(T p0){
	return com.google.common.util.concurrent.Callables.returning(p0);
}
/**
*public static <T> T org.apache.commons.lang3.SerializationUtils.roundtrip(T)
*/ 
public static <T extends java.io.Serializable > T roundtrip(T p0){
	return org.apache.commons.lang3.SerializationUtils.roundtrip(p0);
}
/**
*public static <T> java.nio.ByteBuffer com.facebook.util.serialization.SerDeUtils.serializeToByteBuffer(T,com.facebook.util.serialization.Serializer<T>) throws com.facebook.util.serialization.SerDeException
*/ 
public static <T> java.nio.ByteBuffer serializeToByteBuffer(T p0,com.facebook.util.serialization.Serializer<T> p1) throws com.facebook.util.serialization.SerDeException{
	return com.facebook.util.serialization.SerDeUtils.serializeToByteBuffer(p0,p1);
}
/**
*public static <T> byte[] com.facebook.util.serialization.SerDeUtils.serializeToBytes(T,com.facebook.util.serialization.Serializer<T>) throws com.facebook.util.serialization.SerDeException
*/ 
public static <T> byte[] serializeToBytes(T p0,com.facebook.util.serialization.Serializer<T> p1) throws com.facebook.util.serialization.SerDeException{
	return com.facebook.util.serialization.SerDeUtils.serializeToBytes(p0,p1);
}
/**
*public static <T> com.google.common.collect.UnmodifiableIterator<T> com.google.common.collect.Iterators.singletonIterator(T)
*/ 
public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T p0){
	return com.google.common.collect.Iterators.singletonIterator(p0);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int)
*/ 
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1);
}
/**
*public static <T> T org.apache.commons.lang3.Validate.validIndex(T,int,java.lang.String,java.lang.Object...)
*/ 
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
	return org.apache.commons.lang3.Validate.validIndex(p0,p1,p2,p3);
}
/**
*public static <T> T com.google.common.base.Verify.verifyNotNull(T,java.lang.String,java.lang.Object...)
*/ 
public static <T> T verifyNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
	return com.google.common.base.Verify.verifyNotNull(p0,p1,p2);
}
/**
*public static <T> T com.google.common.base.Verify.verifyNotNull(T)
*/ 
public static <T> T verifyNotNull(T p0){
	return com.google.common.base.Verify.verifyNotNull(p0);
}
/**
*public static <T> T com.facebook.util.reflection.RobustProxy.wrap(java.lang.Class<T>,T)
*/ 
public static <T> T wrap(java.lang.Class<T> p0,T p1){
	return com.facebook.util.reflection.RobustProxy.wrap(p0,p1);
}
}
