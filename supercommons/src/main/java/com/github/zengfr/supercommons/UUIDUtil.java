package com.github.zengfr.supercommons;
import org.apache.commons.lang3.Conversion;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UUIDUtil{ 
public static byte[] uuidToByteArray(java.util.UUID p0,byte[] p1,int p2,int p3){
return Conversion.uuidToByteArray(p0,p1,p2,p3);
}
public static java.util.UUID byteArrayToUuid(byte[] p0,int p1){
return Conversion.byteArrayToUuid(p0,p1);
}
}
