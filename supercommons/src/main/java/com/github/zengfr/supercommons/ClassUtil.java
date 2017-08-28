package com.github.zengfr.supercommons;
import com.google.common.primitives.Primitives;
import org.apache.commons.collections.BagUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.bag.TypedBag;
import org.apache.commons.collections.bag.TypedSortedBag;
import org.apache.commons.collections.map.TypedSortedMap;
import org.apache.commons.collections.map.TypedMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.SetUtils;
import org.apache.commons.collections.BufferUtils;
import org.apache.commons.collections.list.TypedList;
import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.collection.TypedCollection;
import org.apache.commons.collections.set.TypedSortedSet;
import org.apache.commons.collections.set.TypedSet;
import org.apache.commons.collections.functors.InstanceofPredicate;
import org.apache.commons.collections.functors.InstantiateFactory;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections.buffer.TypedBuffer;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang.reflect.ConstructorUtils;
import org.apache.commons.lang.reflect.FieldUtils;
import org.apache.commons.lang.reflect.MethodUtils;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClassUtil{ 
public static <T> java.lang.Class<T> wrap(java.lang.Class<T> p0){
return Primitives.wrap(p0);
}
public static <T> java.lang.Class<T> unwrap(java.lang.Class<T> p0){
return Primitives.unwrap(p0);
}
public static org.apache.commons.collections.SortedBag typedSortedBag(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
return BagUtils.typedSortedBag(p0,p1);
}
public static org.apache.commons.collections.Bag typedBag(org.apache.commons.collections.Bag p0,java.lang.Class p1){
return BagUtils.typedBag(p0,p1);
}
public static java.util.Collection typedCollection(java.util.Collection p0,java.lang.Class p1){
return CollectionUtils.typedCollection(p0,p1);
}
public static java.util.Map multiValueMap(java.util.Map p0,java.lang.Class p1){
return MapUtils.multiValueMap(p0,p1);
}
public static java.util.Map typedMap(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
return MapUtils.typedMap(p0,p1,p2);
}
public static java.util.SortedMap typedSortedMap(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
return MapUtils.typedSortedMap(p0,p1,p2);
}
public static org.apache.commons.collections.Bag decorate(org.apache.commons.collections.Bag p0,java.lang.Class p1){
return TypedBag.decorate(p0,p1);
}
public static org.apache.commons.collections.SortedBag decorate(org.apache.commons.collections.SortedBag p0,java.lang.Class p1){
return TypedSortedBag.decorate(p0,p1);
}
public static java.util.SortedMap decorate(java.util.SortedMap p0,java.lang.Class p1,java.lang.Class p2){
return TypedSortedMap.decorate(p0,p1,p2);
}
public static java.util.Map decorate(java.util.Map p0,java.lang.Class p1,java.lang.Class p2){
return TypedMap.decorate(p0,p1,p2);
}
public static org.apache.commons.collections.map.MultiValueMap decorate(java.util.Map p0,java.lang.Class p1){
return MultiValueMap.decorate(p0,p1);
}
public static java.lang.Object[] toArray(java.util.Iterator p0,java.lang.Class p1){
return IteratorUtils.toArray(p0,p1);
}
public static java.util.Set typedSet(java.util.Set p0,java.lang.Class p1){
return SetUtils.typedSet(p0,p1);
}
public static java.util.SortedSet typedSortedSet(java.util.SortedSet p0,java.lang.Class p1){
return SetUtils.typedSortedSet(p0,p1);
}
public static org.apache.commons.collections.Buffer typedBuffer(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
return BufferUtils.typedBuffer(p0,p1);
}
public static java.util.List decorate(java.util.List p0,java.lang.Class p1){
return TypedList.decorate(p0,p1);
}
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0){
return FactoryUtils.instantiateFactory(p0);
}
public static org.apache.commons.collections.Factory instantiateFactory(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object[] p2){
return FactoryUtils.instantiateFactory(p0,p1,p2);
}
public static java.util.Collection decorate(java.util.Collection p0,java.lang.Class p1){
return TypedCollection.decorate(p0,p1);
}
public static java.util.SortedSet decorate(java.util.SortedSet p0,java.lang.Class p1){
return TypedSortedSet.decorate(p0,p1);
}
public static java.util.Set decorate(java.util.Set p0,java.lang.Class p1){
return TypedSet.decorate(p0,p1);
}
public static org.apache.commons.collections.Predicate getInstance(java.lang.Class p0){
return InstanceofPredicate.getInstance(p0);
}
public static org.apache.commons.collections.Factory getInstance(java.lang.Class p0,java.lang.Class[] p1,java.lang.Object[] p2){
return InstantiateFactory.getInstance(p0,p1,p2);
}
public static java.util.List typedList(java.util.List p0,java.lang.Class p1){
return ListUtils.typedList(p0,p1);
}
public static org.apache.commons.collections.Predicate instanceofPredicate(java.lang.Class p0){
return PredicateUtils.instanceofPredicate(p0);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
return TypedBuffer.decorate(p0,p1);
}
public static java.lang.Class<?> wrapperToPrimitive(java.lang.Class<?> p0){
return ClassUtils.wrapperToPrimitive(p0);
}
public static java.lang.Class<?> primitiveToWrapper(java.lang.Class<?> p0){
return ClassUtils.primitiveToWrapper(p0);
}
public static java.lang.Class<?> getRawType(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
return TypeUtils.getRawType(p0,p1);
}
public static java.lang.Class<?> getPropertyType(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyType(p0,p1);
}
public static java.lang.Class<?> getPropertyEditorClass(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyEditorClass(p0,p1);
}
public static java.lang.Class<?> getPrimitiveType(java.lang.Class<?> p0){
return MethodUtils.getPrimitiveType(p0);
}
public static java.lang.Class<?> toNonPrimitiveClass(java.lang.Class<?> p0){
return MethodUtils.toNonPrimitiveClass(p0);
}
public static java.lang.Class<?> getPrimitiveWrapper(java.lang.Class<?> p0){
return MethodUtils.getPrimitiveWrapper(p0);
}
public static <T> java.lang.Class<T> primitiveToWrapper(java.lang.Class<T> p0){
return ConvertUtils.primitiveToWrapper(p0);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4,java.lang.String[] p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2,java.lang.Class p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String getPackageName(java.lang.Class p0){
return ClassUtils.getPackageName(p0);
}
public static java.util.List getAllInterfaces(java.lang.Class p0){
return ClassUtils.getAllInterfaces(p0);
}
public static java.lang.String getShortClassName(java.lang.Class p0){
return ClassUtils.getShortClassName(p0);
}
public static boolean isAssignable(java.lang.Class p0,java.lang.Class p1,boolean p2){
return ClassUtils.isAssignable(p0,p1,p2);
}
public static boolean isAssignable(java.lang.Class p0,java.lang.Class p1){
return ClassUtils.isAssignable(p0,p1);
}
public static boolean isInnerClass(java.lang.Class p0){
return ClassUtils.isInnerClass(p0);
}
public static java.lang.reflect.Method getPublicMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2) throws java.lang.SecurityException,java.lang.NoSuchMethodException{
return ClassUtils.getPublicMethod(p0,p1,p2);
}
public static java.util.List getAllSuperclasses(java.lang.Class p0){
return ClassUtils.getAllSuperclasses(p0);
}
public static java.lang.String getShortCanonicalName(java.lang.Class p0){
return ClassUtils.getShortCanonicalName(p0);
}
public static java.lang.Class wrapperToPrimitive(java.lang.Class p0){
return ClassUtils.wrapperToPrimitive(p0);
}
public static java.lang.String getPackageCanonicalName(java.lang.Class p0){
return ClassUtils.getPackageCanonicalName(p0);
}
public static java.lang.Class primitiveToWrapper(java.lang.Class p0){
return ClassUtils.primitiveToWrapper(p0);
}
public static java.util.Iterator iterator(java.lang.Class p0){
return EnumUtils.iterator(p0);
}
public static java.util.Map getEnumMap(java.lang.Class p0){
return EnumUtils.getEnumMap(p0);
}
public static java.util.List getEnumList(java.lang.Class p0){
return EnumUtils.getEnumList(p0);
}
public static org.apache.commons.lang.enum.Enum getEnum(java.lang.Class p0,java.lang.String p1){
return EnumUtils.getEnum(p0,p1);
}
public static org.apache.commons.lang.enum.ValuedEnum getEnum(java.lang.Class p0,int p1){
return EnumUtils.getEnum(p0,p1);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class p1){
return ExceptionUtils.indexOfType(p0,p1);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class p1,int p2){
return ExceptionUtils.indexOfType(p0,p1,p2);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1){
return ExceptionUtils.indexOfThrowable(p0,p1);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1,int p2){
return ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class p0,java.lang.Class p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static java.lang.reflect.Constructor getAccessibleConstructor(java.lang.Class p0,java.lang.Class[] p1){
return ConstructorUtils.getAccessibleConstructor(p0,p1);
}
public static java.lang.reflect.Constructor getMatchingAccessibleConstructor(java.lang.Class p0,java.lang.Class[] p1){
return ConstructorUtils.getMatchingAccessibleConstructor(p0,p1);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object[] p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1,p2);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object[] p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1,p2);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getDeclaredField(p0,p1,p2);
}
public static java.lang.reflect.Field getDeclaredField(java.lang.Class p0,java.lang.String p1){
return FieldUtils.getDeclaredField(p0,p1);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1,boolean p2){
return FieldUtils.getField(p0,p1,p2);
}
public static java.lang.reflect.Field getField(java.lang.Class p0,java.lang.String p1){
return FieldUtils.getField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getMatchingAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class[] p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class p0,java.lang.String p1,java.lang.Class p2){
return MethodUtils.getAccessibleMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1){
 Validate.allElementsOfType(p0,p1);
}
public static void allElementsOfType(java.util.Collection p0,java.lang.Class p1,java.lang.String p2){
 Validate.allElementsOfType(p0,p1,p2);
}
}
