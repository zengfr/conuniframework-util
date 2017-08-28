package com.zengfr.supercommons;
import com.google.common.io.ByteStreams;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteArrayDataOutputUtil{ 
public static com.google.common.io.ByteArrayDataOutput newDataOutput(){
return ByteStreams.newDataOutput();
}
public static com.google.common.io.ByteArrayDataOutput newDataOutput(int p0){
return ByteStreams.newDataOutput(p0);
}
public static com.google.common.io.ByteArrayDataOutput newDataOutput(java.io.ByteArrayOutputStream p0){
return ByteStreams.newDataOutput(p0);
}
}
