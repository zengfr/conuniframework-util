package com.zengfr.supercommons;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Suppliers;
import com.google.common.base.Verify;
import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.Callables;
import org.apache.commons.collections4.FluentIterable;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.collections4.functors.PrototypeFactory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Range;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.util.MathUtils;
import com.facebook.util.ExtSuppliers;
import com.facebook.util.reflection.RobustProxy;
import com.facebook.util.serialization.SerDeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TUtil{ 
public static <T> T firstNonNull(T p0,T p1){
return MoreObjects.firstNonNull(p0,p1);
}
public static <T> com.google.common.base.Optional<T> of(T p0){
return Optional.of(p0);
}
public static <T> com.google.common.base.Optional<T> fromNullable(T p0){
return Optional.fromNullable(p0);
}
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Preconditions.checkNotNull(p0,p1,p2);
}
public static <T> T checkNotNull(T p0,java.lang.Object p1){
return Preconditions.checkNotNull(p0,p1);
}
public static <T> T checkNotNull(T p0){
return Preconditions.checkNotNull(p0);
}
public static <T> com.google.common.base.Predicate<T> equalTo(T p0){
return Predicates.equalTo(p0);
}
public static <T> com.google.common.base.Supplier<T> ofInstance(T p0){
return Suppliers.ofInstance(p0);
}
public static <T> T verifyNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Verify.verifyNotNull(p0,p1,p2);
}
public static <T> T verifyNotNull(T p0){
return Verify.verifyNotNull(p0);
}
public static <B,T> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> p0,T p1){
return ImmutableClassToInstanceMap.of(p0,p1);
}
public static <T> T getFirst(java.lang.Iterable<? extends T> p0,T p1){
return Iterables.getFirst(p0,p1);
}
public static <T> T find(java.lang.Iterable<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
return Iterables.find(p0,p1,p2);
}
public static <T> T getLast(java.lang.Iterable<? extends T> p0,T p1){
return Iterables.getLast(p0,p1);
}
public static <T> T getOnlyElement(java.lang.Iterable<? extends T> p0,T p1){
return Iterables.getOnlyElement(p0,p1);
}
public static <T> T find(java.util.Iterator<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
return Iterators.find(p0,p1,p2);
}
public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T p0){
return Iterators.singletonIterator(p0);
}
public static <T> T getLast(java.util.Iterator<? extends T> p0,T p1){
return Iterators.getLast(p0,p1);
}
public static <T> T getNext(java.util.Iterator<? extends T> p0,T p1){
return Iterators.getNext(p0,p1);
}
public static <T> T getOnlyElement(java.util.Iterator<? extends T> p0,T p1){
return Iterators.getOnlyElement(p0,p1);
}
public static <T> T[] concat(T[] p0,T p1){
return ObjectArrays.concat(p0,p1);
}
public static <T> T[] concat(T p0,T[] p1){
return ObjectArrays.concat(p0,p1);
}
public static <T> com.google.common.collect.Ordering<T> explicit(T p0,T... p1){
return Ordering.explicit(p0,p1);
}
public static <T> java.util.concurrent.Callable<T> returning(T p0){
return Callables.returning(p0);
}
public static <T> boolean addIgnoreNull(java.util.Collection<T> p0,T p1){
return CollectionUtils.addIgnoreNull(p0,p1);
}
public static <T> org.apache.commons.collections4.Factory<T> constantFactory(T p0){
return FactoryUtils.constantFactory(p0);
}
public static <T> org.apache.commons.collections4.Factory<T> prototypeFactory(T p0){
return FactoryUtils.prototypeFactory(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1,Criterion p2){
return ComparatorPredicate.comparatorPredicate(p0,p1,p2);
}
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1){
return ComparatorPredicate.comparatorPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0,org.apache.commons.collections4.Equator<T> p1){
return EqualPredicate.equalPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0){
return EqualPredicate.equalPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> identityPredicate(T p0){
return IdentityPredicate.identityPredicate(p0);
}
public static <E,T> int frequency(java.lang.Iterable<E> p0,T p1){
return IterableUtils.frequency(p0,p1);
}
public static <T> T[] add(T[] p0,int p1,T p2){
return ArrayUtils.add(p0,p1,p2);
}
public static <T> T[] add(T[] p0,T p1){
return ArrayUtils.add(p0,p1);
}
public static <T> int reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static <T> java.util.concurrent.Future<T> constantFuture(T p0){
return ConcurrentUtils.constantFuture(p0);
}
public static <T> T clone(T p0){
return ObjectUtils.clone(p0);
}
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1,boolean p2){
return ObjectUtils.compare(p0,p1,p2);
}
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1){
return ObjectUtils.compare(p0,p1);
}
public static <T> T defaultIfNull(T p0,T p1){
return ObjectUtils.defaultIfNull(p0,p1);
}
public static <T> T cloneIfPossible(T p0){
return ObjectUtils.cloneIfPossible(p0);
}
public static <T> T CONST(T p0){
return ObjectUtils.CONST(p0);
}
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> is(T p0){
return Range.is(p0);
}
public static <T> org.apache.commons.lang3.Range<T> is(T p0,java.util.Comparator<T> p1){
return Range.is(p0,p1);
}
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> between(T p0,T p1){
return Range.between(p0,p1);
}
public static <T> org.apache.commons.lang3.Range<T> between(T p0,T p1,java.util.Comparator<T> p2){
return Range.between(p0,p1,p2);
}
public static <T extends java.io.Serializable > T roundtrip(T p0){
return SerializationUtils.roundtrip(p0);
}
public static <T extends java.lang.CharSequence > T defaultIfEmpty(T p0,T p1){
return StringUtils.defaultIfEmpty(p0,p1);
}
public static <T extends java.lang.CharSequence > T defaultIfBlank(T p0,T p1){
return StringUtils.defaultIfBlank(p0,p1);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1){
return Validate.validIndex(p0,p1);
}
public static <T extends java.util.Collection<?> > T validIndex(T p0,int p1,java.lang.String p2,java.lang.Object... p3){
return Validate.validIndex(p0,p1,p2,p3);
}
public static <T extends java.lang.CharSequence > T notEmpty(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notEmpty(p0,p1,p2);
}
public static <T extends java.lang.CharSequence > T notEmpty(T p0){
return Validate.notEmpty(p0);
}
public static <T> T notNull(T p0){
return Validate.notNull(p0);
}
public static <T> T notNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notNull(p0,p1,p2);
}
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2){
 Validate.exclusiveBetween(p0,p1,p2);
}
public static <T> void exclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
 Validate.exclusiveBetween(p0,p1,p2,p3,p4);
}
public static <T extends java.lang.CharSequence > T notBlank(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notBlank(p0,p1,p2);
}
public static <T extends java.lang.CharSequence > T notBlank(T p0){
return Validate.notBlank(p0);
}
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2){
 Validate.inclusiveBetween(p0,p1,p2);
}
public static <T> void inclusiveBetween(T p0,T p1,java.lang.Comparable<T> p2,java.lang.String p3,java.lang.Object... p4){
 Validate.inclusiveBetween(p0,p1,p2,p3,p4);
}
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0){
return Validate.noNullElements(p0);
}
public static <T extends java.lang.Iterable<?> > T noNullElements(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.noNullElements(p0,p1,p2);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T min(T p0,T p1){
return MathUtils.min(p0,p1);
}
public static <T extends org.apache.commons.math3.RealFieldElement<T> > T max(T p0,T p1){
return MathUtils.max(p0,p1);
}
public static <T> T wrap(java.lang.Class<T> p0,T p1){
return RobustProxy.wrap(p0,p1);
}
public static <T> byte[] serializeToBytes(T p0,com.facebook.util.serialization.Serializer<T> p1) throws com.facebook.util.serialization.SerDeException{
return SerDeUtils.serializeToBytes(p0,p1);
}
public static <T> java.nio.ByteBuffer serializeToByteBuffer(T p0,com.facebook.util.serialization.Serializer<T> p1) throws com.facebook.util.serialization.SerDeException{
return SerDeUtils.serializeToByteBuffer(p0,p1);
}
}
