// !LANGUAGE: +MultiPlatformProjects
// MODULE: m1-common
// FILE: common.kt

interface A

class B : A
expect class Foo(b: B) : <!INHERITANCE_BY_DELEGATION_IN_EXPECT_CLASS!>A by b<!>

expect class Bar : <!INHERITANCE_BY_DELEGATION_IN_EXPECT_CLASS!>A by B()<!>