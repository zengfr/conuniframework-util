package com.github.zengfr.supercommons;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.Futures;
import org.apache.commons.io.TaggedIOException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThrowableUtil{ 
public static java.lang.String getStackTraceAsString(java.lang.Throwable p0){
return Throwables.getStackTraceAsString(p0);
}
public static void propagateIfPossible(java.lang.Throwable p0){
 Throwables.propagateIfPossible(p0);
}
public static <X1 extends java.lang.Throwable ,X2 extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X1> p1,java.lang.Class<X2> p2) throws X1,X2{
 Throwables.propagateIfPossible(p0,p1,p2);
}
public static <X extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
 Throwables.propagateIfPossible(p0,p1);
}
public static <X extends java.lang.Throwable > void propagateIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
 Throwables.propagateIfInstanceOf(p0,p1);
}
public static java.lang.Throwable getRootCause(java.lang.Throwable p0){
return Throwables.getRootCause(p0);
}
public static java.lang.RuntimeException propagate(java.lang.Throwable p0){
return Throwables.propagate(p0);
}
public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable p0){
return Throwables.lazyStackTrace(p0);
}
public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable p0){
return Throwables.getCausalChain(p0);
}
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable p0){
return Futures.immediateFailedFuture(p0);
}
public static void throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1) throws java.io.IOException{
 TaggedIOException.throwCauseIfTaggedWith(p0,p1);
}
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
return TaggedIOException.isTaggedWith(p0,p1);
}
public static java.lang.Throwable getCause(java.lang.Throwable p0){
return ExceptionUtils.getCause(p0);
}
public static java.lang.Throwable getCause(java.lang.Throwable p0,java.lang.String[] p1){
return ExceptionUtils.getCause(p0,p1);
}
public static java.lang.String getMessage(java.lang.Throwable p0){
return ExceptionUtils.getMessage(p0);
}
public static java.lang.String getStackTrace(java.lang.Throwable p0){
return ExceptionUtils.getStackTrace(p0);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
return ExceptionUtils.indexOfType(p0,p1,p2);
}
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1){
return ExceptionUtils.indexOfType(p0,p1);
}
public static java.lang.Throwable[] getThrowables(java.lang.Throwable p0){
return ExceptionUtils.getThrowables(p0);
}
public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable p0){
return ExceptionUtils.getThrowableList(p0);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1){
return ExceptionUtils.indexOfThrowable(p0,p1);
}
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
return ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
public static java.lang.String[] getStackFrames(java.lang.Throwable p0){
return ExceptionUtils.getStackFrames(p0);
}
public static int getThrowableCount(java.lang.Throwable p0){
return ExceptionUtils.getThrowableCount(p0);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0){
 ExceptionUtils.printRootCauseStackTrace(p0);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintStream p1){
 ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintWriter p1){
 ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable p0){
return ExceptionUtils.getRootCauseStackTrace(p0);
}
public static java.lang.String getRootCauseMessage(java.lang.Throwable p0){
return ExceptionUtils.getRootCauseMessage(p0);
}
public static boolean initCause(java.lang.Throwable p0,java.lang.Throwable p1){
return BeanUtils.initCause(p0,p1);
}
public static boolean setCause(java.lang.Throwable p0,java.lang.Throwable p1){
return ExceptionUtils.setCause(p0,p1);
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
public static java.lang.String getFullStackTrace(java.lang.Throwable p0){
return ExceptionUtils.getFullStackTrace(p0);
}
public static boolean isNestedThrowable(java.lang.Throwable p0){
return ExceptionUtils.isNestedThrowable(p0);
}
}
