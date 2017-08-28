package com.zengfr.supercommons;
import com.google.common.io.ByteStreams;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteArrayDataInputUtil{ 
public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] p0){
return ByteStreams.newDataInput(p0);
}
public static com.google.common.io.ByteArrayDataInput newDataInput(java.io.ByteArrayInputStream p0){
return ByteStreams.newDataInput(p0);
}
public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] p0,int p1){
return ByteStreams.newDataInput(p0,p1);
}
}
