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
public final class ByteListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator it.unimi.dsi.fastutil.bytes.ByteBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.ListIterator)
*asByteIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator asByteIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#fromTo(byte,byte)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#fromTo(byte,byte)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.fromTo(byte,byte)
*fromTo(byte p0,byte p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator fromTo(byte p0,byte p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.fromTo(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#getEmptyByteListIterator()}
*@see org.apache.commons.collections.primitives.ByteCollections#getEmptyByteListIterator()
*<code>public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.ByteCollections.getEmptyByteListIterator()
*getEmptyByteListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator getEmptyByteListIterator(){
	return org.apache.commons.collections.primitives.ByteCollections.getEmptyByteListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#singleton(byte)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#singleton(byte)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.singleton(byte)
*singleton(byte p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator singleton(byte p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#singletonByteListIterator(byte)}
*@see org.apache.commons.collections.primitives.ByteCollections#singletonByteListIterator(byte)
*<code>public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.ByteCollections.singletonByteListIterator(byte)
*singletonByteListIterator(byte p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator singletonByteListIterator(byte p0){
	return org.apache.commons.collections.primitives.ByteCollections.singletonByteListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator)
*unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator)}
*@see org.apache.commons.collections.primitives.ByteCollections#unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator)
*<code>public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator)
*unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator p0){
	return org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#wrap(byte[],int,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#wrap(byte[],int,int)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(byte[],int,int)
*wrap(byte[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#wrap(byte...)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#wrap(byte...)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(byte[])
*wrap(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte... p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ByteListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ByteListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ByteListIterator)
*wrap(org.apache.commons.collections.primitives.ByteListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ByteListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(p0);
}
}
