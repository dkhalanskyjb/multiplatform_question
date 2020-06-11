package sample

actual open class A() {

}

actual open class B() : A() {

}

actual class C() : B() {

}
