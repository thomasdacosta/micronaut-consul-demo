package edu.thomasdacosta

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("edu.thomasdacosta")
		.start()
}

