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
public final class BufferUtil{ 
/**
*{@link org.apache.commons.collections.BufferUtils#blockingBuffer(org.apache.commons.collections.Buffer)}
*@see org.apache.commons.collections.BufferUtils#blockingBuffer(org.apache.commons.collections.Buffer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.blockingBuffer(org.apache.commons.collections.Buffer)
*blockingBuffer(org.apache.commons.collections.Buffer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer blockingBuffer(org.apache.commons.collections.Buffer p0){
	return org.apache.commons.collections.BufferUtils.blockingBuffer(p0);
}
/**
*{@link org.apache.commons.collections.BufferUtils#blockingBuffer(org.apache.commons.collections.Buffer,long)}
*@see org.apache.commons.collections.BufferUtils#blockingBuffer(org.apache.commons.collections.Buffer,long)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.blockingBuffer(org.apache.commons.collections.Buffer,long)
*blockingBuffer(org.apache.commons.collections.Buffer p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer blockingBuffer(org.apache.commons.collections.Buffer p0,long p1){
	return org.apache.commons.collections.BufferUtils.blockingBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#boundedBuffer(org.apache.commons.collections.Buffer,int,long)}
*@see org.apache.commons.collections.BufferUtils#boundedBuffer(org.apache.commons.collections.Buffer,int,long)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.boundedBuffer(org.apache.commons.collections.Buffer,int,long)
*boundedBuffer(org.apache.commons.collections.Buffer p0,int p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1,long p2){
	return org.apache.commons.collections.BufferUtils.boundedBuffer(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.BufferUtils#boundedBuffer(org.apache.commons.collections.Buffer,int)}
*@see org.apache.commons.collections.BufferUtils#boundedBuffer(org.apache.commons.collections.Buffer,int)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.boundedBuffer(org.apache.commons.collections.Buffer,int)
*boundedBuffer(org.apache.commons.collections.Buffer p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1){
	return org.apache.commons.collections.BufferUtils.boundedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.TransformedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.buffer.TransformedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.TransformedBuffer.decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.buffer.TransformedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.PredicatedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.buffer.PredicatedBuffer#decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.PredicatedBuffer.decorate(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.buffer.PredicatedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.BlockingBuffer#decorate(org.apache.commons.collections.Buffer,long)}
*@see org.apache.commons.collections.buffer.BlockingBuffer#decorate(org.apache.commons.collections.Buffer,long)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.BlockingBuffer.decorate(org.apache.commons.collections.Buffer,long)
*decorate(org.apache.commons.collections.Buffer p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,long p1){
	return org.apache.commons.collections.buffer.BlockingBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.BlockingBuffer#decorate(org.apache.commons.collections.Buffer)}
*@see org.apache.commons.collections.buffer.BlockingBuffer#decorate(org.apache.commons.collections.Buffer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.BlockingBuffer.decorate(org.apache.commons.collections.Buffer)
*decorate(org.apache.commons.collections.Buffer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0){
	return org.apache.commons.collections.buffer.BlockingBuffer.decorate(p0);
}
/**
*{@link org.apache.commons.collections.buffer.BoundedBuffer#decorate(org.apache.commons.collections.Buffer,int,long)}
*@see org.apache.commons.collections.buffer.BoundedBuffer#decorate(org.apache.commons.collections.Buffer,int,long)
*<code>public static org.apache.commons.collections.buffer.BoundedBuffer org.apache.commons.collections.buffer.BoundedBuffer.decorate(org.apache.commons.collections.Buffer,int,long)
*decorate(org.apache.commons.collections.Buffer p0,int p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1,long p2){
	return org.apache.commons.collections.buffer.BoundedBuffer.decorate(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.buffer.BoundedBuffer#decorate(org.apache.commons.collections.Buffer,int)}
*@see org.apache.commons.collections.buffer.BoundedBuffer#decorate(org.apache.commons.collections.Buffer,int)
*<code>public static org.apache.commons.collections.buffer.BoundedBuffer org.apache.commons.collections.buffer.BoundedBuffer.decorate(org.apache.commons.collections.Buffer,int)
*decorate(org.apache.commons.collections.Buffer p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1){
	return org.apache.commons.collections.buffer.BoundedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.buffer.TypedBuffer#decorate(org.apache.commons.collections.Buffer,java.lang.Class)}
*@see org.apache.commons.collections.buffer.TypedBuffer#decorate(org.apache.commons.collections.Buffer,java.lang.Class)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.buffer.TypedBuffer.decorate(org.apache.commons.collections.Buffer,java.lang.Class)
*decorate(org.apache.commons.collections.Buffer p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
	return org.apache.commons.collections.buffer.TypedBuffer.decorate(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.BufferUtils#predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.predicatedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Predicate)
*predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.BufferUtils.predicatedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#synchronizedBuffer(org.apache.commons.collections.Buffer)}
*@see org.apache.commons.collections.BufferUtils#synchronizedBuffer(org.apache.commons.collections.Buffer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.synchronizedBuffer(org.apache.commons.collections.Buffer)
*synchronizedBuffer(org.apache.commons.collections.Buffer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer synchronizedBuffer(org.apache.commons.collections.Buffer p0){
	return org.apache.commons.collections.BufferUtils.synchronizedBuffer(p0);
}
/**
*{@link org.apache.commons.collections.BufferUtils#transformedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)}
*@see org.apache.commons.collections.BufferUtils#transformedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.transformedBuffer(org.apache.commons.collections.Buffer,org.apache.commons.collections.Transformer)
*transformedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer transformedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
	return org.apache.commons.collections.BufferUtils.transformedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#typedBuffer(org.apache.commons.collections.Buffer,java.lang.Class)}
*@see org.apache.commons.collections.BufferUtils#typedBuffer(org.apache.commons.collections.Buffer,java.lang.Class)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.typedBuffer(org.apache.commons.collections.Buffer,java.lang.Class)
*typedBuffer(org.apache.commons.collections.Buffer p0,java.lang.Class p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer typedBuffer(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
	return org.apache.commons.collections.BufferUtils.typedBuffer(p0,p1);
}
/**
*{@link org.apache.commons.collections.BufferUtils#unmodifiableBuffer(org.apache.commons.collections.Buffer)}
*@see org.apache.commons.collections.BufferUtils#unmodifiableBuffer(org.apache.commons.collections.Buffer)
*<code>public static org.apache.commons.collections.Buffer org.apache.commons.collections.BufferUtils.unmodifiableBuffer(org.apache.commons.collections.Buffer)
*unmodifiableBuffer(org.apache.commons.collections.Buffer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Buffer unmodifiableBuffer(org.apache.commons.collections.Buffer p0){
	return org.apache.commons.collections.BufferUtils.unmodifiableBuffer(p0);
}
}
