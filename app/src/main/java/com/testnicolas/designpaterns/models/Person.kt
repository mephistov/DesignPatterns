package com.testnicolas.designpaterns.models

class Person(val firstName: String,
             val lastName: String,
             val age: Int,
             val email: String?,
             val phone: String?) {

    data class Builder(
        var firstName: String = "",
        var lastName: String = "",
        var age: Int = 0,
        var email: String? = null,
        var phone: String? = null
    ) {
        fun firstName(firstName: String) = apply { this.firstName = firstName }
        fun lastName(lastName: String) = apply { this.lastName = lastName }
        fun age(age: Int) = apply { this.age = age }
        fun email(email: String?) = apply { this.email = email }
        fun phone(phone: String?) = apply { this.phone = phone }
        fun build() = Person(firstName, lastName, age, email, phone)
    }
}

fun Person.toUserInfo() = UserInfo(
    name = firstName,
    age = age,
    dead = false,
    description = email!!,
    picture = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"
)