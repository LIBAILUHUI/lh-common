package com.lh.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FileUtilTest {

	/**
	 * 
	 * @Title: testReadFileByLine 
	 * @Description: 根据路径按行读取文本文件
	 * @return: void
	 */
	@Test
	public void testReadFileByLine() {
		String filename = FileUtil.class.getClassLoader().getResource("test.txt").getFile();
		System.out.println(filename);
		FileUtil.ReadFileByLine(filename);
	}

	/**
	 * 
	 * @Title: testReadStream 
	 * @Description: 读取InputStream放入集合
	 * @return: void
	 */
	@Test
	public void testReadStream() {
		InputStream inputStream = FileUtilTest.class.getClassLoader().getResourceAsStream("test.txt");
		List<String> read = FileUtil.read(inputStream);
		for (String string : read) {
			System.out.println(string);
		}
	}
	
	/**
	 * 
	 * @Title: testReadFilePath 
	 * @Description: 根据文件的地址读取文件放入集合中
	 * @return: void
	 */
	@Test
	public void testReadFilePath() {
		String filePath = FileUtilTest.class.getClassLoader().getResource("test.txt").getFile();
		List<String> read = FileUtil.read(filePath);
		for (String string : read) {
			System.out.println(string);
		}
	}
	
	/**
	 * 
	 * @Title: testReadFile 
	 * @Description: 读取文件内容放入集合
	 * @return: void
	 */
	@Test
	public void testReadFile() {
		File file = new File("e:/test.txt");
		//这个文件在test/resources里
		InputStream resourceAsStream = this.getClass().getResourceAsStream("/test.txt");
		List<String> read2 = FileUtil.read(resourceAsStream);
		System.out.println(read2);
		
		List<String> read = FileUtil.read(file);
		System.out.println(read);
		String string = "abcdef";
		System.out.println(string.length());
	}
	
}
