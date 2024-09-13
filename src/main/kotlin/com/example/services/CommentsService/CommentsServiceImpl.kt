package com.example.CommentsService

import com.example.model.Comment



private val comments = listOf(
    "This is an amazing post! Thanks for sharing.",
    "I completely agree with you on this topic.",
    "Wow, this is so insightful and thought-provoking.",
    "I love the way you’ve articulated this point.",
    "Great post! I learned a lot from reading this.",
    "I appreciate the time you took to write this.",
    "This is exactly what I needed to read today.",
    "Fantastic content! Keep up the great work.",
    "I found this post very helpful and informative.",
    "Your perspective on this issue is very enlightening.",
    "I couldn’t agree more with what you’ve said.",
    "Such a well-written post! I’m sharing this with my friends.",
    "You’ve made some excellent points here.",
    "This post has given me a lot to think about.",
    "I’m impressed with how well you’ve covered this topic.",
    "This is a really great read. Thanks for sharing!",
    "You’ve provided some valuable insights here.",
    "I enjoyed reading this post very much.",
    "Your analysis of the topic is spot on.",
    "I found your arguments very compelling.",
    "This is such a relevant and timely post.",
    "You’ve addressed all the key points in a clear way.",
    "Great job on this post! I learned something new.",
    "I really appreciate the detail and effort you’ve put into this.",
    "This is an excellent post. Well done!",
    "Your writing style is engaging and informative.",
    "This post resonates with me on many levels.",
    "I’m grateful for the perspective you’ve shared here.",
    "This post is both informative and entertaining.",
    "You’ve made some great observations here.",
    "This is a very well-researched and thought-out post.",
    "Thanks for the insights. This was a great read!",
    "You’ve done a fantastic job covering this subject.",
    "I enjoyed the depth of analysis in this post.",
    "This post has definitely given me some new ideas."
)



class CommentsServiceImpl : CommentsService {
    override fun generateComment(): Comment {
        return Comment(comments.random())
    }
}