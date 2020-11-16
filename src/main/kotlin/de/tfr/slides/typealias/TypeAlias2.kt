package de.tfr.slides.`typealias`

import javax.xml.datatype.DatatypeConfigurationException

typealias ExceptionMap = Map<Int, ()->DatatypeConfigurationException>

fun configure( mappings: ExceptionMap){
    mappings[0]?.invoke()
}