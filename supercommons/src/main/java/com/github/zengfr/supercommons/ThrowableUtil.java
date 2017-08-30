package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThrowableUtil{ 
/**
*public static java.util.List<java.lang.Throwable> com.google.common.base.Throwables.getCausalChain(java.lang.Throwable)
*/ 
public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable p0){
	return com.google.common.base.Throwables.getCausalChain(p0);
}
/**
*public static java.lang.Throwable org.apache.commons.lang3.exception.ExceptionUtils.getCause(java.lang.Throwable)
*/ 
public static java.lang.Throwable getCause(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getCause(p0);
}
/**
*public static java.lang.Throwable org.apache.commons.lang3.exception.ExceptionUtils.getCause(java.lang.Throwable,java.lang.String[])
*/ 
public static java.lang.Throwable getCause(java.lang.Throwable p0,java.lang.String... p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.getCause(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.lang.exception.ExceptionUtils.getFullStackTrace(java.lang.Throwable)
*/ 
public static java.lang.String getFullStackTrace(java.lang.Throwable p0){
	return org.apache.commons.lang.exception.ExceptionUtils.getFullStackTrace(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.exception.ExceptionUtils.getMessage(java.lang.Throwable)
*/ 
public static java.lang.String getMessage(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getMessage(p0);
}
/**
*public static java.lang.Throwable com.google.common.base.Throwables.getRootCause(java.lang.Throwable)
*/ 
public static java.lang.Throwable getRootCause(java.lang.Throwable p0){
	return com.google.common.base.Throwables.getRootCause(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)
*/ 
public static java.lang.String getRootCauseMessage(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(p0);
}
/**
*public static java.lang.String[] org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)
*/ 
public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(p0);
}
/**
*public static java.lang.String[] org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(java.lang.Throwable)
*/ 
public static java.lang.String[] getStackFrames(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(p0);
}
/**
*public static java.lang.String org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(java.lang.Throwable)
*/ 
public static java.lang.String getStackTrace(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(p0);
}
/**
*public static java.lang.String com.google.common.base.Throwables.getStackTraceAsString(java.lang.Throwable)
*/ 
public static java.lang.String getStackTraceAsString(java.lang.Throwable p0){
	return com.google.common.base.Throwables.getStackTraceAsString(p0);
}
/**
*public static int org.apache.commons.lang3.exception.ExceptionUtils.getThrowableCount(java.lang.Throwable)
*/ 
public static int getThrowableCount(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getThrowableCount(p0);
}
/**
*public static java.util.List<java.lang.Throwable> org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)
*/ 
public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(p0);
}
/**
*public static java.lang.Throwable[] org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(java.lang.Throwable)
*/ 
public static java.lang.Throwable[] getThrowables(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(p0);
}
/**
*public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFailedFuture(java.lang.Throwable)
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable p0){
	return com.google.common.util.concurrent.Futures.immediateFailedFuture(p0);
}
/**
*public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class<?>,int)
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class<?>)
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(p0,p1);
}
/**
*public static int org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class)
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1){
	return org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(p0,p1);
}
/**
*public static int org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class,int)
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class p1,int p2){
	return org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable,java.lang.Class<?>,int)
*/ 
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(p0,p1,p2);
}
/**
*public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable,java.lang.Class<?>)
*/ 
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(p0,p1);
}
/**
*public static int org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable,java.lang.Class)
*/ 
public static int indexOfType(java.lang.Throwable p0,java.lang.Class p1){
	return org.apache.commons.lang.exception.ExceptionUtils.indexOfType(p0,p1);
}
/**
*public static int org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable,java.lang.Class,int)
*/ 
public static int indexOfType(java.lang.Throwable p0,java.lang.Class p1,int p2){
	return org.apache.commons.lang.exception.ExceptionUtils.indexOfType(p0,p1,p2);
}
/**
*public static boolean org.apache.commons.beanutils.BeanUtils.initCause(java.lang.Throwable,java.lang.Throwable)
*/ 
public static boolean initCause(java.lang.Throwable p0,java.lang.Throwable p1){
	return org.apache.commons.beanutils.BeanUtils.initCause(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(java.lang.Throwable)
*/ 
public static boolean isNestedThrowable(java.lang.Throwable p0){
	return org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(p0);
}
/**
*public static boolean org.apache.commons.io.TaggedIOException.isTaggedWith(java.lang.Throwable,java.lang.Object)
*/ 
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
	return org.apache.commons.io.TaggedIOException.isTaggedWith(p0,p1);
}
/**
*public static java.util.List<java.lang.StackTraceElement> com.google.common.base.Throwables.lazyStackTrace(java.lang.Throwable)
*/ 
public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable p0){
	return com.google.common.base.Throwables.lazyStackTrace(p0);
}
/**
*public static void org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)
*/ 
public static void printRootCauseStackTrace(java.lang.Throwable p0){
	 org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(p0);
}
/**
*public static void org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable,java.io.PrintWriter)
*/ 
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintWriter p1){
	 org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
/**
*public static void org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable,java.io.PrintStream)
*/ 
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintStream p1){
	 org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
/**
*public static java.lang.RuntimeException com.google.common.base.Throwables.propagate(java.lang.Throwable)
*/ 
public static java.lang.RuntimeException propagate(java.lang.Throwable p0){
	return com.google.common.base.Throwables.propagate(p0);
}
/**
*public static <X> void com.google.common.base.Throwables.propagateIfInstanceOf(java.lang.Throwable,java.lang.Class<X>) throws X
*/ 
public static <X extends java.lang.Throwable > void propagateIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
	 com.google.common.base.Throwables.propagateIfInstanceOf(p0,p1);
}
/**
*public static void com.google.common.base.Throwables.propagateIfPossible(java.lang.Throwable)
*/ 
public static void propagateIfPossible(java.lang.Throwable p0){
	 com.google.common.base.Throwables.propagateIfPossible(p0);
}
/**
*public static <X1,X2> void com.google.common.base.Throwables.propagateIfPossible(java.lang.Throwable,java.lang.Class<X1>,java.lang.Class<X2>) throws X1,X2
*/ 
public static <X1 extends java.lang.Throwable ,X2 extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X1> p1,java.lang.Class<X2> p2) throws X1,X2{
	 com.google.common.base.Throwables.propagateIfPossible(p0,p1,p2);
}
/**
*public static <X> void com.google.common.base.Throwables.propagateIfPossible(java.lang.Throwable,java.lang.Class<X>) throws X
*/ 
public static <X extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
	 com.google.common.base.Throwables.propagateIfPossible(p0,p1);
}
/**
*public static boolean org.apache.commons.lang.exception.ExceptionUtils.setCause(java.lang.Throwable,java.lang.Throwable)
*/ 
public static boolean setCause(java.lang.Throwable p0,java.lang.Throwable p1){
	return org.apache.commons.lang.exception.ExceptionUtils.setCause(p0,p1);
}
/**
*public static void org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object) throws java.io.IOException
*/ 
public static void throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1) throws java.io.IOException{
	 org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(p0,p1);
}
}
