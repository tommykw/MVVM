package com.example

import tornadofx.*

class LoginStyle : Stylesheet() {
    init {
        s(wrapper) {
            s(label) {
                minWidth = 100.px
            }

            padding = box(15.px)

            s(row) {
                padding = box(5.px)
            }
        }
    }

    companion object {
        val wrapper by cssclass()
        val row by cssclass()
    }
}