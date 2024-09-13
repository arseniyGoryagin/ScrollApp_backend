package com.example.services.UserService

import com.example.model.User



private val names = listOf(
    "Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack",
    "Karen", "Leo", "Mona", "Nate", "Olivia", "Paul", "Quincy", "Rachel", "Sam", "Tina",
    "Uma", "Victor", "Wendy", "Xander", "Yara", "Zane", "Liam", "Emma", "Noah", "Sophia"
)


private  val usernames = listOf(
    "user001", "coolCat", "nightOwl", "supernova", "skyWalker", "mysticCoder", "alphaWolf", "betaBear",
    "charmer123", "silentKnight", "dreamChaser", "heroicMind", "urbanNinja", "digitalGhost",
    "pixelPioneer", "quantumLeap", "wildFox", "shadowHunter", "skyHigh", "codeWizard",
    "loneWolf", "stellarStar", "moonlight", "firestorm", "aquaMarine", "stormBringer",
    "codeMaster", "happyCamper", "bluePhoenix", "spaceRanger"
)



class UserServiceImpl  : UserService{

    override fun generateUser(): User {

        val username : String = usernames.random()
        val name : String = names.random()
        val userId : Long=  (0..1000).random().toLong()

        return User(
            username = username,
            name = name,
            userId = userId
        )



    }
}