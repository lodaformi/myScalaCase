package com.loda.myImplicits

import java.io.File
import scala.io.Source

/**
 * 隐式转换-自动导入
 */
object ImplicitDemo02 {
	// 创建`RichFile`类，提供 read 方法，用于将文件内容读取为字符串
	class RichFile(file: File) {
		def read(): String = Source.fromFile(file).mkString
	}

	def main(args: Array[String]): Unit = {
		// 自动导入隐式转换
		// 定义一个隐式转换方法，将`File`隐式转换为`RichFile`对象
		implicit def file2RichFile(file: File): RichFile = new RichFile(file)

		// 创建一个`File`类的对象，导入隐式转换，调用`File`的`read`方法
		val file = new File("./data/1.txt")
		println(file.read())
	}
}