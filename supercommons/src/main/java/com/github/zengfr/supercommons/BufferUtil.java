package com.zengfr.supercommons;
import org.apache.commons.collections.BufferUtils;
import org.apache.commons.collections.buffer.TransformedBuffer;
import org.apache.commons.collections.buffer.PredicatedBuffer;
import org.apache.commons.collections.buffer.BlockingBuffer;
import org.apache.commons.collections.buffer.BoundedBuffer;
import org.apache.commons.collections.buffer.SynchronizedBuffer;
import org.apache.commons.collections.buffer.TypedBuffer;
import org.apache.commons.collections.buffer.UnmodifiableBuffer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BufferUtil{ 
public static org.apache.commons.collections.Buffer synchronizedBuffer(org.apache.commons.collections.Buffer p0){
return BufferUtils.synchronizedBuffer(p0);
}
public static org.apache.commons.collections.Buffer unmodifiableBuffer(org.apache.commons.collections.Buffer p0){
return BufferUtils.unmodifiableBuffer(p0);
}
public static org.apache.commons.collections.Buffer transformedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
return BufferUtils.transformedBuffer(p0,p1);
}
public static org.apache.commons.collections.Buffer blockingBuffer(org.apache.commons.collections.Buffer p0){
return BufferUtils.blockingBuffer(p0);
}
public static org.apache.commons.collections.Buffer blockingBuffer(org.apache.commons.collections.Buffer p0,long p1){
return BufferUtils.blockingBuffer(p0,p1);
}
public static org.apache.commons.collections.Buffer typedBuffer(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
return BufferUtils.typedBuffer(p0,p1);
}
public static org.apache.commons.collections.Buffer predicatedBuffer(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
return BufferUtils.predicatedBuffer(p0,p1);
}
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1,long p2){
return BufferUtils.boundedBuffer(p0,p1,p2);
}
public static org.apache.commons.collections.Buffer boundedBuffer(org.apache.commons.collections.Buffer p0,int p1){
return BufferUtils.boundedBuffer(p0,p1);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Transformer p1){
return TransformedBuffer.decorate(p0,p1);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,org.apache.commons.collections.Predicate p1){
return PredicatedBuffer.decorate(p0,p1);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,long p1){
return BlockingBuffer.decorate(p0,p1);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0){
return BlockingBuffer.decorate(p0);
}
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1,long p2){
return BoundedBuffer.decorate(p0,p1,p2);
}
public static org.apache.commons.collections.buffer.BoundedBuffer decorate(org.apache.commons.collections.Buffer p0,int p1){
return BoundedBuffer.decorate(p0,p1);
}
public static org.apache.commons.collections.Buffer decorate(org.apache.commons.collections.Buffer p0,java.lang.Class p1){
return TypedBuffer.decorate(p0,p1);
}
}
