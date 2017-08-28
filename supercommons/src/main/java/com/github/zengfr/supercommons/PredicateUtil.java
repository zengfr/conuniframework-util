package com.zengfr.supercommons;
import com.google.common.base.Predicates;
import com.google.common.io.Files;
import org.apache.commons.collections.BagUtils;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.bag.PredicatedBag;
import org.apache.commons.collections.collection.PredicatedCollection;
import org.apache.commons.collections.bag.PredicatedSortedBag;
import org.apache.commons.collections.map.PredicatedMap;
import org.apache.commons.collections.map.PredicatedSortedMap;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.BufferUtils;
import org.apache.commons.collections.list.PredicatedList;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.set.PredicatedSortedSet;
import org.apache.commons.collections.set.PredicatedSet;
import org.apache.commons.collections.functors.NotNullPredicate;
import org.apache.commons.collections.functors.NullIsExceptionPredicate;
import org.apache.commons.collections.functors.ExceptionPredicate;
import org.apache.commons.collections.functors.NonePredicate;
import org.apache.commons.collections.functors.OnePredicate;
import org.apache.commons.collections.functors.NotPredicate;
import org.apache.commons.collections.functors.PredicateTransformer;
import org.apache.commons.collections.functors.NullIsTruePredicate;
import org.apache.commons.collections.functors.WhileClosure;
import org.apache.commons.collections.functors.OrPredicate;
import org.apache.commons.collections.functors.NullIsFalsePredicate;
import org.apache.commons.collections.functors.TransformerPredicate;
import org.apache.commons.collections.functors.NullPredicate;
import org.apache.commons.collections.functors.AndPredicate;
import org.apache.commons.collections.functors.EqualPredicate;
import org.apache.commons.collections.functors.AnyPredicate;
import org.apache.commons.collections.functors.InstanceofPredicate;
import org.apache.commons.collections.functors.IdentityPredicate;
import org.apache.commons.collections.functors.TransformedPredicate;
import org.apache.commons.collections.functors.IfClosure;
import org.apache.commons.collections.functors.UniquePredicate;
import org.apache.commons.collections.functors.TruePredicate;
import org.apache.commons.collections.functors.AllPredicate;
import org.apache.commons.collections.functors.FalsePredicate;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections.buffer.PredicatedBuffer;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.PredicateUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicateUtil{ 
public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern p0){
return Predicates.contains(p0);
}
public static <T> com.google.common.base.Predicate<T> isNull(){
return Predicates.isNull();
}
public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1){
return Predicates.and(p0,p1);
}
public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0){
return Predicates.and(p0);
}
public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>... p0){
return Predicates.and(p0);
}
public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>... p0){
return Predicates.or(p0);
}
public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T> p0,com.google.common.base.Predicate<? super T> p1){
return Predicates.or(p0,p1);
}
public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> p0){
return Predicates.or(p0);
}
public static <A,B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B> p0,com.google.common.base.Function<A, ? extends B> p1){
return Predicates.compose(p0,p1);
}
public static com.google.common.base.Predicate<java.lang.Object> instanceOf(java.lang.Class<?> p0){
return Predicates.instanceOf(p0);
}
public static com.google.common.base.Predicate<java.lang.Class<?>> assignableFrom(java.lang.Class<?> p0){
return Predicates.assignableFrom(p0);
}
public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String p0){
return Predicates.containsPattern(p0);
}
public static <T> com.google.common.base.Predicate<T> alwaysFalse(){
return Predicates.alwaysFalse();
}
public static <T> com.google.common.base.Predicate<T> notNull(){
return Predicates.notNull();
}
public static <T> com.google.common.base.Predicate<T> alwaysTrue(){
return Predicates.alwaysTrue();
}
public static <T> com.google.common.base.Predicate<T> equalTo(T p0){
return Predicates.equalTo(p0);
}
public static com.google.common.base.Predicate<java.io.File> isDirectory(){
return Files.isDirectory();
}
public static com.google.common.base.Predicate<java.io.File> isFile(){
return Files.isFile();
}
public static org.apache.commons.collections.Bag predicatedBag(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
return BagUtils.predicatedBag(p0,p1);
}
public static org.apache.commons.collections.SortedBag predicatedSortedBag(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
return BagUtils.predicatedSortedBag(p0,p1);
}
public static org.apache.commons.collections.Transformer switchTransformer(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Transformer p1,org.apache.commons.collections.Transformer p2){
return TransformerUtils.switchTransformer(p0,p1,p2);
}
public static org.apache.commons.collections.Transformer asTransformer(org.apache.commons.collections.Predicate p0){
return TransformerUtils.asTransformer(p0);
}
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.find(p0,p1);
}
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.exists(p0,p1);
}
public static void filter(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
 CollectionUtils.filter(p0,p1);
}
public static int countMatches(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.countMatches(p0,p1);
}
public static java.util.Collection predicatedCollection(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.predicatedCollection(p0,p1);
}
public static java.util.Collection select(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.select(p0,p1);
}
public static void select(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
 CollectionUtils.select(p0,p1,p2);
}
public static java.util.Collection selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.selectRejected(p0,p1);
}
public static void selectRejected(java.util.Collection p0,org.apache.commons.collections.Predicate p1,java.util.Collection p2){
 CollectionUtils.selectRejected(p0,p1,p2);
}
public static java.util.SortedMap predicatedSortedMap(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return MapUtils.predicatedSortedMap(p0,p1,p2);
}
public static java.util.Map predicatedMap(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return MapUtils.predicatedMap(p0,p1,p2);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,org.apache.commons.collections.Predicate p1){
return PredicatedBag.decorate(p0,p1);
}
public static java.util.Collection decorate(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return PredicatedCollection.decorate(p0,p1);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,org.apache.commons.collections.Predicate p1){
return PredicatedSortedBag.decorate(p0,p1);
}
public static java.util.Map decorate(java.util.Map p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return PredicatedMap.decorate(p0,p1,p2);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,org.apache.commons.collections.Predicate p1,org.apache.commons.collections.Predicate p2){
return PredicatedSortedMap.decorate(p0,p1,p2);
}
public static java.util.Iterator filteredIterator(java.util.Iterator p0,org.apache.commons.collections.Predicate p1){
return IteratorUtils.filteredIterator(p0,p1);
}
public static java.util.ListIterator filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1){
return IteratorUtils.filteredListIterator(p0,p1);
}
public static java.util.SortedSet predicatedSortedSet(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
return SetUtils.predicatedSortedSet(p0,p1);
}
public static java.util.Set predicatedSet(java.util.Set p0,org.apache.commons.collections.Predicate p1){
return SetUtils.predicatedSet(p0,p1);
}
public static org.apache.commons.collections.Buffer predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
return BufferUtils.predicatedBuffer(p0,p1);
}
public static java.util.List decorate(java.util.List p0,org.apache.commons.collections.Predicate p1){
return PredicatedList.decorate(p0,p1);
}
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.ifClosure(p0,p1);
}
public static org.apache.commons.collections.Closure ifClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
return ClosureUtils.ifClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure whileClosure(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
return ClosureUtils.whileClosure(p0,p1);
}
public static org.apache.commons.collections.Closure doWhileClosure(org.apache.commons.collections.Closure p0,org.apache.commons.collections.Predicate p1){
return ClosureUtils.doWhileClosure(p0,p1);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0,org.apache.commons.collections.Predicate p1){
return PredicatedSortedSet.decorate(p0,p1);
}
public static java.util.Set decorate(java.util.Set p0,org.apache.commons.collections.Predicate p1){
return PredicatedSet.decorate(p0,p1);
}
public static org.apache.commons.collections.Predicate getInstance(){
return NotNullPredicate.getInstance();
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate p0){
return NullIsExceptionPredicate.getInstance(p0);
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate[] p0){
return NonePredicate.getInstance(p0);
}
public static org.apache.commons.collections.Predicate getInstance(java.util.Collection p0){
return NonePredicate.getInstance(p0);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
return WhileClosure.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
return OrPredicate.getInstance(p0,p1);
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0){
return TransformerPredicate.getInstance(p0);
}
public static org.apache.commons.collections.Predicate getInstance(java.lang.Object p0){
return EqualPredicate.getInstance(p0);
}
public static org.apache.commons.collections.Predicate getInstance(java.lang.Class p0){
return InstanceofPredicate.getInstance(p0);
}
public static org.apache.commons.collections.Predicate getInstance(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
return TransformedPredicate.getInstance(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1){
return IfClosure.getInstance(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,org.apache.commons.collections.Closure p2){
return IfClosure.getInstance(p0,p1,p2);
}
public static java.util.List predicatedList(java.util.List p0,org.apache.commons.collections.Predicate p1){
return ListUtils.predicatedList(p0,p1);
}
public static org.apache.commons.collections.Predicate asPredicate(org.apache.commons.collections.Transformer p0){
return PredicateUtils.asPredicate(p0);
}
public static org.apache.commons.collections.Predicate exceptionPredicate(){
return PredicateUtils.exceptionPredicate();
}
public static org.apache.commons.collections.Predicate transformedPredicate(org.apache.commons.collections.Transformer p0,org.apache.commons.collections.Predicate p1){
return PredicateUtils.transformedPredicate(p0,p1);
}
public static org.apache.commons.collections.Predicate nullIsExceptionPredicate(org.apache.commons.collections.Predicate p0){
return PredicateUtils.nullIsExceptionPredicate(p0);
}
public static org.apache.commons.collections.Predicate identityPredicate(java.lang.Object p0){
return PredicateUtils.identityPredicate(p0);
}
public static org.apache.commons.collections.Predicate nullIsFalsePredicate(org.apache.commons.collections.Predicate p0){
return PredicateUtils.nullIsFalsePredicate(p0);
}
public static org.apache.commons.collections.Predicate instanceofPredicate(java.lang.Class p0){
return PredicateUtils.instanceofPredicate(p0);
}
public static org.apache.commons.collections.Predicate nullIsTruePredicate(org.apache.commons.collections.Predicate p0){
return PredicateUtils.nullIsTruePredicate(p0);
}
public static org.apache.commons.collections.Predicate uniquePredicate(){
return PredicateUtils.uniquePredicate();
}
public static org.apache.commons.collections.Predicate nonePredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.nonePredicate(p0);
}
public static org.apache.commons.collections.Predicate nonePredicate(java.util.Collection p0){
return PredicateUtils.nonePredicate(p0);
}
public static org.apache.commons.collections.Predicate neitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
return PredicateUtils.neitherPredicate(p0,p1);
}
public static org.apache.commons.collections.Predicate notPredicate(org.apache.commons.collections.Predicate p0){
return PredicateUtils.notPredicate(p0);
}
public static org.apache.commons.collections.Predicate onePredicate(java.util.Collection p0){
return PredicateUtils.onePredicate(p0);
}
public static org.apache.commons.collections.Predicate onePredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.onePredicate(p0);
}
public static org.apache.commons.collections.Predicate nullPredicate(){
return PredicateUtils.nullPredicate();
}
public static org.apache.commons.collections.Predicate falsePredicate(){
return PredicateUtils.falsePredicate();
}
public static org.apache.commons.collections.Predicate andPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
return PredicateUtils.andPredicate(p0,p1);
}
public static org.apache.commons.collections.Predicate allPredicate(java.util.Collection p0){
return PredicateUtils.allPredicate(p0);
}
public static org.apache.commons.collections.Predicate allPredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.allPredicate(p0);
}
public static org.apache.commons.collections.Predicate truePredicate(){
return PredicateUtils.truePredicate();
}
public static org.apache.commons.collections.Predicate orPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
return PredicateUtils.orPredicate(p0,p1);
}
public static org.apache.commons.collections.Predicate anyPredicate(org.apache.commons.collections.Predicate[] p0){
return PredicateUtils.anyPredicate(p0);
}
public static org.apache.commons.collections.Predicate anyPredicate(java.util.Collection p0){
return PredicateUtils.anyPredicate(p0);
}
public static org.apache.commons.collections.Predicate eitherPredicate(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Predicate p1){
return PredicateUtils.eitherPredicate(p0,p1);
}
public static org.apache.commons.collections.Predicate equalPredicate(java.lang.Object p0){
return PredicateUtils.equalPredicate(p0);
}
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0){
return PredicateUtils.invokerPredicate(p0);
}
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object[] p2){
return PredicateUtils.invokerPredicate(p0,p1,p2);
}
public static org.apache.commons.collections.Predicate notNullPredicate(){
return PredicateUtils.notNullPredicate();
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
return PredicatedBuffer.decorate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> nullIsExceptionPredicate(org.apache.commons.collections4.Predicate<? super T> p0){
return NullIsExceptionPredicate.nullIsExceptionPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> nonePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
return NonePredicate.nonePredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> nonePredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
return NonePredicate.nonePredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> onePredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
return OnePredicate.onePredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> onePredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
return OnePredicate.onePredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> notPredicate(org.apache.commons.collections4.Predicate<? super T> p0){
return NotPredicate.notPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1,Criterion p2){
return ComparatorPredicate.comparatorPredicate(p0,p1,p2);
}
public static <T> org.apache.commons.collections4.Predicate<T> comparatorPredicate(T p0,java.util.Comparator<T> p1){
return ComparatorPredicate.comparatorPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> nullIsTruePredicate(org.apache.commons.collections4.Predicate<? super T> p0){
return NullIsTruePredicate.nullIsTruePredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> orPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return OrPredicate.orPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> nullIsFalsePredicate(org.apache.commons.collections4.Predicate<? super T> p0){
return NullIsFalsePredicate.nullIsFalsePredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> transformerPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0){
return TransformerPredicate.transformerPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> andPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return AndPredicate.andPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0,org.apache.commons.collections4.Equator<T> p1){
return EqualPredicate.equalPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> equalPredicate(T p0){
return EqualPredicate.equalPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> anyPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
return AnyPredicate.anyPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> anyPredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
return AnyPredicate.anyPredicate(p0);
}
public static org.apache.commons.collections4.Predicate<java.lang.Object> instanceOfPredicate(java.lang.Class<?> p0){
return InstanceofPredicate.instanceOfPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> identityPredicate(T p0){
return IdentityPredicate.identityPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> transformedPredicate(org.apache.commons.collections4.Transformer<? super T, ? extends T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return TransformedPredicate.transformedPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> allPredicate(java.util.Collection<? extends org.apache.commons.collections4.Predicate<? super T>> p0){
return AllPredicate.allPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> allPredicate(org.apache.commons.collections4.Predicate<? super T>... p0){
return AllPredicate.allPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> asPredicate(org.apache.commons.collections4.Transformer<? super T, java.lang.Boolean> p0){
return PredicateUtils.asPredicate(p0);
}
public static org.apache.commons.collections4.Predicate<java.lang.Object> instanceofPredicate(java.lang.Class<?> p0){
return PredicateUtils.instanceofPredicate(p0);
}
public static <T> org.apache.commons.collections4.Predicate<T> neitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return PredicateUtils.neitherPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> eitherPredicate(org.apache.commons.collections4.Predicate<? super T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return PredicateUtils.eitherPredicate(p0,p1);
}
public static <T> org.apache.commons.collections4.Predicate<T> invokerPredicate(java.lang.String p0,java.lang.Class<?>[] p1,java.lang.Object[] p2){
return PredicateUtils.invokerPredicate(p0,p1,p2);
}
}
