package com.loda

/**
 * @Author loda
 * @Date 2023/2/17 19:33
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object CaseType {
	def main(args: Array[String]): Unit = {
		val a:Any = true
		val res = a match {
			case a:String => println("STRING")
			case a:Int => println("INT")
			case a:Float => println("FLOAT")
			case a:Double => println("DOUBLE")
			case _ => println("TYPE NOT KNOW")
		}
	}
}
