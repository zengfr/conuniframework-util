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
public final class ThrowableUtil{ 
/**
*{@link com.google.common.base.Throwables#getCausalChain(java.lang.Throwable)}
*@see com.google.common.base.Throwables#getCausalChain(java.lang.Throwable)
*<code>public static java.util.List<java.lang.Throwable> com.google.common.base.Throwables.getCausalChain(java.lang.Throwable)
*getCausalChain(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable p0){
	return com.google.common.base.Throwables.getCausalChain(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getCause(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getCause(java.lang.Throwable)
*<code>public static java.lang.Throwable org.codehaus.plexus.util.ExceptionUtils.getCause(java.lang.Throwable)
*getCause(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Throwable getCause(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getCause(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getCause(java.lang.Throwable,java.lang.String...)}
*@see org.codehaus.plexus.util.ExceptionUtils#getCause(java.lang.Throwable,java.lang.String...)
*<code>public static java.lang.Throwable org.codehaus.plexus.util.ExceptionUtils.getCause(java.lang.Throwable,java.lang.String[])
*getCause(java.lang.Throwable p0,java.lang.String... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Throwable getCause(java.lang.Throwable p0,java.lang.String... p1){
	return org.codehaus.plexus.util.ExceptionUtils.getCause(p0,p1);
}
/**
*{@link com.google.common.base.Throwables#getCauseAs(java.lang.Throwable,java.lang.Class<X>)}
*@see com.google.common.base.Throwables#getCauseAs(java.lang.Throwable,java.lang.Class<X>)
*<code>public static <X> X com.google.common.base.Throwables.getCauseAs(java.lang.Throwable,java.lang.Class<X>)
*getCauseAs(java.lang.Throwable p0,java.lang.Class<X> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X extends java.lang.Throwable > X getCauseAs(java.lang.Throwable p0,java.lang.Class<X> p1){
	return com.google.common.base.Throwables.getCauseAs(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getFullStackTrace(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getFullStackTrace(java.lang.Throwable)
*<code>public static java.lang.String org.codehaus.plexus.util.ExceptionUtils.getFullStackTrace(java.lang.Throwable)
*getFullStackTrace(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getFullStackTrace(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getFullStackTrace(p0);
}
/**
*{@link org.apache.commons.crypto.Crypto#getLoadingError()}
*@see org.apache.commons.crypto.Crypto#getLoadingError()
*<code>public static java.lang.Throwable org.apache.commons.crypto.Crypto.getLoadingError()
*getLoadingError()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Throwable getLoadingError(){
	return org.apache.commons.crypto.Crypto.getLoadingError();
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#getMessage(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#getMessage(java.lang.Throwable)
*<code>public static java.lang.String org.apache.commons.lang3.exception.ExceptionUtils.getMessage(java.lang.Throwable)
*getMessage(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getMessage(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getMessage(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getRootCause(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getRootCause(java.lang.Throwable)
*<code>public static java.lang.Throwable org.codehaus.plexus.util.ExceptionUtils.getRootCause(java.lang.Throwable)
*getRootCause(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Throwable getRootCause(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getRootCause(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#getRootCauseMessage(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#getRootCauseMessage(java.lang.Throwable)
*<code>public static java.lang.String org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)
*getRootCauseMessage(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getRootCauseMessage(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getRootCauseStackTrace(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getRootCauseStackTrace(java.lang.Throwable)
*<code>public static java.lang.String[] org.codehaus.plexus.util.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)
*getRootCauseStackTrace(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getRootCauseStackTrace(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getStackFrames(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getStackFrames(java.lang.Throwable)
*<code>public static java.lang.String[] org.codehaus.plexus.util.ExceptionUtils.getStackFrames(java.lang.Throwable)
*getStackFrames(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String[] getStackFrames(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getStackFrames(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getStackTrace(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getStackTrace(java.lang.Throwable)
*<code>public static java.lang.String org.codehaus.plexus.util.ExceptionUtils.getStackTrace(java.lang.Throwable)
*getStackTrace(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getStackTrace(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getStackTrace(p0);
}
/**
*{@link com.google.common.base.Throwables#getStackTraceAsString(java.lang.Throwable)}
*@see com.google.common.base.Throwables#getStackTraceAsString(java.lang.Throwable)
*<code>public static java.lang.String com.google.common.base.Throwables.getStackTraceAsString(java.lang.Throwable)
*getStackTraceAsString(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String getStackTraceAsString(java.lang.Throwable p0){
	return com.google.common.base.Throwables.getStackTraceAsString(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getThrowableCount(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getThrowableCount(java.lang.Throwable)
*<code>public static int org.codehaus.plexus.util.ExceptionUtils.getThrowableCount(java.lang.Throwable)
*getThrowableCount(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int getThrowableCount(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getThrowableCount(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#getThrowableList(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#getThrowableList(java.lang.Throwable)
*<code>public static java.util.List<java.lang.Throwable> org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)
*getThrowableList(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#getThrowables(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#getThrowables(java.lang.Throwable)
*<code>public static java.lang.Throwable[] org.codehaus.plexus.util.ExceptionUtils.getThrowables(java.lang.Throwable)
*getThrowables(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Throwable[] getThrowables(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.getThrowables(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#hasCause(java.lang.Throwable,java.lang.Class<? extends java.lang.Throwable>)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#hasCause(java.lang.Throwable,java.lang.Class<? extends java.lang.Throwable>)
*<code>public static boolean org.apache.commons.lang3.exception.ExceptionUtils.hasCause(java.lang.Throwable,java.lang.Class<? extends java.lang.Throwable>)
*hasCause(java.lang.Throwable p0,java.lang.Class<? extends java.lang.Throwable> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean hasCause(java.lang.Throwable p0,java.lang.Class<? extends java.lang.Throwable> p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.hasCause(p0,p1);
}
/**
*{@link com.google.common.util.concurrent.Futures#immediateFailedFuture(java.lang.Throwable)}
*@see com.google.common.util.concurrent.Futures#immediateFailedFuture(java.lang.Throwable)
*<code>public static <V> com.google.common.util.concurrent.ListenableFuture<V> com.google.common.util.concurrent.Futures.immediateFailedFuture(java.lang.Throwable)
*immediateFailedFuture(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable p0){
	return com.google.common.util.concurrent.Futures.immediateFailedFuture(p0);
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
*{@link org.apache.commons.lang3.exception.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class<?>)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class<?>)
*<code>public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class<?>)
*indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class<?>,int)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#indexOfThrowable(java.lang.Throwable,java.lang.Class<?>,int)
*<code>public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable,java.lang.Class<?>,int)
*indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOfThrowable(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#indexOfType(java.lang.Throwable,java.lang.Class<?>,int)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#indexOfType(java.lang.Throwable,java.lang.Class<?>,int)
*<code>public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable,java.lang.Class<?>,int)
*indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1,int p2){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#indexOfType(java.lang.Throwable,java.lang.Class<?>)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#indexOfType(java.lang.Throwable,java.lang.Class<?>)
*<code>public static int org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable,java.lang.Class<?>)
*indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOfType(java.lang.Throwable p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#initCause(java.lang.Throwable,java.lang.Throwable)}
*@see org.apache.commons.beanutils.BeanUtils#initCause(java.lang.Throwable,java.lang.Throwable)
*<code>public static boolean org.apache.commons.beanutils.BeanUtils.initCause(java.lang.Throwable,java.lang.Throwable)
*initCause(java.lang.Throwable p0,java.lang.Throwable p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean initCause(java.lang.Throwable p0,java.lang.Throwable p1){
	return org.apache.commons.beanutils.BeanUtils.initCause(p0,p1);
}
/**
*{@link org.apache.commons.crypto.jna.OpenSslJna#initialisationError()}
*@see org.apache.commons.crypto.jna.OpenSslJna#initialisationError()
*<code>public static java.lang.Throwable org.apache.commons.crypto.jna.OpenSslJna.initialisationError()
*initialisationError()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Throwable initialisationError(){
	return org.apache.commons.crypto.jna.OpenSslJna.initialisationError();
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#isNestedThrowable(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#isNestedThrowable(java.lang.Throwable)
*<code>public static boolean org.codehaus.plexus.util.ExceptionUtils.isNestedThrowable(java.lang.Throwable)
*isNestedThrowable(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNestedThrowable(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.isNestedThrowable(p0);
}
/**
*{@link org.apache.commons.io.TaggedIOException#isTaggedWith(java.lang.Throwable,java.lang.Object)}
*@see org.apache.commons.io.TaggedIOException#isTaggedWith(java.lang.Throwable,java.lang.Object)
*<code>public static boolean org.apache.commons.io.TaggedIOException.isTaggedWith(java.lang.Throwable,java.lang.Object)
*isTaggedWith(java.lang.Throwable p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
	return org.apache.commons.io.TaggedIOException.isTaggedWith(p0,p1);
}
/**
*{@link com.google.common.base.Throwables#lazyStackTrace(java.lang.Throwable)}
*@see com.google.common.base.Throwables#lazyStackTrace(java.lang.Throwable)
*<code>public static java.util.List<java.lang.StackTraceElement> com.google.common.base.Throwables.lazyStackTrace(java.lang.Throwable)
*lazyStackTrace(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable p0){
	return com.google.common.base.Throwables.lazyStackTrace(p0);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#printRootCauseStackTrace(java.lang.Throwable,java.io.PrintStream)}
*@see org.codehaus.plexus.util.ExceptionUtils#printRootCauseStackTrace(java.lang.Throwable,java.io.PrintStream)
*<code>public static void org.codehaus.plexus.util.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable,java.io.PrintStream)
*printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintStream p1){
	 org.codehaus.plexus.util.ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#printRootCauseStackTrace(java.lang.Throwable,java.io.PrintWriter)}
*@see org.codehaus.plexus.util.ExceptionUtils#printRootCauseStackTrace(java.lang.Throwable,java.io.PrintWriter)
*<code>public static void org.codehaus.plexus.util.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable,java.io.PrintWriter)
*printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintWriter p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void printRootCauseStackTrace(java.lang.Throwable p0,java.io.PrintWriter p1){
	 org.codehaus.plexus.util.ExceptionUtils.printRootCauseStackTrace(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#printRootCauseStackTrace(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#printRootCauseStackTrace(java.lang.Throwable)
*<code>public static void org.codehaus.plexus.util.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)
*printRootCauseStackTrace(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void printRootCauseStackTrace(java.lang.Throwable p0){
	 org.codehaus.plexus.util.ExceptionUtils.printRootCauseStackTrace(p0);
}
/**
*{@link com.google.common.base.Throwables#propagate(java.lang.Throwable)}
*@see com.google.common.base.Throwables#propagate(java.lang.Throwable)
*<code>public static java.lang.RuntimeException com.google.common.base.Throwables.propagate(java.lang.Throwable)
*propagate(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.RuntimeException propagate(java.lang.Throwable p0){
	return com.google.common.base.Throwables.propagate(p0);
}
/**
*{@link com.google.common.base.Throwables#propagateIfInstanceOf(java.lang.Throwable,java.lang.Class<X>)}
*@see com.google.common.base.Throwables#propagateIfInstanceOf(java.lang.Throwable,java.lang.Class<X>)
*<code>public static <X> void com.google.common.base.Throwables.propagateIfInstanceOf(java.lang.Throwable,java.lang.Class<X>) throws X
*propagateIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X extends java.lang.Throwable > void propagateIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
	 com.google.common.base.Throwables.propagateIfInstanceOf(p0,p1);
}
/**
*{@link com.google.common.base.Throwables#propagateIfPossible(java.lang.Throwable,java.lang.Class<X1>,java.lang.Class<X2>)}
*@see com.google.common.base.Throwables#propagateIfPossible(java.lang.Throwable,java.lang.Class<X1>,java.lang.Class<X2>)
*<code>public static <X1,X2> void com.google.common.base.Throwables.propagateIfPossible(java.lang.Throwable,java.lang.Class<X1>,java.lang.Class<X2>) throws X1,X2
*propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X1> p1,java.lang.Class<X2> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X1 extends java.lang.Throwable ,X2 extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X1> p1,java.lang.Class<X2> p2) throws X1,X2{
	 com.google.common.base.Throwables.propagateIfPossible(p0,p1,p2);
}
/**
*{@link com.google.common.base.Throwables#propagateIfPossible(java.lang.Throwable)}
*@see com.google.common.base.Throwables#propagateIfPossible(java.lang.Throwable)
*<code>public static void com.google.common.base.Throwables.propagateIfPossible(java.lang.Throwable)
*propagateIfPossible(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void propagateIfPossible(java.lang.Throwable p0){
	 com.google.common.base.Throwables.propagateIfPossible(p0);
}
/**
*{@link com.google.common.base.Throwables#propagateIfPossible(java.lang.Throwable,java.lang.Class<X>)}
*@see com.google.common.base.Throwables#propagateIfPossible(java.lang.Throwable,java.lang.Class<X>)
*<code>public static <X> void com.google.common.base.Throwables.propagateIfPossible(java.lang.Throwable,java.lang.Class<X>) throws X
*propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X extends java.lang.Throwable > void propagateIfPossible(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
	 com.google.common.base.Throwables.propagateIfPossible(p0,p1);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#rethrow(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#rethrow(java.lang.Throwable)
*<code>public static <R> R org.apache.commons.lang3.exception.ExceptionUtils.rethrow(java.lang.Throwable)
*rethrow(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> R rethrow(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.rethrow(p0);
}
/**
*{@link org.apache.commons.io.TaggedIOException#throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object)}
*@see org.apache.commons.io.TaggedIOException#throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object)
*<code>public static void org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(java.lang.Throwable,java.lang.Object) throws java.io.IOException
*throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1) throws java.io.IOException{
	 org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(p0,p1);
}
/**
*{@link com.google.common.base.Throwables#throwIfInstanceOf(java.lang.Throwable,java.lang.Class<X>)}
*@see com.google.common.base.Throwables#throwIfInstanceOf(java.lang.Throwable,java.lang.Class<X>)
*<code>public static <X> void com.google.common.base.Throwables.throwIfInstanceOf(java.lang.Throwable,java.lang.Class<X>) throws X
*throwIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <X extends java.lang.Throwable > void throwIfInstanceOf(java.lang.Throwable p0,java.lang.Class<X> p1) throws X{
	 com.google.common.base.Throwables.throwIfInstanceOf(p0,p1);
}
/**
*{@link com.google.common.base.Throwables#throwIfUnchecked(java.lang.Throwable)}
*@see com.google.common.base.Throwables#throwIfUnchecked(java.lang.Throwable)
*<code>public static void com.google.common.base.Throwables.throwIfUnchecked(java.lang.Throwable)
*throwIfUnchecked(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void throwIfUnchecked(java.lang.Throwable p0){
	 com.google.common.base.Throwables.throwIfUnchecked(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#wrapAndThrow(java.lang.Throwable)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#wrapAndThrow(java.lang.Throwable)
*<code>public static <R> R org.apache.commons.lang3.exception.ExceptionUtils.wrapAndThrow(java.lang.Throwable)
*wrapAndThrow(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> R wrapAndThrow(java.lang.Throwable p0){
	return org.apache.commons.lang3.exception.ExceptionUtils.wrapAndThrow(p0);
}
}
