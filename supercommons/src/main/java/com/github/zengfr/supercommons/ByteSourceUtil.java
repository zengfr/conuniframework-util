package com.github.zengfr.supercommons;
import com.google.common.io.ByteSource;
import com.google.common.io.Files;
import com.google.common.io.Resources;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteSourceUtil{ 
public static com.google.common.io.ByteSource concat(java.util.Iterator<? extends com.google.common.io.ByteSource> p0){
return ByteSource.concat(p0);
}
public static com.google.common.io.ByteSource concat(java.lang.Iterable<? extends com.google.common.io.ByteSource> p0){
return ByteSource.concat(p0);
}
public static com.google.common.io.ByteSource concat(.. p0){
return ByteSource.concat(p0);
}
public static com.google.common.io.ByteSource wrap(byte[] p0){
return ByteSource.wrap(p0);
}
public static com.google.common.io.ByteSource empty(){
return ByteSource.empty();
}
public static com.google.common.io.ByteSource asByteSource(java.io.File p0){
return Files.asByteSource(p0);
}
public static com.google.common.io.ByteSource asByteSource(java.net.URL p0){
return Resources.asByteSource(p0);
}
}
