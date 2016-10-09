package com.example

import javafx.scene.layout.VBox
import tornadofx.*

class LoginScreen : View() {
    override val root = VBox()

    init {
        title = "Login"
        with (root) {
            addClass(LoginStyle.wrapper)
            hbox {
                label("Username")
                textfield()
            }
            hbox {
                label("Password")
                passwordfield()
            }
            hbox {
                button("Login")
            }

            children.addClass(LoginStyle.row)
        }
    }
}