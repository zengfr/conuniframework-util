package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileUtil{ 
/**
*public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File) throws java.io.IOException
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0) throws java.io.IOException{
	return com.google.common.io.Files.map(p0);
}
/**
*public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File,java.nio.channels.FileChannel$MapMode,long) throws java.io.FileNotFoundException,java.io.IOException
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0,MapMode p1,long p2) throws java.io.FileNotFoundException,java.io.IOException{
	return com.google.common.io.Files.map(p0,p1,p2);
}
/**
*public static java.nio.MappedByteBuffer com.google.common.io.Files.map(java.io.File,java.nio.channels.FileChannel$MapMode) throws java.io.IOException
*/ 
public static java.nio.MappedByteBuffer map(java.io.File p0,MapMode p1) throws java.io.IOException{
	return com.google.common.io.Files.map(p0,p1);
}
/**
*public static void com.google.common.io.Files.append(java.lang.CharSequence,java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 com.google.common.io.Files.append(p0,p1,p2);
}
/**
*public static void com.google.common.io.Files.write(byte[],java.io.File) throws java.io.IOException
*/ 
public static void write(byte[] p0,java.io.File p1) throws java.io.IOException{
	 com.google.common.io.Files.write(p0,p1);
}
/**
*public static void com.google.common.io.Files.write(java.lang.CharSequence,java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 com.google.common.io.Files.write(p0,p1,p2);
}
/**
*public static void com.google.common.io.Files.copy(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void copy(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 com.google.common.io.Files.copy(p0,p1);
}
/**
*public static void com.google.common.io.Files.copy(java.io.File,java.nio.charset.Charset,java.lang.Appendable) throws java.io.IOException
*/ 
public static void copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2) throws java.io.IOException{
	 com.google.common.io.Files.copy(p0,p1,p2);
}
/**
*public static void com.google.common.io.Files.copy(java.io.File,java.io.OutputStream) throws java.io.IOException
*/ 
public static void copy(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
	 com.google.common.io.Files.copy(p0,p1);
}
/**
*public static <T> T com.google.common.io.Files.readBytes(java.io.File,com.google.common.io.ByteProcessor<T>) throws java.io.IOException
*/ 
public static <T> T readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
	return com.google.common.io.Files.readBytes(p0,p1);
}
/**
*public static byte[] com.google.common.io.Files.toByteArray(java.io.File) throws java.io.IOException
*/ 
public static byte[] toByteArray(java.io.File p0) throws java.io.IOException{
	return com.google.common.io.Files.toByteArray(p0);
}
/**
*public static com.google.common.io.CharSink com.google.common.io.Files.asCharSink(java.io.File,java.nio.charset.Charset,com.google.common.io.FileWriteMode...)
*/ 
public static com.google.common.io.CharSink asCharSink(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.FileWriteMode... p2){
	return com.google.common.io.Files.asCharSink(p0,p1,p2);
}
/**
*public static com.google.common.io.CharSource com.google.common.io.Files.asCharSource(java.io.File,java.nio.charset.Charset)
*/ 
public static com.google.common.io.CharSource asCharSource(java.io.File p0,java.nio.charset.Charset p1){
	return com.google.common.io.Files.asCharSource(p0,p1);
}
/**
*public static java.lang.String com.google.common.io.Files.readFirstLine(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static java.lang.String readFirstLine(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return com.google.common.io.Files.readFirstLine(p0,p1);
}
/**
*public static java.util.List<java.lang.String> com.google.common.io.Files.readLines(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return com.google.common.io.Files.readLines(p0,p1);
}
/**
*public static <T> T com.google.common.io.Files.readLines(java.io.File,java.nio.charset.Charset,com.google.common.io.LineProcessor<T>) throws java.io.IOException
*/ 
public static <T> T readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
	return com.google.common.io.Files.readLines(p0,p1,p2);
}
/**
*public static java.io.BufferedReader com.google.common.io.Files.newReader(java.io.File,java.nio.charset.Charset) throws java.io.FileNotFoundException
*/ 
public static java.io.BufferedReader newReader(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
	return com.google.common.io.Files.newReader(p0,p1);
}
/**
*public static java.io.BufferedWriter com.google.common.io.Files.newWriter(java.io.File,java.nio.charset.Charset) throws java.io.FileNotFoundException
*/ 
public static java.io.BufferedWriter newWriter(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
	return com.google.common.io.Files.newWriter(p0,p1);
}
/**
*public static void com.google.common.io.Files.createParentDirs(java.io.File) throws java.io.IOException
*/ 
public static void createParentDirs(java.io.File p0) throws java.io.IOException{
	 com.google.common.io.Files.createParentDirs(p0);
}
/**
*public static void com.google.common.io.Files.move(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void move(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 com.google.common.io.Files.move(p0,p1);
}
/**
*public static void com.google.common.io.Files.touch(java.io.File) throws java.io.IOException
*/ 
public static void touch(java.io.File p0) throws java.io.IOException{
	 com.google.common.io.Files.touch(p0);
}
/**
*public static com.google.common.io.ByteSink com.google.common.io.Files.asByteSink(java.io.File,com.google.common.io.FileWriteMode...)
*/ 
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
	return com.google.common.io.Files.asByteSink(p0,p1);
}
/**
*public static com.google.common.io.ByteSource com.google.common.io.Files.asByteSource(java.io.File)
*/ 
public static com.google.common.io.ByteSource asByteSource(java.io.File p0){
	return com.google.common.io.Files.asByteSource(p0);
}
/**
*public static java.io.File com.google.common.io.Files.createTempDir()
*/ 
public static java.io.File createTempDir(){
	return com.google.common.io.Files.createTempDir();
}
/**
*public static void org.apache.commons.io.FileCleaner.track(java.io.File,java.lang.Object)
*/ 
public static void track(java.io.File p0,java.lang.Object p1){
	 org.apache.commons.io.FileCleaner.track(p0,p1);
}
/**
*public static void org.apache.commons.io.FileCleaner.track(java.io.File,java.lang.Object,org.apache.commons.io.FileDeleteStrategy)
*/ 
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
	 org.apache.commons.io.FileCleaner.track(p0,p1,p2);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1){
	return org.apache.commons.io.input.Tailer.create(p0,p1);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File,boolean)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File)
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0);
}
/**
*public static java.io.File org.apache.commons.io.FileUtils.toFile(java.net.URL)
*/ 
public static java.io.File toFile(java.net.URL p0){
	return org.apache.commons.io.FileUtils.toFile(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.contentEquals(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static boolean contentEquals(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.contentEquals(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String,boolean) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,boolean) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*public static java.io.File org.apache.commons.io.FileUtils.getFile(java.lang.String...)
*/ 
public static java.io.File getFile(java.lang.String... p0){
	return org.apache.commons.io.FileUtils.getFile(p0);
}
/**
*public static java.io.File org.apache.commons.io.FileUtils.getFile(java.io.File,java.lang.String...)
*/ 
public static java.io.File getFile(java.io.File p0,java.lang.String... p1){
	return org.apache.commons.io.FileUtils.getFile(p0,p1);
}
/**
*public static java.util.zip.Checksum org.apache.commons.io.FileUtils.checksum(java.io.File,java.util.zip.Checksum) throws java.io.IOException
*/ 
public static java.util.zip.Checksum checksum(java.io.File p0,java.util.zip.Checksum p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.checksum(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,java.lang.String) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,boolean) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3,p4);
}
/**
*public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String) throws java.io.IOException
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File,java.lang.String) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0,p1);
}
/**
*public static java.util.List<java.lang.String> org.apache.commons.io.FileUtils.readLines(java.io.File) throws java.io.IOException
*/ 
public static java.util.List<java.lang.String> readLines(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readLines(p0);
}
/**
*public static java.io.FileInputStream org.apache.commons.io.FileUtils.openInputStream(java.io.File) throws java.io.IOException
*/ 
public static java.io.FileInputStream openInputStream(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openInputStream(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.waitFor(java.io.File,int)
*/ 
public static boolean waitFor(java.io.File p0,int p1){
	return org.apache.commons.io.FileUtils.waitFor(p0,p1);
}
/**
*public static long org.apache.commons.io.FileUtils.sizeOfDirectory(java.io.File)
*/ 
public static long sizeOfDirectory(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOfDirectory(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.forceDelete(java.io.File) throws java.io.IOException
*/ 
public static void forceDelete(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.forceDelete(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String) throws java.io.IOException
*/ 
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.FileUtils.lineIterator(java.io.File) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.lineIterator(p0);
}
/**
*public static org.apache.commons.io.LineIterator org.apache.commons.io.FileUtils.lineIterator(java.io.File,java.lang.String) throws java.io.IOException
*/ 
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.lineIterator(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.forceMkdir(java.io.File) throws java.io.IOException
*/ 
public static void forceMkdir(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.forceMkdir(p0);
}
/**
*public static java.io.File org.apache.commons.io.FileUtils.getTempDirectory()
*/ 
public static java.io.File getTempDirectory(){
	return org.apache.commons.io.FileUtils.getTempDirectory();
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*public static java.io.File org.apache.commons.io.FileUtils.getUserDirectory()
*/ 
public static java.io.File getUserDirectory(){
	return org.apache.commons.io.FileUtils.getUserDirectory();
}
/**
*public static void org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,boolean) throws java.io.IOException
*/ 
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFile(p0,p1,p2);
}
/**
*public static long org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.OutputStream) throws java.io.IOException
*/ 
public static long copyFile(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.copyFile(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void copyFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFile(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter) throws java.io.IOException
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean) throws java.io.IOException
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1);
}
/**
*public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File,boolean) throws java.io.IOException
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0,p1);
}
/**
*public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File) throws java.io.IOException
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File,int,int) throws java.io.IOException
*/ 
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyURLToFile(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File) throws java.io.IOException
*/ 
public static void copyURLToFile(java.net.URL p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyURLToFile(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyToFile(java.io.InputStream,java.io.File) throws java.io.IOException
*/ 
public static void copyToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyToFile(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.deleteDirectory(java.io.File) throws java.io.IOException
*/ 
public static void deleteDirectory(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.deleteDirectory(p0);
}
/**
*public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.listFilesAndDirs(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.moveToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/ 
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveToDirectory(p0,p1,p2);
}
/**
*public static long org.apache.commons.io.FileUtils.sizeOf(java.io.File)
*/ 
public static long sizeOf(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOf(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.moveFile(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void moveFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveFile(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isSymlink(java.io.File) throws java.io.IOException
*/ 
public static boolean isSymlink(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.isSymlink(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.forceMkdirParent(java.io.File) throws java.io.IOException
*/ 
public static void forceMkdirParent(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.forceMkdirParent(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.io.File)
*/ 
public static boolean isFileOlder(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,long)
*/ 
public static boolean isFileOlder(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.util.Date)
*/ 
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.moveDirectory(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void moveDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveDirectory(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.cleanDirectory(java.io.File) throws java.io.IOException
*/ 
public static void cleanDirectory(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.cleanDirectory(p0);
}
/**
*public static java.lang.String org.apache.commons.io.FileUtils.readFileToString(java.io.File,java.lang.String) throws java.io.IOException
*/ 
public static java.lang.String readFileToString(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToString(p0,p1);
}
/**
*public static java.lang.String org.apache.commons.io.FileUtils.readFileToString(java.io.File) throws java.io.IOException
*/ 
public static java.lang.String readFileToString(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToString(p0);
}
/**
*public static java.lang.String org.apache.commons.io.FileUtils.readFileToString(java.io.File,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static java.lang.String readFileToString(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToString(p0,p1);
}
/**
*public static long org.apache.commons.io.FileUtils.checksumCRC32(java.io.File) throws java.io.IOException
*/ 
public static long checksumCRC32(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.checksumCRC32(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.util.Date)
*/ 
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,long)
*/ 
public static boolean isFileNewer(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.io.File)
*/ 
public static boolean isFileNewer(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyDirectoryToDirectory(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void copyDirectoryToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectoryToDirectory(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static void copyFileToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFileToDirectory(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/ 
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFileToDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.moveDirectoryToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/ 
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.copyInputStreamToFile(java.io.InputStream,java.io.File) throws java.io.IOException
*/ 
public static void copyInputStreamToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyInputStreamToFile(p0,p1);
}
/**
*public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)
*/ 
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
	return org.apache.commons.io.FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int) throws java.io.IOException
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int,boolean) throws java.io.IOException
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
/**
*public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],boolean) throws java.io.IOException
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[]) throws java.io.IOException
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.moveFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*/ 
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveFileToDirectory(p0,p1,p2);
}
/**
*public static byte[] org.apache.commons.io.FileUtils.readFileToByteArray(java.io.File) throws java.io.IOException
*/ 
public static byte[] readFileToByteArray(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.readFileToByteArray(p0);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String) throws java.io.IOException
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset) throws java.io.IOException
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String) throws java.io.IOException
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean) throws java.io.IOException
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,boolean) throws java.io.IOException
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*public static void org.apache.commons.io.FileUtils.forceDeleteOnExit(java.io.File) throws java.io.IOException
*/ 
public static void forceDeleteOnExit(java.io.File p0) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.forceDeleteOnExit(p0);
}
/**
*public static java.math.BigInteger org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(java.io.File)
*/ 
public static java.math.BigInteger sizeOfDirectoryAsBigInteger(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(p0);
}
/**
*public static java.math.BigInteger org.apache.commons.io.FileUtils.sizeOfAsBigInteger(java.io.File)
*/ 
public static java.math.BigInteger sizeOfAsBigInteger(java.io.File p0){
	return org.apache.commons.io.FileUtils.sizeOfAsBigInteger(p0);
}
/**
*public static boolean org.apache.commons.io.FileUtils.directoryContains(java.io.File,java.io.File) throws java.io.IOException
*/ 
public static boolean directoryContains(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.directoryContains(p0,p1);
}
/**
*public static boolean org.apache.commons.io.FileUtils.deleteQuietly(java.io.File)
*/ 
public static boolean deleteQuietly(java.io.File p0){
	return org.apache.commons.io.FileUtils.deleteQuietly(p0);
}
/**
*public static java.io.File org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir()
*/ 
public static java.io.File getJavaIoTmpDir(){
	return org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir();
}
/**
*public static java.io.File org.apache.commons.lang3.SystemUtils.getJavaHome()
*/ 
public static java.io.File getJavaHome(){
	return org.apache.commons.lang3.SystemUtils.getJavaHome();
}
/**
*public static java.io.File org.apache.commons.lang3.SystemUtils.getUserDir()
*/ 
public static java.io.File getUserDir(){
	return org.apache.commons.lang3.SystemUtils.getUserDir();
}
/**
*public static java.io.File org.apache.commons.lang3.SystemUtils.getUserHome()
*/ 
public static java.io.File getUserHome(){
	return org.apache.commons.lang3.SystemUtils.getUserHome();
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterable it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[],java.io.File) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(boolean[][],java.io.File) throws java.io.IOException
*/ 
public static void storeBooleans(boolean[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[][],java.io.File) throws java.io.IOException
*/ 
public static void storeShorts(short[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeShorts(short[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[],java.io.File) throws java.io.IOException
*/ 
public static void storeShorts(short[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(short[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeShorts(short[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterable it.unimi.dsi.fastutil.io.BinIO.asShortIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterable(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[],int,int) throws java.io.IOException
*/ 
public static int loadChars(java.io.File p0,char[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[]) throws java.io.IOException
*/ 
public static int loadChars(java.io.File p0,char[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[][],long,long) throws java.io.IOException
*/ 
public static long loadChars(java.io.File p0,char[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File,char[][]) throws java.io.IOException
*/ 
public static long loadChars(java.io.File p0,char[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0,p1);
}
/**
*public static char[] it.unimi.dsi.fastutil.io.BinIO.loadChars(java.io.File) throws java.io.IOException
*/ 
public static char[] loadChars(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadChars(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterable it.unimi.dsi.fastutil.io.BinIO.asCharIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterable(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[][],long,long) throws java.io.IOException
*/ 
public static long loadInts(java.io.File p0,int[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*public static int[] it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File) throws java.io.IOException
*/ 
public static int[] loadInts(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[][]) throws java.io.IOException
*/ 
public static long loadInts(java.io.File p0,int[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[],int,int) throws java.io.IOException
*/ 
public static int loadInts(java.io.File p0,int[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadInts(java.io.File,int[]) throws java.io.IOException
*/ 
public static int loadInts(java.io.File p0,int[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadInts(p0,p1);
}
/**
*public static short[][] it.unimi.dsi.fastutil.io.BinIO.loadShortsBig(java.io.File) throws java.io.IOException
*/ 
public static short[][] loadShortsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShortsBig(p0);
}
/**
*public static long[][] it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(java.io.File) throws java.io.IOException
*/ 
public static long[][] loadLongsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongsBig(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterable it.unimi.dsi.fastutil.io.BinIO.asLongIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterable(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[][],java.io.File) throws java.io.IOException
*/ 
public static void storeFloats(float[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[],java.io.File) throws java.io.IOException
*/ 
public static void storeFloats(float[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(float[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeFloats(float[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1,p2,p3);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterable it.unimi.dsi.fastutil.io.BinIO.asFloatIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterable(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[][],long,long) throws java.io.IOException
*/ 
public static long loadDoubles(java.io.File p0,double[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[][]) throws java.io.IOException
*/ 
public static long loadDoubles(java.io.File p0,double[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*public static double[] it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File) throws java.io.IOException
*/ 
public static double[] loadDoubles(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[],int,int) throws java.io.IOException
*/ 
public static int loadDoubles(java.io.File p0,double[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadDoubles(java.io.File,double[]) throws java.io.IOException
*/ 
public static int loadDoubles(java.io.File p0,double[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoubles(p0,p1);
}
/**
*public static long[] it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File) throws java.io.IOException
*/ 
public static long[] loadLongs(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[]) throws java.io.IOException
*/ 
public static int loadLongs(java.io.File p0,long[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[],int,int) throws java.io.IOException
*/ 
public static int loadLongs(java.io.File p0,long[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[][],long,long) throws java.io.IOException
*/ 
public static long loadLongs(java.io.File p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadLongs(java.io.File,long[][]) throws java.io.IOException
*/ 
public static long loadLongs(java.io.File p0,long[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadLongs(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[][],java.io.File) throws java.io.IOException
*/ 
public static void storeDoubles(double[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeDoubles(double[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[],java.io.File) throws java.io.IOException
*/ 
public static void storeDoubles(double[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(double[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeObject(java.lang.Object,java.io.File) throws java.io.IOException
*/ 
public static void storeObject(java.lang.Object p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeObject(p0,p1);
}
/**
*public static int[][] it.unimi.dsi.fastutil.io.BinIO.loadIntsBig(java.io.File) throws java.io.IOException
*/ 
public static int[][] loadIntsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadIntsBig(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[],int,int) throws java.io.IOException
*/ 
public static int loadShorts(java.io.File p0,short[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[]) throws java.io.IOException
*/ 
public static int loadShorts(java.io.File p0,short[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[][]) throws java.io.IOException
*/ 
public static long loadShorts(java.io.File p0,short[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1);
}
/**
*public static short[] it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File) throws java.io.IOException
*/ 
public static short[] loadShorts(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadShorts(java.io.File,short[][],long,long) throws java.io.IOException
*/ 
public static long loadShorts(java.io.File p0,short[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadShorts(p0,p1,p2,p3);
}
/**
*public static boolean[][] it.unimi.dsi.fastutil.io.BinIO.loadBooleansBig(java.io.File) throws java.io.IOException
*/ 
public static boolean[][] loadBooleansBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleansBig(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeInts(int[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[],java.io.File) throws java.io.IOException
*/ 
public static void storeInts(int[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeInts(int[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(int[][],java.io.File) throws java.io.IOException
*/ 
public static void storeInts(int[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],java.io.File) throws java.io.IOException
*/ 
public static void storeLongs(long[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeLongs(long[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(long[],java.io.File) throws java.io.IOException
*/ 
public static void storeLongs(long[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[][]) throws java.io.IOException
*/ 
public static long loadBooleans(java.io.File p0,boolean[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[][],long,long) throws java.io.IOException
*/ 
public static long loadBooleans(java.io.File p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*public static boolean[] it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File) throws java.io.IOException
*/ 
public static boolean[] loadBooleans(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[],int,int) throws java.io.IOException
*/ 
public static int loadBooleans(java.io.File p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBooleans(java.io.File,boolean[]) throws java.io.IOException
*/ 
public static int loadBooleans(java.io.File p0,boolean[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBooleans(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[][]) throws java.io.IOException
*/ 
public static long loadFloats(java.io.File p0,float[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*public static float[] it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File) throws java.io.IOException
*/ 
public static float[] loadFloats(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[][],long,long) throws java.io.IOException
*/ 
public static long loadFloats(java.io.File p0,float[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[],int,int) throws java.io.IOException
*/ 
public static int loadFloats(java.io.File p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadFloats(java.io.File,float[]) throws java.io.IOException
*/ 
public static int loadFloats(java.io.File p0,float[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloats(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteIterable it.unimi.dsi.fastutil.io.BinIO.asByteIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterable(p0);
}
/**
*public static float[][] it.unimi.dsi.fastutil.io.BinIO.loadFloatsBig(java.io.File) throws java.io.IOException
*/ 
public static float[][] loadFloatsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadFloatsBig(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterable it.unimi.dsi.fastutil.io.BinIO.asIntIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterable(p0);
}
/**
*public static java.lang.Object it.unimi.dsi.fastutil.io.BinIO.loadObject(java.io.File) throws java.io.IOException,java.lang.ClassNotFoundException
*/ 
public static java.lang.Object loadObject(java.io.File p0) throws java.io.IOException,java.lang.ClassNotFoundException{
	return it.unimi.dsi.fastutil.io.BinIO.loadObject(p0);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[][]) throws java.io.IOException
*/ 
public static long loadBytes(java.io.File p0,byte[][] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[][],long,long) throws java.io.IOException
*/ 
public static long loadBytes(java.io.File p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*public static byte[] it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File) throws java.io.IOException
*/ 
public static byte[] loadBytes(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[]) throws java.io.IOException
*/ 
public static int loadBytes(java.io.File p0,byte[] p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.io.BinIO.loadBytes(java.io.File,byte[],int,int) throws java.io.IOException
*/ 
public static int loadBytes(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytes(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeBytes(byte[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],java.io.File) throws java.io.IOException
*/ 
public static void storeBytes(byte[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[],java.io.File) throws java.io.IOException
*/ 
public static void storeBytes(byte[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(byte[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1,p2,p3);
}
/**
*public static byte[][] it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(java.io.File) throws java.io.IOException
*/ 
public static byte[][] loadBytesBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadBytesBig(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[],java.io.File) throws java.io.IOException
*/ 
public static void storeChars(char[] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[],int,int,java.io.File) throws java.io.IOException
*/ 
public static void storeChars(char[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1,p2,p3);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[][],java.io.File) throws java.io.IOException
*/ 
public static void storeChars(char[][] p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(char[][],long,long,java.io.File) throws java.io.IOException
*/ 
public static void storeChars(char[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1,p2,p3);
}
/**
*public static char[][] it.unimi.dsi.fastutil.io.BinIO.loadCharsBig(java.io.File) throws java.io.IOException
*/ 
public static char[][] loadCharsBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadCharsBig(p0);
}
/**
*public static double[][] it.unimi.dsi.fastutil.io.BinIO.loadDoublesBig(java.io.File) throws java.io.IOException
*/ 
public static double[][] loadDoublesBig(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.loadDoublesBig(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterable it.unimi.dsi.fastutil.io.BinIO.asDoubleIterable(java.io.File)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.io.File p0){
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterable(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
}
