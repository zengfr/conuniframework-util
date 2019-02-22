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
public final class IntPredicateUtil{ 
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.chars.CharIterators.all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.ints.IntIterators.all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.chars.CharIterators.any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.ints.IntIterators.any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.indexOf(p0,p1);
}
/**
*{@link com.facebook.util.function.ExtIntPredicate#quiet(com.facebook.util.function.ExtIntPredicate<?>)}
*@see com.facebook.util.function.ExtIntPredicate#quiet(com.facebook.util.function.ExtIntPredicate<?>)
*<code>public static java.util.function.IntPredicate com.facebook.util.function.ExtIntPredicate.quiet(com.facebook.util.function.ExtIntPredicate<?>)
*quiet(com.facebook.util.function.ExtIntPredicate<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.function.IntPredicate quiet(com.facebook.util.function.ExtIntPredicate<?> p0){
	return com.facebook.util.function.ExtIntPredicate.quiet(p0);
}
}
