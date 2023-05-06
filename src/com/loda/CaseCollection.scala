package com.loda

/**
 * @Author loda
 * @Date 2023/2/17 19:49
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object CaseCollection {
	def main(args: Array[String]): Unit = {
		// 只包含 5 一个元素的数组
		val arr1 = Array(5)
		// 只包含两个元素的数组
		val arr2 = Array(11, 22)
		// 以 5 开头的数组，长度为 3
		val arr3 = Array(5, 6, 7)
		// 以 5 结尾的数组，长度为 3
		val arr4 = Array(1, 2, 5)
		// 以 5 开头的数组，数量不固定
		val arr5 = Array(5, 1, 2, 3, 4, 5)
		val arr6 = Array(6, 1, 2, 3, 4, 5)

val res = arr6 match {
	case Array(5) => println("匹配数组：只包含 5 一个元素的数组")
	case Array(x, y) => println(s"匹配数组：只包含两个元素的数组，元素分别为：${x}，${y}")
	case Array(5, x, y) => println(s"匹配数组：以 5 开头的数组，长度为 3，后两个元素分别为：${x}，${y}")
	case Array(x, y, 5) => println(s"匹配数组：以 5 结尾的数组，长度为 3，前两个元素分别为：${x}，${y}")
	case Array(5, _*) => println("匹配数组：以 5 开头的数组，数量不固定")
	case _ => println("未匹配")
}
	}
}
