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
public final class PropertiesUtil{ 
/**
*{@link org.apache.commons.collections.ExtendedProperties#convertProperties(java.util.Properties)}
*@see org.apache.commons.collections.ExtendedProperties#convertProperties(java.util.Properties)
*<code>public static org.apache.commons.collections.ExtendedProperties org.apache.commons.collections.ExtendedProperties.convertProperties(java.util.Properties)
*convertProperties(java.util.Properties p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.ExtendedProperties convertProperties(java.util.Properties p0){
	return org.apache.commons.collections.ExtendedProperties.convertProperties(p0);
}
/**
*{@link com.google.common.collect.Maps#fromProperties(java.util.Properties)}
*@see com.google.common.collect.Maps#fromProperties(java.util.Properties)
*<code>public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> com.google.common.collect.Maps.fromProperties(java.util.Properties)
*fromProperties(java.util.Properties p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties p0){
	return com.google.common.collect.Maps.fromProperties(p0);
}
/**
*{@link org.apache.commons.crypto.utils.Utils#getCipherInstance(java.lang.String,java.util.Properties)}
*@see org.apache.commons.crypto.utils.Utils#getCipherInstance(java.lang.String,java.util.Properties)
*<code>public static org.apache.commons.crypto.cipher.CryptoCipher org.apache.commons.crypto.utils.Utils.getCipherInstance(java.lang.String,java.util.Properties) throws java.io.IOException
*getCipherInstance(java.lang.String p0,java.util.Properties p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.crypto.cipher.CryptoCipher getCipherInstance(java.lang.String p0,java.util.Properties p1) throws java.io.IOException{
	return org.apache.commons.crypto.utils.Utils.getCipherInstance(p0,p1);
}
/**
*{@link org.apache.commons.crypto.cipher.CryptoCipherFactory#getCryptoCipher(java.lang.String,java.util.Properties)}
*@see org.apache.commons.crypto.cipher.CryptoCipherFactory#getCryptoCipher(java.lang.String,java.util.Properties)
*<code>public static org.apache.commons.crypto.cipher.CryptoCipher org.apache.commons.crypto.cipher.CryptoCipherFactory.getCryptoCipher(java.lang.String,java.util.Properties) throws java.security.GeneralSecurityException
*getCryptoCipher(java.lang.String p0,java.util.Properties p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.crypto.cipher.CryptoCipher getCryptoCipher(java.lang.String p0,java.util.Properties p1) throws java.security.GeneralSecurityException{
	return org.apache.commons.crypto.cipher.CryptoCipherFactory.getCryptoCipher(p0,p1);
}
/**
*{@link org.apache.commons.crypto.random.CryptoRandomFactory#getCryptoRandom(java.util.Properties)}
*@see org.apache.commons.crypto.random.CryptoRandomFactory#getCryptoRandom(java.util.Properties)
*<code>public static org.apache.commons.crypto.random.CryptoRandom org.apache.commons.crypto.random.CryptoRandomFactory.getCryptoRandom(java.util.Properties) throws java.security.GeneralSecurityException
*getCryptoRandom(java.util.Properties p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.crypto.random.CryptoRandom getCryptoRandom(java.util.Properties p0) throws java.security.GeneralSecurityException{
	return org.apache.commons.crypto.random.CryptoRandomFactory.getCryptoRandom(p0);
}
/**
*{@link org.apache.commons.crypto.utils.Utils#getDefaultProperties()}
*@see org.apache.commons.crypto.utils.Utils#getDefaultProperties()
*<code>public static java.util.Properties org.apache.commons.crypto.utils.Utils.getDefaultProperties()
*getDefaultProperties()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties getDefaultProperties(){
	return org.apache.commons.crypto.utils.Utils.getDefaultProperties();
}
/**
*{@link org.apache.commons.crypto.utils.Utils#getProperties(java.util.Properties)}
*@see org.apache.commons.crypto.utils.Utils#getProperties(java.util.Properties)
*<code>public static java.util.Properties org.apache.commons.crypto.utils.Utils.getProperties(java.util.Properties)
*getProperties(java.util.Properties p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties getProperties(java.util.Properties p0){
	return org.apache.commons.crypto.utils.Utils.getProperties(p0);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#getSystemEnvVars()}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#getSystemEnvVars()
*<code>public static java.util.Properties org.codehaus.plexus.util.cli.CommandLineUtils.getSystemEnvVars() throws java.io.IOException
*getSystemEnvVars()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties getSystemEnvVars() throws java.io.IOException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.getSystemEnvVars();
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#getSystemEnvVars(boolean)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#getSystemEnvVars(boolean)
*<code>public static java.util.Properties org.codehaus.plexus.util.cli.CommandLineUtils.getSystemEnvVars(boolean) throws java.io.IOException
*getSystemEnvVars(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties getSystemEnvVars(boolean p0) throws java.io.IOException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.getSystemEnvVars(p0);
}
/**
*{@link org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.InputStream)}
*@see org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.InputStream)
*<code>public static java.util.Properties org.codehaus.plexus.util.PropertyUtils.loadProperties(java.io.InputStream) throws java.io.IOException
*loadProperties(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties loadProperties(java.io.InputStream p0) throws java.io.IOException{
	return org.codehaus.plexus.util.PropertyUtils.loadProperties(p0);
}
/**
*{@link org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.File)}
*@see org.codehaus.plexus.util.PropertyUtils#loadProperties(java.io.File)
*<code>public static java.util.Properties org.codehaus.plexus.util.PropertyUtils.loadProperties(java.io.File) throws java.io.IOException
*loadProperties(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties loadProperties(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.PropertyUtils.loadProperties(p0);
}
/**
*{@link org.codehaus.plexus.util.PropertyUtils#loadProperties(java.net.URL)}
*@see org.codehaus.plexus.util.PropertyUtils#loadProperties(java.net.URL)
*<code>public static java.util.Properties org.codehaus.plexus.util.PropertyUtils.loadProperties(java.net.URL) throws java.io.IOException
*loadProperties(java.net.URL p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties loadProperties(java.net.URL p0) throws java.io.IOException{
	return org.codehaus.plexus.util.PropertyUtils.loadProperties(p0);
}
/**
*{@link org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Properties)}
*@see org.apache.commons.lang3.text.StrSubstitutor#replace(java.lang.Object,java.util.Properties)
*<code>public static java.lang.String org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object,java.util.Properties)
*replace(java.lang.Object p0,java.util.Properties p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String replace(java.lang.Object p0,java.util.Properties p1){
	return org.apache.commons.lang3.text.StrSubstitutor.replace(p0,p1);
}
/**
*{@link org.apache.commons.collections4.MapUtils#toProperties(java.util.Map<K, V>)}
*@see org.apache.commons.collections4.MapUtils#toProperties(java.util.Map<K, V>)
*<code>public static <K,V> java.util.Properties org.apache.commons.collections4.MapUtils.toProperties(java.util.Map<K, V>)
*toProperties(java.util.Map<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> java.util.Properties toProperties(java.util.Map<K, V> p0){
	return org.apache.commons.collections4.MapUtils.toProperties(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#toProperties(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#toProperties(java.util.Map)
*<code>public static java.util.Properties org.apache.commons.collections.MapUtils.toProperties(java.util.Map)
*toProperties(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties toProperties(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.toProperties(p0);
}
}
