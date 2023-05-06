package com.loda

/**
 * @Author loda
 * @Date 2023/2/17 19:40
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object CaseIf {
	def main(args: Array[String]): Unit = {
		val num = 16
		val res = num match {
			case a: Int if a >= 0 && a <= 3 => println("0-3")
			case a: Int if a >= 4 && a <= 8 => println("4-8")
			case _ => println("not match")
		}
	}
}
