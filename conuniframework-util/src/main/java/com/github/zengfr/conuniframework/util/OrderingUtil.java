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
public final class OrderingUtil{ 
/**
*{@link com.google.common.collect.Ordering#allEqual()}
*@see com.google.common.collect.Ordering#allEqual()
*<code>public static com.google.common.collect.Ordering<java.lang.Object> com.google.common.collect.Ordering.allEqual()
*allEqual()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.Ordering<java.lang.Object> allEqual(){
	return com.google.common.collect.Ordering.allEqual();
}
/**
*{@link com.google.common.collect.Ordering#arbitrary()}
*@see com.google.common.collect.Ordering#arbitrary()
*<code>public static com.google.common.collect.Ordering<java.lang.Object> com.google.common.collect.Ordering.arbitrary()
*arbitrary()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.Ordering<java.lang.Object> arbitrary(){
	return com.google.common.collect.Ordering.arbitrary();
}
/**
*{@link com.google.common.collect.Ordering#compound(java.lang.Iterable<? extends java.util.Comparator<? super T>>)}
*@see com.google.common.collect.Ordering#compound(java.lang.Iterable<? extends java.util.Comparator<? super T>>)
*<code>public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.compound(java.lang.Iterable<? extends java.util.Comparator<? super T>>)
*compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> p0){
	return com.google.common.collect.Ordering.compound(p0);
}
/**
*{@link com.google.common.collect.Ordering#explicit(java.util.List<T>)}
*@see com.google.common.collect.Ordering#explicit(java.util.List<T>)
*<code>public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.explicit(java.util.List<T>)
*explicit(java.util.List<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.Ordering<T> explicit(java.util.List<T> p0){
	return com.google.common.collect.Ordering.explicit(p0);
}
/**
*{@link com.google.common.collect.Ordering#explicit(T,T...)}
*@see com.google.common.collect.Ordering#explicit(T,T...)
*<code>public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.explicit(T,T...)
*explicit(T p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.Ordering<T> explicit(T p0,T... p1){
	return com.google.common.collect.Ordering.explicit(p0,p1);
}
/**
*{@link com.google.common.collect.Ordering#from(com.google.common.collect.Ordering<T>)}
*@see com.google.common.collect.Ordering#from(com.google.common.collect.Ordering<T>)
*<code>public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.from(com.google.common.collect.Ordering<T>)
*from(com.google.common.collect.Ordering<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.Ordering<T> from(com.google.common.collect.Ordering<T> p0){
	return com.google.common.collect.Ordering.from(p0);
}
/**
*{@link com.google.common.collect.Ordering#from(java.util.Comparator<T>)}
*@see com.google.common.collect.Ordering#from(java.util.Comparator<T>)
*<code>public static <T> com.google.common.collect.Ordering<T> com.google.common.collect.Ordering.from(java.util.Comparator<T>)
*from(java.util.Comparator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> p0){
	return com.google.common.collect.Ordering.from(p0);
}
/**
*{@link com.google.common.collect.Ordering#natural()}
*@see com.google.common.collect.Ordering#natural()
*<code>public static <C> com.google.common.collect.Ordering<C> com.google.common.collect.Ordering.natural()
*natural()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable > com.google.common.collect.Ordering<C> natural(){
	return com.google.common.collect.Ordering.natural();
}
/**
*{@link com.google.common.collect.Ordering#usingToString()}
*@see com.google.common.collect.Ordering#usingToString()
*<code>public static com.google.common.collect.Ordering<java.lang.Object> com.google.common.collect.Ordering.usingToString()
*usingToString()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.Ordering<java.lang.Object> usingToString(){
	return com.google.common.collect.Ordering.usingToString();
}
}
