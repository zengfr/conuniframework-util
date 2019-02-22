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
public final class ClassArrayUtil{ 
/**
*{@link org.apache.commons.collections.functors.InstantiateTransformer#getInstance(java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.functors.InstantiateTransformer#getInstance(java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InstantiateTransformer.getInstance(java.lang.Class[],java.lang.Object[])
*getInstance(java.lang.Class[] p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.Class[] p0,java.lang.Object... p1){
	return org.apache.commons.collections.functors.InstantiateTransformer.getInstance(p0,p1);
}
/**
*{@link org.apache.commons.collections.functors.InvokerTransformer#getInstance(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.functors.InvokerTransformer#getInstance(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.functors.InvokerTransformer.getInstance(java.lang.String,java.lang.Class[],java.lang.Object[])
*getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer getInstance(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.functors.InvokerTransformer.getInstance(p0,p1,p2);
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
*{@link org.apache.commons.collections.TransformerUtils#instantiateTransformer(java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.TransformerUtils#instantiateTransformer(java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.instantiateTransformer(java.lang.Class[],java.lang.Object[])
*instantiateTransformer(java.lang.Class[] p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer instantiateTransformer(java.lang.Class[] p0,java.lang.Object... p1){
	return org.apache.commons.collections.TransformerUtils.instantiateTransformer(p0,p1);
}
/**
*{@link org.apache.commons.collections.ClosureUtils#invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.ClosureUtils#invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.ClosureUtils.invokerClosure(java.lang.String,java.lang.Class[],java.lang.Object[])
*invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure invokerClosure(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.ClosureUtils.invokerClosure(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.PredicateUtils#invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.PredicateUtils#invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Predicate org.apache.commons.collections.PredicateUtils.invokerPredicate(java.lang.String,java.lang.Class[],java.lang.Object[])
*invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Predicate invokerPredicate(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.PredicateUtils.invokerPredicate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.TransformerUtils#invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object...)}
*@see org.apache.commons.collections.TransformerUtils#invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object...)
*<code>public static org.apache.commons.collections.Transformer org.apache.commons.collections.TransformerUtils.invokerTransformer(java.lang.String,java.lang.Class[],java.lang.Object[])
*invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Transformer invokerTransformer(java.lang.String p0,java.lang.Class[] p1,java.lang.Object... p2){
	return org.apache.commons.collections.TransformerUtils.invokerTransformer(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#nullToEmpty(java.lang.Class<?>...)}
*@see org.apache.commons.lang3.ArrayUtils#nullToEmpty(java.lang.Class<?>...)
*<code>public static java.lang.Class<?>[] org.apache.commons.lang3.ArrayUtils.nullToEmpty(java.lang.Class<?>[])
*nullToEmpty(java.lang.Class<?>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?>[] nullToEmpty(java.lang.Class<?>... p0){
	return org.apache.commons.lang3.ArrayUtils.nullToEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class<?>...)}
*@see org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class<?>...)
*<code>public static java.lang.Class<?>[] org.apache.commons.lang3.ClassUtils.primitivesToWrappers(java.lang.Class<?>...)
*primitivesToWrappers(java.lang.Class<?>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?>[] primitivesToWrappers(java.lang.Class<?>... p0){
	return org.apache.commons.lang3.ClassUtils.primitivesToWrappers(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object...)}
*@see org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object...)
*<code>public static java.lang.Class<?>[] org.apache.commons.lang3.ClassUtils.toClass(java.lang.Object...)
*toClass(java.lang.Object... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?>[] toClass(java.lang.Object... p0){
	return org.apache.commons.lang3.ClassUtils.toClass(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class<?>...)}
*@see org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class<?>...)
*<code>public static java.lang.Class<?>[] org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(java.lang.Class<?>...)
*wrappersToPrimitives(java.lang.Class<?>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Class<?>[] wrappersToPrimitives(java.lang.Class<?>... p0){
	return org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(p0);
}
}
