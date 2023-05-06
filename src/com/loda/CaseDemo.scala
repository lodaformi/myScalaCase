package com.loda

/**
 * @Author loda
 * @Date 2023/2/17 19:20
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object CaseDemo {
	def main(args: Array[String]): Unit = {
		val str = "hello"
		val res = str match {
			case "zookeeper" => "ZOOKEEPER"
			case "hadoop" => "HADOOP"
			//最好有case _处理都不匹配的情况，否则在都不匹配的时候，程序报错MatchError
			case _ => "what?"
		}
		println(res)
	}
}
