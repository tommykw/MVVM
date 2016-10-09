package com.example

import tornadofx.App
import tornadofx.importStylesheet
import tornadofx.reloadStylesheetsOnFocus

class LoginApp : App() {
    override val primaryView = LoginScreen::class

    init {
        importStylesheet(LoginStyle::class)
        reloadStylesheetsOnFocus()
    }
}