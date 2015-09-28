package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class OBJECT_(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("object", consumer, initialAttributes), CommonAttributeGroupFacade {
    var data : String
        get()  = attributeStringString.get(this, "data")
        set(newValue) {attributeStringString.set(this, "data", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var height : String
        get()  = attributeStringString.get(this, "height")
        set(newValue) {attributeStringString.set(this, "height", newValue)}

    var width : String
        get()  = attributeStringString.get(this, "width")
        set(newValue) {attributeStringString.set(this, "width", newValue)}

    var usemap : String
        get()  = attributeStringString.get(this, "usemap")
        set(newValue) {attributeStringString.set(this, "usemap", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var classId : String
        get()  = attributeStringString.get(this, "classid")
        set(newValue) {attributeStringString.set(this, "classid", newValue)}


}
fun OBJECT_.param(name : String? = null, value : String? = null, block : PARAM.() -> Unit = {}) : Unit = PARAM(listOf("name" to name,"value" to value).toAttributesMap(), consumer).visit(block)


open class OL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ol", consumer, initialAttributes), CommonAttributeGroupFacade {
    var start : String
        get()  = attributeStringString.get(this, "start")
        set(newValue) {attributeStringString.set(this, "start", newValue)}

    var reversed : Boolean
        get()  = attributeBooleanTicker.get(this, "reversed")
        set(newValue) {attributeBooleanTicker.set(this, "reversed", newValue)}


}
fun OL.li(classes : String? = null, block : LI.() -> Unit = {}) : Unit = LI(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)


open class OPTGROUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("optgroup", consumer, initialAttributes), CommonAttributeGroupFacade {
    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var label : String
        get()  = attributeStringString.get(this, "label")
        set(newValue) {attributeStringString.set(this, "label", newValue)}


}
fun OPTGROUP.option(classes : String? = null, block : OPTION.() -> Unit = {}) : Unit = OPTION(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)
fun OPTGROUP.option(classes : String? = null, content : String = "") : Unit = OPTION(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit({+content})


open class OPTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("option", consumer, initialAttributes), CommonAttributeGroupFacade {
    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var selected : Boolean
        get()  = attributeBooleanTicker.get(this, "selected")
        set(newValue) {attributeBooleanTicker.set(this, "selected", newValue)}

    var label : String
        get()  = attributeStringString.get(this, "label")
        set(newValue) {attributeStringString.set(this, "label", newValue)}

    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}


}

open class OUTPUT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("output", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {
    var for_ : String
        get()  = attributeStringString.get(this, "for")
        set(newValue) {attributeStringString.set(this, "for", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}


}

