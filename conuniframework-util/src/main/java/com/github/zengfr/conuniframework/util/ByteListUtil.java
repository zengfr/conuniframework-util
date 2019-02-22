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
public final class ByteListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigLists#asBigList(it.unimi.dsi.fastutil.bytes.ByteList)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigLists#asBigList(it.unimi.dsi.fastutil.bytes.ByteList)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteBigList it.unimi.dsi.fastutil.bytes.ByteBigLists.asBigList(it.unimi.dsi.fastutil.bytes.ByteList)
*asBigList(it.unimi.dsi.fastutil.bytes.ByteList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigList asBigList(it.unimi.dsi.fastutil.bytes.ByteList p0){
	return it.unimi.dsi.fastutil.bytes.ByteBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#getEmptyByteList()}
*@see org.apache.commons.collections.primitives.ByteCollections#getEmptyByteList()
*<code>public static org.apache.commons.collections.primitives.ByteList org.apache.commons.collections.primitives.ByteCollections.getEmptyByteList()
*getEmptyByteList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteList getEmptyByteList(){
	return org.apache.commons.collections.primitives.ByteCollections.getEmptyByteList();
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#shuffle(it.unimi.dsi.fastutil.bytes.ByteList,java.util.Random)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#shuffle(it.unimi.dsi.fastutil.bytes.ByteList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.shuffle(it.unimi.dsi.fastutil.bytes.ByteList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.bytes.ByteList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList shuffle(it.unimi.dsi.fastutil.bytes.ByteList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.bytes.ByteLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#singleton(byte)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#singleton(byte)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.singleton(byte)
*singleton(byte p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList singleton(byte p0){
	return it.unimi.dsi.fastutil.bytes.ByteLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.bytes.ByteLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#singletonByteList(byte)}
*@see org.apache.commons.collections.primitives.ByteCollections#singletonByteList(byte)
*<code>public static org.apache.commons.collections.primitives.ByteList org.apache.commons.collections.primitives.ByteCollections.singletonByteList(byte)
*singletonByteList(byte p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteList singletonByteList(byte p0){
	return org.apache.commons.collections.primitives.ByteCollections.singletonByteList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteList)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteList)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.synchronize(it.unimi.dsi.fastutil.bytes.ByteList)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0){
	return it.unimi.dsi.fastutil.bytes.ByteLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#synchronize(it.unimi.dsi.fastutil.bytes.ByteList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.synchronize(it.unimi.dsi.fastutil.bytes.ByteList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteLists#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteList)}
*@see it.unimi.dsi.fastutil.bytes.ByteLists#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteList)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteLists.unmodifiable(it.unimi.dsi.fastutil.bytes.ByteList)
*unmodifiable(it.unimi.dsi.fastutil.bytes.ByteList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList unmodifiable(it.unimi.dsi.fastutil.bytes.ByteList p0){
	return it.unimi.dsi.fastutil.bytes.ByteLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#unmodifiableByteList(org.apache.commons.collections.primitives.ByteList)}
*@see org.apache.commons.collections.primitives.ByteCollections#unmodifiableByteList(org.apache.commons.collections.primitives.ByteList)
*<code>public static org.apache.commons.collections.primitives.ByteList org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteList(org.apache.commons.collections.primitives.ByteList) throws java.lang.NullPointerException
*unmodifiableByteList(org.apache.commons.collections.primitives.ByteList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteList unmodifiableByteList(org.apache.commons.collections.primitives.ByteList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteListList#wrap(org.apache.commons.collections.primitives.ByteList)}
*@see org.apache.commons.collections.primitives.adapters.ByteListList#wrap(org.apache.commons.collections.primitives.ByteList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.ByteListList.wrap(org.apache.commons.collections.primitives.ByteList)
*wrap(org.apache.commons.collections.primitives.ByteList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.ByteList p0){
	return org.apache.commons.collections.primitives.adapters.ByteListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListByteList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListByteList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.ByteList org.apache.commons.collections.primitives.adapters.ListByteList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListByteList.wrap(p0);
}
}
