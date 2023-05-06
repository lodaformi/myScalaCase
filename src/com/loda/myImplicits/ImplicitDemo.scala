package com.loda.myImplicits

import java.io.File
import scala.io.Source

/**
 * @Author loda
 * @Date 2023/2/19 17:44
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object ImplicitDemo {
	class RichFile(file: File) {
		def read(): String = Source.fromFile(file).mkString
	}
	// 在`object`单例对象中定义一个隐式转换方法，将`File`隐式转换为`RichFile`对象
	object ImplicitDemo {
		implicit def file2RichFile(file: File): RichFile = new RichFile(file)
	}
	def main(args: Array[String]): Unit = {
		// 手动导入隐式转换
		import ImplicitDemo.file2RichFile
		// 创建一个`File`类的对象，导入隐式转换，调用`File`的`read`方法
		val file = new File("./data/1.txt")
		println(file.read())
	}
}
