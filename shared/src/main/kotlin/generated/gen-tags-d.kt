package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class DATALIST(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("datalist", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}
fun DATALIST.option(classes : String? = null, block : OPTION.() -> Unit = {}) : Unit = OPTION(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)
fun DATALIST.option(classes : String? = null, content : String = "") : Unit = OPTION(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit({+content})


open class DD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dd", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

open class DEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("del", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {
    var cite : String
        get()  = attributeStringString.get(this, "cite")
        set(newValue) {attributeStringString.set(this, "cite", newValue)}

    var dateTime : String
        get()  = attributeStringString.get(this, "datetime")
        set(newValue) {attributeStringString.set(this, "datetime", newValue)}


}

open class DETAILS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("details", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {
    var open : Boolean
        get()  = attributeBooleanTicker.get(this, "open")
        set(newValue) {attributeBooleanTicker.set(this, "open", newValue)}


}
fun DETAILS.legEnd(classes : String? = null, block : LEGEND.() -> Unit = {}) : Unit = LEGEND(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)


open class DFN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dfn", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

open class DIALOG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dialog", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

open class DIV(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("div", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

open class DL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dl", consumer, initialAttributes), CommonAttributeGroupFacade {

}
fun DL.dd(classes : String? = null, block : DD.() -> Unit = {}) : Unit = DD(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)

fun DL.dt(classes : String? = null, block : DT.() -> Unit = {}) : Unit = DT(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)


open class DT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dt", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

