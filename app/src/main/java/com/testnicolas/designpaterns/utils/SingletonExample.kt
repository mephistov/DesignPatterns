package com.testnicolas.designpaterns.singletons

import com.testnicolas.designpaterns.models.UserInfo

object Utils {

    fun fillDataExample():List<UserInfo>{
        return  listOf(
            UserInfo(
                name = "Superman",
                age = 0,
                dead = false,
                description = "Superman is a superhero who appears in American comic books published by DC Comics",
                picture = "https://www.infobae.com/new-resizer/6SmmqY_FeigtOtZyNJwXKOrshcQ=/265x149/filters:format(webp):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/BHQMVU4L5JA3FEYOIVOYMAE6ZA.jpg"
            ),
            UserInfo(
                name = "Batman",
                age = 0,
                dead = false,
                description = "Batman is a superhero appearing in American comic books published by DC Comics",
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Batman_%28black_background%29.jpg/402px-Batman_%28black_background%29.jpg"
            ),
            UserInfo(
                name = "Flash",
                age = 0,
                dead = false,
                description = "The Flash (or simply Flash) is the name of several superheroes appearing in American comic books published by DC Comics",
                picture = "https://upload.wikimedia.org/wikipedia/en/e/ed/The_Flash_Family.jpg"
            )
        )
    }
}